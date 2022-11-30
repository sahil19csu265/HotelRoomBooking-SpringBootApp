package com.example.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.app.entities.Room;

@Repository
public interface RoomDAO extends JpaRepository<Room,Long>{

}
