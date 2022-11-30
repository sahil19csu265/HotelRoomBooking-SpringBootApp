package com.example.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookingDetailsNotFoundException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;
	private String message;

	public BookingDetailsNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "BookingDetailsNotFoundException [message=" + message + "]";
	}
	
}
