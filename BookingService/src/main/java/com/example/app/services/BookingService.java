package com.example.app.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.app.DAO.BookingDAO;
import com.example.app.entities.Booking;
import com.example.app.entities.Room;
import com.example.app.exceptions.BookingDetailsNotFoundException;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookingService {

	@Autowired
	private BookingDAO bookingDAO;
	
	public int intiateBooking(Booking booking,List<Room> availableRooms) {
		StringBuilder strBuilder = new StringBuilder();
		availableRooms.stream().forEach(room->{
			strBuilder.append(room.getRoomNumber()+" ");
		});
		int totalPrice = 0;
		for(Room room : availableRooms) {
			totalPrice += room.getPrice();
		}
		// set Room Numbers and Price
		booking.setRoomNumbers(strBuilder.toString());
		booking.setRoomPrice(totalPrice);
		return bookingDAO.save(booking).getId();
	}
	
	public Booking processAndConfirmBooking(int bookingID,int transactionID){
		Optional<Booking> bookingDetails = bookingDAO.findById(bookingID);
		bookingDetails.orElseThrow(()->new BookingDetailsNotFoundException("No Details for bookingId "+bookingID+" found !"));
		
		// set booking date
		bookingDetails.get().setBookedOn(new Date());
		
		// set transaction id
		bookingDetails.get().setTransactionId(transactionID);
		
		return bookingDetails.get();
	}

}
