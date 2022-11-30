package com.example.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.DAO.BookingDAO;
import com.example.app.DAO.RoomDAO;
import com.example.app.entities.Booking;
import com.example.app.entities.Room;
import com.example.app.exceptions.BookingDetailsNotFoundException;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookingService {

	@Autowired
	private BookingDAO bookingDAO;
	
	public int intiateBooking(Booking booking) {
		return bookingDAO.save(booking).getId();
	}
	
	public Booking getBookingDetails(int bookingID){
		Optional<Booking> bookingDetails = bookingDAO.findById(bookingID);
		bookingDetails.orElseThrow(()->new BookingDetailsNotFoundException("No Details for bookingId "+bookingID+" found !"));
		return bookingDetails.get();
	}

}
