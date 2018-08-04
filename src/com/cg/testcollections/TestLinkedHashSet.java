//Test class for creating LinkedHashSet of instances of collectionClasses and printing them
// Duplicates are rejected in LinkedHashSet
package com.cg.testcollections;

import java.util.LinkedHashSet;
import java.util.Set;
import com.cg.collection_classes.*;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		Laptop toshiba = new Laptop("Toshiba", "Apic", "Windows 10", "Intel i7");
		Laptop asus = new Laptop("asus", "ROG", "Windows 10", "Intel i5");
		Laptop apple = new Laptop("Apple", "Macbook Pro", "MacOS", "Intel i7");

		// duplicate entry( same company and model) : Rejected by linkedHashSet
		Laptop asus2 = new Laptop("asus", "ROG", "Windows 7", "Intel i7");

		Car maruti = new Car("Maruti", "Swift Dzire", 2014, 800000);
		Car lamborghini = new Car("Lamborghini", "Aventador", 2010, 45000000);
		Car honda = new Car("Honda", "City", 2015, 1000000);
		// duplicate entry( same company and model) : Rejected by linkedHashSet
		Car lamborghini1 = new Car("Lamborghini", "Aventador", 2014, 55000000);

		Television sony = new Television("Sony", "Plasma", true, 80000);
		Television onida = new Television("Onida", "LED", false, 60000);
		Television micromax = new Television("Micromax", "LCD", false, 20000);

		CellPhone onePlus = new CellPhone("One Plus", "5T", "High Performance flagship", "Android", 32999);
		CellPhone nokia = new CellPhone("Nokia", "3110", "Toughest in the world", "Symbian", 1500);
		CellPhone samsung = new CellPhone("Samsung", "J7", "Mid Range BlockBuster", "Android", 12999);

		School kv = new School("Kendriya Vidyalaya", "New Delhi", "West Delhi", 23);
		School dps = new School("Delhi Public School", "Jaipur", "Vaishali Nagar", 16);
		School krm = new School("KR Mangalam", "Guragaon", "Gurgaon", 28);

		Set<Laptop> laptop = new LinkedHashSet<>();
		laptop.add(toshiba);
		laptop.add(asus);
		laptop.add(apple);
		laptop.add(asus2);

		Set<Car> car = new LinkedHashSet<>();
		car.add(maruti);
		car.add(lamborghini);
		car.add(honda);
		car.add(lamborghini1);

		Set<Television> television = new LinkedHashSet<>();
		television.add(sony);
		television.add(onida);
		television.add(micromax);

		Set<School> school = new LinkedHashSet<>();
		school.add(kv);
		school.add(dps);
		school.add(krm);

		Set<CellPhone> cellPhone = new LinkedHashSet<>();
		cellPhone.add(onePlus);
		cellPhone.add(nokia);
		cellPhone.add(samsung);

		for (Laptop l : laptop) {
			System.out.println(l);
		}

		for (Car c : car)
			System.out.println(c);

		for (Television t : television)
			System.out.println(t);

		for (CellPhone c : cellPhone)
			System.out.println(c);

		for (School s : school)
			System.out.println(s);
	}

}
