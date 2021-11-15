package dio.com;

import java.util.LinkedList;
import java.util.Queue;

import dio.com.entities.Car;

public class TypeQueueList {
	
public static void main(String[] args) {
		
		//fila de carro
		Queue<Car> car = new LinkedList<>();
		
		car.add(new Car("Ford"));
		car.add(new Car("Fiat"));
		car.add(new Car("Civic"));
		car.add(new Car("Honda"));
		
		System.out.println(car);
		
		// ele adiciona se não consegui return false
		System.out.println(car.offer(new Car("Renault")));
		
		//pega o primero se não encontra return null
		System.out.println(car.peek());
		
		//pega o primeiro e remove
		System.out.print(car.poll());
		
		
	}

}
