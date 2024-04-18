package com.learning.core.day3session2;

import java.util.Hashtable;
import java.util.Scanner;

class Employee0 {
	private int id;
	private String name;
	private String department;
	private String designation;

	public Employee0(int id, String name, String department, String designation) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee0{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\''
				+ ", designation='" + designation + '\'' + '}';
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee0 employee = (Employee0) obj;
		return id == employee.id;
	}
}

public class D03P08_11 {
	public static void main(String[] args) {
		// Predefined information of 4 employees
		Employee0 employee1 = new Employee0(1001, "John", "HR", "Manager");
		Employee0 employee2 = new Employee0(1002, "Alice", "Finance", "Accountant");
		Employee0 employee3 = new Employee0(1003, "Robert", "Development", "Product Manager");
		Employee0 employee4 = new Employee0(1004, "Emily", "Marketing", "Marketing Executive");

		// Storing employees in Hashtable with id as key
		Hashtable<Integer, Employee0> employeeTable = new Hashtable<>();
		employeeTable.put(employee1.hashCode(), employee1);
		employeeTable.put(employee2.hashCode(), employee2);
		employeeTable.put(employee3.hashCode(), employee3);
		employeeTable.put(employee4.hashCode(), employee4);

		// Using Scanner class to take input for searching employee
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee ID to search: ");
		int searchId = scanner.nextInt();
		scanner.close();

		// Searching for a specific employee by id
		Employee0 foundEmployee = employeeTable.get(searchId);
		if (foundEmployee != null) {
			System.out.println("Employee found:");
			System.out.println(foundEmployee);
		} else {
			System.out.println("Employee with ID " + searchId + " not found.");
		}
	}
}