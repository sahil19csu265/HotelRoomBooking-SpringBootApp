package com.example.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.DAO.PaymentDAO;
import com.example.app.entities.Payment;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PaymentService {

	@Autowired
	private PaymentDAO paymentDAO;
	
	public int completeTransaction(Payment payment) {
		return paymentDAO.save(payment).getId();
	}
}
