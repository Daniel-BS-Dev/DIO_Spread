package com.dio.spread.entities;

public class No<T> {
	
	
	private T message;
	private No nextNo;
	
	public No(T message) {
		this.message = message;
		this.nextNo = null;
	}

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}

	public No<T> getNextNo() {
		return nextNo;
	}

	public void setNextNo(No<T> nextNo) {
		this.nextNo = nextNo;
	}

	@Override
	public String toString() {
		return "No [message=" + message + "]";
	}
	
	

}
