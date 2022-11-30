package com.example.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Transaction")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="txn_id")
	private int id;
	
	@Column(name="payment_mode")
	private String mode;
	
	@Column(nullable = false)
	@NotNull
	private int bookingId;
	
	private String upiID;
	
	private String cardNumber;

	public Payment() {
		super();
	}

	public Payment(int id, String mode, int bookingId, String upiID, String cardNumber) {
		super();
		this.id = id;
		this.mode = mode;
		this.bookingId = bookingId;
		this.upiID = upiID;
		this.cardNumber = cardNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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
		return "Payment [id=" + id + ", mode=" + mode + ", bookingId=" + bookingId + ", upiID=" + upiID
				+ ", cardNumber=" + cardNumber + "]";
	}
	
	
}
