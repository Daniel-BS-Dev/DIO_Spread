package com.DIO_Spread.main;

import com.DIO_Spread.no.No;

public class Main {
	
	public static void main(String[] args) {
		
		
		No object1 = new No("First no");
		
		No object2 = new No("Second no");
		object1.setNext(object2);
		
		No object3 = new No("Second no");
		object2.setNext(object3);
		
		No object4 = new No("Second no");
		object3.setNext(object4);
		
		No object5 = new No("Second no");
		object4.setNext(object5);
		
		System.out.println(object1.getNext());
		System.out.println(object5.getNext());
		
	}

}
