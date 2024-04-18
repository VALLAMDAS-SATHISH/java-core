package com.learning.core.day3session1;

import java.util.*;

class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Getters and Setters

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

	// Override compareTo method for natural sorting by id
	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.id, other.id);
	}

	// Override toString method to print person details
	@Override
	public String toString() {
		return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	}

	// Override equals and hashCode methods for proper object comparison
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return id == person.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

public class D03P07_5 {
	public static void main(String[] args) {
		// Creating TreeSet to store Person objects with natural sorting
		TreeSet<Person> personSet = new TreeSet<>();

		// Adding predefined information of 6 persons
		personSet.add(new Person(1, "Alice", 22, 1500));
		personSet.add(new Person(2, "Bob", 20, 2000));
		personSet.add(new Person(3, "Charlie", 24, 1800));
		personSet.add(new Person(4, "David", 19, 2500));
		personSet.add(new Person(5, "John", 32, 1999));
		personSet.add(new Person(6, "Tom", 42, 3999));

		// Printing persons whose age is greater than 25
		for (Person person : personSet) {
			if (person.getAge() > 25) {
				System.out.println(person);
			}
		}
	}
}
