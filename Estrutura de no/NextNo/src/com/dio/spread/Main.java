package com.dio.spread;

import com.dio.spread.entities.No;

public class Main {
	
	public static void main(String[] args) {
		
		No no1 = new No("first no");
		
		No no2 = new No("second no");
		no1.setNextNo(no2);
		
		No no3 = new No("third no");
		no2.setNextNo(no3);
		
		No no4 = new No("fourth no");
		no3.setNextNo(no4);
		
		No no5 = new No("fifth no");
		no4.setNextNo(no5);
		
		System.out.print(no1.getNextNo().getNextNo().getNextNo()//.getNextNo());
	}

}
