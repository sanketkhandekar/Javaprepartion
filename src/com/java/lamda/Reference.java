package com.java.lamda;

import java.util.Arrays;
import java.util.List;

public class Reference {

	public static void main(String args[]) {

		final List<Person> personList = Arrays.asList(new Person("Sanket", 34, "Mumbai"),
				new Person("Akshay", 34, "Mumbai"));
		
		personList.forEach(Person::getName);
		
		personList.forEach(p -> p.getName());
		
		
	}
}
