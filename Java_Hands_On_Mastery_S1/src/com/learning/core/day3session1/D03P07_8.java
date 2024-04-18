package com.learning.core.day3session1;

import java.util.*;

class Person00 implements Comparable<Person00> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person00(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Person00{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
	}

	// Override equals method
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person00 person = (Person00) o;
		return id == person.id;
	}

	// Override hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Override compareTo method for natural ordering
	@Override
	public int compareTo(Person00 o) {
		return Integer.compare(this.id, o.id);
	}
}

public class D03P07_8 {
	public static void main(String[] args) {
		// Creating TreeSet to store Person00 objects
		TreeSet<Person00> personTreeSet = new TreeSet<>();

		// Adding predefined person details
		personTreeSet.add(new Person00(1, "Alice", 30, 4000));
		personTreeSet.add(new Person00(2, "Bob", 35, 5000));
		personTreeSet.add(new Person00(3, "Charlie", 40, 6000));
		personTreeSet.add(new Person00(4, "David", 45, 2000));
		personTreeSet.add(new Person00(5, "Eve", 50, 3494));
		personTreeSet.add(new Person00(6, "Frank", 55, 2500));

		// Calculate the sum of all salaries
		double sum = 0;
		for (Person00 person : personTreeSet) {
			sum += person.getSalary();
		}

		// Print the sum of all salaries
		System.out.println("Sum of all salaries: " + sum);
	}
}
