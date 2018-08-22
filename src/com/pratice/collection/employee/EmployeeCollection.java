package com.pratice.collection.employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCollection {

	public static void main(String args[]) {

		Map<Employee, String> mapofEmployeeWithName = new HashMap<>();
		Employee employee = new Employee(10, "Ramesh", 24, 20000);
		Employee employee2 = new Employee(20, "Suresh", 34, 70000);
		Employee employee3 = new Employee(30, "Ajay", 28, 50000);
		Employee employee4 = new Employee(40, "Amol", 19, 4000);
		Employee employee6 = new Employee(50, "Akshay", 45, 120000);
		Employee employee5 = new Employee(50, "Akshay", 45, 120000);
		
	
		Employee employee7 = new Employee(30);
		
		mapofEmployeeWithName.put(employee,"Ramesh");
		mapofEmployeeWithName.put(employee2,"Suresh");
		mapofEmployeeWithName.put(employee3,"Ajay");
		mapofEmployeeWithName.put(employee4,"Amol");
		mapofEmployeeWithName.put(employee5,"Akshay");
		mapofEmployeeWithName.put(employee6,"Vikram");
		mapofEmployeeWithName.put(employee7,"Aditya");
		
		System.out.println(mapofEmployeeWithName.get(employee7));
		
		
	}

}
