package com.example.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.app.entities.Booking;

@Repository
public interface BookingDAO extends JpaRepository<Booking,Integer>{

}
