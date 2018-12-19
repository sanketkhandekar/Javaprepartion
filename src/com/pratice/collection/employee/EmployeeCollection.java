package com.pratice.collection.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
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

		mapofEmployeeWithName.put(employee, "Ramesh");
		mapofEmployeeWithName.put(employee2, "Suresh");
		mapofEmployeeWithName.put(employee3, "Ajay");
		mapofEmployeeWithName.put(employee4, "Amol");
		mapofEmployeeWithName.put(employee5, "Akshay");
		mapofEmployeeWithName.put(employee6, "Vikram");
		mapofEmployeeWithName.put(employee7, "Aditya");

		System.out.println(mapofEmployeeWithName.get(employee7));

		EmployeeCollection employeeCollection = new EmployeeCollection();

		employeeCollection.sortEmployee();

	}

	public void sortEmployee() {

		Employee employee = new Employee(10, "Ramesh", 24, 20000);

		Employee employee2 = new Employee(20, "Suresh", 34, 70000);
		Employee employee3 = new Employee(30, "Ajay", 19, 50000);
		Employee employee4 = new Employee(40, "Amol", 19, 4000);
		Employee employee5 = new Employee(50, "Akshay", 34, 120000);
		Employee employee6 = new Employee(60, "Vivek", 37, 250000);

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(employee);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);

		System.out.println(" Before Sort  " + employeeList);

		Collections.sort(employeeList, new EmployeeSortByAge().thenComparing(new EmployeeSortByName()));
		
		System.out.println(" After  Sort  " + employeeList);
	}

}

class EmployeeSortByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}

}

class EmployeeSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}

}

class EmployeeSortByNewSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}

}
