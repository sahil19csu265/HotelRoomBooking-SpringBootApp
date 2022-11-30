package com.example.app.entities;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Booking_details")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookingId")
	private int id;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date fromDate;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date toDate;
	
	@Column(nullable = true)
	@Length(min = 12,max = 12,message = "Invalid Aadhar Number Format")
	private String aadharNumber;
	
	private int numOfRooms;
	
	private String roomNumbers;
	
	@Column(nullable=false)
	private int roomPrice;
	
	private int transactionId = 0;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date bookedOn;
	

	public Booking() {
		super();
	}

	public Booking(Date fromDate, Date toDate, String aadharNumber, int numOfRooms, String roomNumbers, int roomPrice,
			int transactionId, Date bookedOn) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.aadharNumber = aadharNumber;
		this.numOfRooms = numOfRooms;
		this.roomNumbers = roomNumbers;
		this.roomPrice = roomPrice;
		this.transactionId = transactionId;
		this.bookedOn = bookedOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public String getRoomNumbers() {
		return roomNumbers;
	}

	public void setRoomNumbers(String roomNumbers) {
		this.roomNumbers = roomNumbers;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getBookedOn() {
		return bookedOn;
	}

	public void setBookedOn(Date bookedOn) {
		this.bookedOn = bookedOn;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", aadharNumber=" + aadharNumber
				+ ", numOfRooms=" + numOfRooms + ", roomNumbers=" + roomNumbers + ", roomPrice=" + roomPrice
				+ ", transactionId=" + transactionId + ", bookedOn=" + bookedOn + "]";
	}

	
}
