package com.pratice.collection.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeEngine {

	static List<Employee> employees;

	static {

		employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 24, 20000));
		employees.add(new Employee(20, "Suresh", 34, 70000));
		employees.add(new Employee(30, "Ajay", 28, 50000));
		employees.add(new Employee(40, "Amol", 19, 4000));
		employees.add(new Employee(50, "Akshay", 45, 120000));
	}

	public boolean searchById(Integer id) {

		return employees.contains(new Employee(id));
	}

	public static void main(String[] args) {

		EmployeeEngine searchEngine = new EmployeeEngine();

		Integer searchById = 30;
		System.out.println(" is employee Present for the id " + searchById + " " + searchEngine.searchById(searchById));
	}

}
