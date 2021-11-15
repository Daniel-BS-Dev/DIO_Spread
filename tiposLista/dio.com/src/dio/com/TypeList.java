package dio.com;

import java.util.ArrayList;
import java.util.List;

import dio.com.entities.Car;

public class TypeList {
	
public static void main(String[] args) {
		
		//Lista de carro
		List<Car> car = new ArrayList<>();
		
		car.add(new Car("Ford"));
		car.add(new Car("Fiat"));
		car.add(new Car("Civic"));
		car.add(new Car("Honda"));
		
		System.out.println(car.contains(new Car("Ford")));
		
		//pegando o car de index 2
		System.out.println(car.get(2));
		
		//return a posição
		System.out.println(car.indexOf(new Car("Honda")));
	}

}
