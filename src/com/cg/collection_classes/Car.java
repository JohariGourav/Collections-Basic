// Car class with company,model,year and price
package com.cg.collection_classes;

public class Car implements Comparable<Car> {
	private String company;
	private String model;
	private int year;
	private int price;

	// Arg Ctor..
	public Car(String company, String model, int year, int price) {
		super();
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	// Company and model together defining equality for Car
	// Overrided hashcode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	// Overrided equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car car) {

		return company.compareTo(car.company);
	}

}
