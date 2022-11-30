package com.example.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.DAO.RoomDAO;
import com.example.app.entities.Room;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RoomService {


	@Autowired
	private RoomDAO roomDAO;
	
	public List<Room> getRoomDetails(int numOfRooms){
		return roomDAO.findAll().subList(0,numOfRooms);
	}
}
