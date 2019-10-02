package com.java.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainComparator {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();
		

		personList.add(new Person("Sanket", 33, "Mumbai"));
		personList.add(new Person("Amit", 41, "Pune"));
		personList.add(new Person("Rishab", 21, "Banglore"));


		personList.removeIf(p -> p.getAge() > 32 || p.getAge() < 25 );
		
		printPersonList(personList);

		java.util.Comparator<Person> compartorWithName = (p1, p2) -> p2.getName().compareTo(p1.getName());

		Function<Person, Integer> f1 = p -> p.getAge();
		printPersonList(personList.stream().sorted((compartorWithName))
				.collect(Collectors.toList()));

		Function<Person, String> f2 = p -> p.getName();

		Comparator<Person> comparatorWithAge = (p1, p2) -> p2.getAge() - p1.getAge();
		

        Function<Person, String> getLastName = p -> p.getName();
        Function<Person, Integer> getAge = p -> p.getAge();

        java.util.Comparator<Person> cmp = java.util.Comparator.comparing(Person::getName)
                .thenComparing(getAge);


		Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
		Comparator<Person> cmpPersonName = Comparator.comparing(Person::getName);

	//	Comparator<Person> cmp = cmpPersonAge.thenComparing(cmpPersonName);

		Comparator<Person> cmpWithAgeName = Comparator.comparing(Person::getName).thenComparing(Person::getAge);

	}

	private static void printPersonList(List<Person> personList) {
		personList.parallelStream().forEach(System.out::println);

	}

}
