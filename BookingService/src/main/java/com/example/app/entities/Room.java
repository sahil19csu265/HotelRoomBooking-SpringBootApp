package com.example.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Rooms")
public class Room {
	
	@Id
	private long roomId;

	@Column(name="Room_Number")
	private int roomNumber;
	
	@Column(name="Room_Price")
	private double price;
	
	public Room() {
		
	}
	
	public Room(int roomNumber, double price) {
		super();
		this.roomNumber = roomNumber;
		this.price = price;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNumber=" + roomNumber + ", price=" + price + "]";
	}
	
}
