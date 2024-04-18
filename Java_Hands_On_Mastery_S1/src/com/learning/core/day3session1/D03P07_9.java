package com.learning.core.day3session1;

import java.util.*;

class Person000 implements Comparable<Person000> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person000(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Person000 other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person000 person = (Person000) obj;
		return id == person.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	}

	public String getName() {
		return name;
	}
}

public class D03P07_9 {
	public static void main(String[] args) {
		TreeSet<Person000> personSet = new TreeSet<>();

		// Predefined information of 6 person details
		personSet.add(new Person000(1, "John", 30, 5000));
		personSet.add(new Person000(2, "Alice", 25, 6000));
		personSet.add(new Person000(3, "Bob", 35, 7000));
		personSet.add(new Person000(4, "Jones", 22, 6999));
		personSet.add(new Person000(5, "Jack", 40, 8000));
		personSet.add(new Person000(6, "Jill", 28, 5500));

		// Find and print the first person whose name starts with J
		for (Person000 person : personSet) {
			if (person.getName().startsWith("J")) {
				System.out.println(person);
				break;
			}
		}
	}
}
