package com.example.app.models;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PaymentDetails {

	@NotNull(message="Booking Mode cannot be null")
	private String bookingMode;
	
	@Pattern(regexp = "^[\\w\\.\\-_]{10}@[a-zA-Z]{3,}",message="Invalid Upi Id Format")
	private String upiID;
	
	@Length(max=12,message="Invalid Card Format")
	private String cardNumber;
	
	public PaymentDetails() {
		super();
	}

	public PaymentDetails(@NotNull(message = "Booking Mode cannot be null") String bookingMode,
			@Pattern(regexp = "^[\\w\\.\\-_]{3,}@[a-zA-Z]{3,}", message = "Invalid Upi Id Format") String upiID,
			@Length(max = 12, message = "Invalid Card Format") String cardNumber) {
		super();
		this.bookingMode = bookingMode;
		this.upiID = upiID;
		this.cardNumber = cardNumber;
	}

	public String getBookingMode() {
		return bookingMode;
	}

	public void setBookingMode(String bookingMode) {
		this.bookingMode = bookingMode;
	}

	public String getUpiID() {
		return upiID;
	}

	public void setUpiID(String upiID) {
		this.upiID = upiID;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "PaymentDetails [bookingMode=" + bookingMode + ", upiID=" + upiID + ", cardNumber=" + cardNumber
				+"]";
	}
	
	
}
