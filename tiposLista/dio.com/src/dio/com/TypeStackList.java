package dio.com;

import java.util.Stack;

import dio.com.entities.Car;

public class TypeStackList {
	
	public static void main(String[] args) {
		
		// pilha de carro
		Stack<Car> car = new Stack<>();
		
		car.add(new Car("Ford"));
		car.add(new Car("Fiat"));
		car.add(new Car("Civic"));
		car.add(new Car("Honda"));
		
		System.out.print(car.empty());
		
		//primeiro da pilha
		System.out.print(car.peek());
	}

}
