//Test class for creating TreeSet of instances of Car class and printing them
// Duplicates are rejected in TreeSet
package com.cg.testcollections;

import java.util.Set;
import java.util.TreeSet;

import com.cg.collection_classes.*;

public class TestTreeSetForCar {

	public static void main(String[] args) {

		Car maruti = new Car("Maruti", "Swift Dzire", 2014, 800000);
		Car lamborghini = new Car("Lamborghini", "Aventador", 2010, 45000000);
		Car honda = new Car("Honda", "City", 2015, 1000000);

		// duplicate entry( same company and model) : Rejected by TreeSet
		Car lamborghini1 = new Car("Lamborghini", "Aventador", 2014, 55000000);

		Set<Car> car = new TreeSet<>();
		car.add(maruti);
		car.add(lamborghini);
		car.add(honda);
		car.add(lamborghini1);

		for (Car c : car)
			System.out.println(c);
	}

}
