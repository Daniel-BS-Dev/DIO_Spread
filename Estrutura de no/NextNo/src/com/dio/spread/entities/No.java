package com.dio.spread.entities;

public class No {
	
	private String message;
	private No nextNo;
	
	public No(String message) {
		this.message = message;
		this.nextNo = null;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public No getNextNo() {
		return nextNo;
	}

	public void setNextNo(No nextNo) {
		this.nextNo = nextNo;
	}

	@Override
	public String toString() {
		return "No [message=" + message + "]";
	}
	
	

}
