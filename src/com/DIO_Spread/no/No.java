package com.DIO_Spread.no;

public class No {
	
	private String message;
	private No next;
	
	public No(String message) {
		this.message = message;
		this.next = null;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "No message=" + message + "";
	}
	
	

}
