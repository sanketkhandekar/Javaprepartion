package com.pratice.collection.employee;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return  o2.getEmployeeSalary().compareTo(o1.getEmployeeSalary()) ;
	}

}
