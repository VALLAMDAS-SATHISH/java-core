package com.learning.core.day3session2;

import java.util.Hashtable;

class Employee {
	private int id;
	private String name;
	private String department;
	private String designation;

	public Employee(int id, String name, String department, String designation) {
		this.setId(id);
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + getId() + ", name='" + name + '\'' + ", department='" + department + '\''
				+ ", designation='" + designation + '\'' + '}';
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (getId() != other.getId())
			return false;
		return true;
	}

	public int getId() {
		return id;
		
	}

	public void setId(int id) {
		this.id = id;
		
	}
}

public class D03P08_10 {
	public static void main(String[] args) {
		Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

		// Adding employees
		Employee emp1 = new Employee(1, "John", "HR", "Manager");
		Employee emp2 = new Employee(2, "Alice", "Finance", "Accountant");
		Employee emp3 = new Employee(3, "Bob", "IT", "Developer");
		Employee emp4 = new Employee(4, "Emily", "Marketing", "Analyst");

		employeeHashtable.put(emp1.getId(), emp1);
		employeeHashtable.put(emp2.getId(), emp2);
		employeeHashtable.put(emp3.getId(), emp3);
		employeeHashtable.put(emp4.getId(), emp4);

		// Checking if Hashtable is empty
		System.out.println(employeeHashtable.isEmpty());
	}

}
