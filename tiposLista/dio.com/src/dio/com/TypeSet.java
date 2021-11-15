package dio.com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import dio.com.entities.Car;

public class TypeSet {
	
public static void main(String[] args) {
		
		//conjunto de carro
	    // HashSet ordena tudo
		Set<Car> car = new HashSet<>();
		
		car.add(new Car("Ford"));
		car.add(new Car("Fiat"));
		car.add(new Car("Civic"));
		car.add(new Car("Honda"));
		
		System.out.println(car.contains(new Car("Ford")));
		

		
		// para usar o treeSet eu tenho que colocar um extends Comparable<Car> em minha class e tambem colocar o compareTo
		Set<Car> cars = new TreeSet<>();
		
		cars.add(new Car("Ford"));
		cars.add(new Car("Fiat"));
		cars.add(new Car("Civic"));
		cars.add(new Car("Honda"));
		
		System.out.println(car.contains(new Car("Ford")));
		
	}


}
