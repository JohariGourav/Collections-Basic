package com.cg.testcollections;

import java.util.ArrayList;
import java.util.List;

import com.cg.collection_classes.*;

public class TestCollection {

	public static void main(String args[]) {

		Laptop toshiba = new Laptop("Toshiba", "Apic", "Windows 10", "Intel i7");
		Laptop asus = new Laptop("asus", "ROG", "Windows 10", "Intel i5");
		Laptop apple = new Laptop("Apple", "Macbook Pro", "MacOS", "Intel i7");

		Car maruti = new Car("Maruti", "Swift Dzire", 2014, 800000);
		Car lamborghini = new Car("Lamborghini", "Aventador", 2010, 45000000);
		Car honda = new Car("Honda", "City", 2015, 1000000);

		Television sony = new Television("Sony", "Plasma", true, 80000);
		Television onida = new Television("Onida", "LED", false, 60000);
		Television micromax = new Television("Micromax", "LCD", false, 20000);

		CellPhone onePlus = new CellPhone("One Plus", "5T", "High Performance flagship", "Android", 32999);
		CellPhone nokia = new CellPhone("Nokia", "3110", "Toughest in the world", "Symbian", 1500);
		CellPhone samsung = new CellPhone("Samsung", "J7", "Mid Range BlockBuster", "Android", 12999);

		School kv = new School("Kendriya Vidyalaya", "New Delhi", "West Delhi", 23);
		School dps = new School("Delhi Public School", "Jaipur", "Vaishali Nagar", 16);
		School krm = new School("KR Mangalam", "Guragaon", "Gurgaon", 28);

		List<Laptop> laptop = new ArrayList<>();
		laptop.add(toshiba);
		laptop.add(asus);
		laptop.add(apple);

		List<Car> car = new ArrayList<>();
		car.add(maruti);
		car.add(lamborghini);
		car.add(honda);

		List<Television> television = new ArrayList<>();
		television.add(sony);
		television.add(onida);
		television.add(micromax);

		List<CellPhone> cellPhone = new ArrayList<>();
		cellPhone.add(onePlus);
		cellPhone.add(nokia);
		cellPhone.add(samsung);

		List<School> school = new ArrayList<>();
		school.add(kv);
		school.add(dps);
		school.add(krm);

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
