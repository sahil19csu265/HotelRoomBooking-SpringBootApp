package com.example.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.app.entities.Booking;
import com.example.app.entities.Room;
import com.example.app.models.RoomDetails;
import com.example.app.services.BookingService;
import com.example.app.services.RoomService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private RoomService roomService;

	@RequestMapping(path="/initiate",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomDetails> getRoomDetails(@Valid @RequestBody Booking booking){
		int generatedBookingID = bookingService.intiateBooking(booking);
		List<Room> availableRooms = roomService.getRoomDetails();
		RoomDetails roomDetails = new RoomDetails(generatedBookingID,availableRooms);
		return ResponseEntity.ok().body(roomDetails);
	}
	
}