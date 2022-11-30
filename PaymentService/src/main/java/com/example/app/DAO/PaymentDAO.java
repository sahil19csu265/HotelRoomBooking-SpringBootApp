package com.example.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.entities.Payment;

public interface PaymentDAO extends JpaRepository<Payment,Integer>{

}
