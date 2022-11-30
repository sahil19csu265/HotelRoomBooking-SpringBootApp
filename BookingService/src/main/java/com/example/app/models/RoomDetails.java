package com.example.app.models;

import java.util.List;

import com.example.app.entities.Room;

public class RoomDetails {

	private int generatedBookingID;
	
	private List<Room> availableRooms;
	
	public RoomDetails() {
		super();
	}

	public RoomDetails(int generatedBookingID, List<Room> availableRooms) {
		super();
		this.generatedBookingID = generatedBookingID;
		this.availableRooms = availableRooms;
	}

	public int getGeneratedBookingID() {
		return generatedBookingID;
	}

	public void setGeneratedBookingID(int generatedBookingID) {
		this.generatedBookingID = generatedBookingID;
	}

	public List<Room> getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(List<Room> availableRooms) {
		this.availableRooms = availableRooms;
	}

	@Override
	public String toString() {
		return "RoomDetails [generatedBookingID=" + generatedBookingID + ", availableRooms=" + availableRooms + "]";
	}

	
}
