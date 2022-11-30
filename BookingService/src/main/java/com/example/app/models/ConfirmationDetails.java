package com.example.app.models;

public class ConfirmationDetails {

	private String message;
	
	private int transactionID;
	
	private int bookingID;
	
	public ConfirmationDetails() {
		super();
	}

	public ConfirmationDetails(String message, int transactionID, int bookingID) {
		super();
		this.message = message;
		this.transactionID = transactionID;
		this.bookingID = bookingID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	@Override
	public String toString() {
		return "ConfirmationDetails [message=" + message + ", transactionID=" + transactionID + ", bookingID="
				+ bookingID + "]";
	} 
	

}
