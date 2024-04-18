package com.learning.core.day3session2;

import java.util.Hashtable;
import java.util.Scanner;

class Employee00 {
	private int id;
	private String name;
	private String department;
	private String designation;

	public Employee00(int id, String name, String department, String designation) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + designation + " " + department;
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
		Employee00 employee = (Employee00) obj;
		return id == employee.id;
	}
}

public class D03P08_12 {
	public static void main(String[] args) {
		Hashtable<Integer, Employee00> employeeTable = new Hashtable<>();

		// Predefined Employee details
		employeeTable.put(1001, new Employee00(1001, "Daniel", "L&D", "Analyst"));
		employeeTable.put(1002, new Employee00(1002, "Thomas", "Testing", "Tester"));
		employeeTable.put(1003, new Employee00(1003, "Robert", "Development", "Product Manager"));
		employeeTable.put(1004, new Employee00(1004, "Grace", "HR", "Tech Support"));

		Scanner scanner = new Scanner(System.in);

		// Adding new Employee if not exists
		System.out.println("Enter Employee details (id name department designation):");
		String input = scanner.nextLine();
		String[] details = input.split(" ");
		int id = Integer.parseInt(details[0]);
		String name = details[1];
		String department = details[2];
		String designation = details[3];
		Employee00 newEmployee = new Employee00(id, name, department, designation);

		if (!employeeTable.containsKey(id)) {
			employeeTable.put(id, newEmployee);
		}

		// Displaying all Employee details
		System.out.println("\nEmployee details:");
		employeeTable.forEach((employeeId, employee) -> System.out.println(employee));

		scanner.close();
	}
}
