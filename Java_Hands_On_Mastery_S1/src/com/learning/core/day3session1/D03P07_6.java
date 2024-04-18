package com.learning.core.day3session1;

	
	import java.util.*;

	class Person1 implements Comparable<Person1> {
	    private int id;
	    private String name;
	    private int age;
	    private double salary;

	    public Person1(int id, String name, int age, double salary) {
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
	        return id + " " + name + " " + salary;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name, age, salary);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Person1 person = (Person1) obj;
	        return id == person.id &&
	                age == person.age &&
	                Double.compare(person.salary, salary) == 0 &&
	                Objects.equals(name, person.name);
	    }

	    @Override
	    public int compareTo(Person1 o) {
	        return Integer.compare(this.id, o.id);
	    }
	}

	public class D03P07_6 {
	    public static void main(String[] args) {
	        TreeSet<Person1> personSet = new TreeSet<>();

	        // Predefined information of 6 person details
	        Person1 person1 = new Person1(1, "Jerry", 25, 999.0);
	        Person1 person2 = new Person1(2, "Smith", 30, 2999.0);
	        Person1 person3 = new Person1(3, "Popeye", 35, 5999.0);
	        Person1 person4 = new Person1(4, "Jones", 40, 6999.0);
	        Person1 person5 = new Person1(5, "John", 45, 1999.0);
	        Person1 person6 = new Person1(6, "Tom", 50, 3999.0);

	        // Add persons to TreeSet
	        personSet.add(person1);
	        personSet.add(person2);
	        personSet.add(person3);
	        personSet.add(person4);
	        personSet.add(person5);
	        personSet.add(person6);

	        // Print id, name, and salary of each person
	        for (Person1 person : personSet) {
	            System.out.println(person.getId() + " " + person.getName() + " " + person.getSalary());
	        }
	    }
	}

