package com.example.app.models;

import com.example.app.entities.Booking;

public class ConfirmationDetails {

	private String message;
	
	private Booking bookingDetails;

	public ConfirmationDetails() {
		super();
	}

	public ConfirmationDetails(String message,Booking bookingDetails) {
		super();
		this.message = message;
		this.bookingDetails = bookingDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Booking getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(Booking bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	@Override
	public String toString() {
		return "ConfirmationDetails [message=" + message +", bookingDetails="+ bookingDetails + "]";
	}
	

}
