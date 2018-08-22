package com.pratice.collection.employee;

public class Employee {

	private Integer id;
	private String employeeName;
	private Integer age;
	private Integer employeeSalary;

	public Employee(Integer id, String employeeName, Integer age, Integer employeeSalary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.age = age;
		this.employeeSalary = employeeSalary;
	}

	public Employee(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	@Override
	public int hashCode() {
		System.out.println("under the Hash ");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + employeeName.hashCode();
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("under the equal ");

		return this.id.equals(((Employee) obj).id);
	}

}
