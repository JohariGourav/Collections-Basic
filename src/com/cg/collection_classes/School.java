//School class with name, city, district, ranking
package com.cg.collection_classes;

public class School implements Comparable<School> {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;

	// Arg Ctor..
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	// Name, city & School District together defining equality for School
	// Overrided hashcode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}

	@Override
	public int compareTo(School arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
