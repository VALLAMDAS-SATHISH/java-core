package com.learning.core.day3session1;

import java.util.*;

class Person0 implements Comparable<Person0> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person0(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, age, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person0 person = (Person0) obj;
		return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0
				&& Objects.equals(name, person.name);
	}

	@Override
	public int compareTo(Person0 other) {
		return Integer.compare(this.id, other.id);
	}
}

public class D03P07_7 {
	public static void main(String[] args) {
		TreeSet<Person0> personSet = new TreeSet<>();
		personSet.add(new Person0(1, "Tom", 30, 50000));
		personSet.add(new Person0(2, "Jerry", 25, 60000));
		personSet.add(new Person0(3, "Smith", 40, 70000));
		personSet.add(new Person0(4, "Popeye", 35, 55000));
		personSet.add(new Person0(5, "Jones", 45, 80000));
		personSet.add(new Person0(6, "John", 28, 45000));

		// Print all the names of persons in uppercase
		for (Person0 person : personSet) {
			System.out.print(person.getName().toUpperCase() + " ");
		}
	}
}
