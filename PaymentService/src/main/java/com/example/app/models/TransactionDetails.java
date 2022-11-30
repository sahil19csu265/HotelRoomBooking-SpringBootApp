package com.example.app.models;

public class TransactionDetails {

	// Infuture there can be multiple fields that need to send in response
	
	private int transactionID;

	public TransactionDetails() {
		super();
	}

	public TransactionDetails(int transactionID) {
		super();
		this.transactionID = transactionID;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transactionID=" + transactionID + "]";
	}
	
	
}
