//Test class for creating HashMap of students and printing them
// Duplicates are rejected in HashMap
package com.cg.testcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMapStudents {

	public static void main(String[] args) {

		Map<Integer, String> student = new HashMap<>();
		student.put(1, "karan");
		student.put(2, "amit");

		// Overwriting on Key value: 1
		student.put(1, "kar");

		System.out.println(student);

		// Entry set and Key Set Usage
		Set<Entry<Integer, String>> set = student.entrySet();
		for (Entry e : set) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
