package com.example.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.DAO.BookingDAO;
import com.example.app.DAO.RoomDAO;
import com.example.app.entities.Booking;
import com.example.app.entities.Room;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookingService {

	@Autowired
	private BookingDAO bookingDAO;
	
	public int intiateBooking(Booking booking) {
		return bookingDAO.save(booking).getId();
	}

}
