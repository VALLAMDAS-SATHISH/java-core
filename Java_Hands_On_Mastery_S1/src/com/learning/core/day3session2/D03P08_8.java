package com.learning.core.day3session2;

import java.util.*;

class Car2 implements Comparable<Car2> {
	private String name;
	private double price;

	public Car2(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Override toString method
	@Override
	public String toString() {
		return name + " " + price;
	}

	// Override hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	// Override equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Car2 car = (Car2) obj;
		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
	}

	// Override compareTo method for natural ordering
	@Override
	public int compareTo(Car2 other) {
		return Double.compare(this.price, other.price);
	}
}

public class D03P08_8 {
	public static void main(String[] args) {
		TreeMap<Car2, String> carMap = new TreeMap<>();

		// Adding predefined car details
		carMap.put(new Car2("Bugatti", 80050.0), "Details of Bugatti");
		carMap.put(new Car2("Swift", 305000.0), "Details of Swift");
		carMap.put(new Car2("Audi", 600100.0), "Details of Audi");
		carMap.put(new Car2("BMW", 400000.0), "Details of BMW");

		// Output the TreeMap
		for (Map.Entry<Car2, String> entry : carMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Removing the greatest key-value mapping
		Map.Entry<Car2, String> entry = carMap.pollLastEntry();
		System.out.println("\nRemoved: " + entry.getKey() + " " + entry.getValue());

		// Getting key-value mapping associated with the greatest key
		Map.Entry<Car2, String> greatestEntry = carMap.lastEntry();
		System.out.println("\nGreatest Key-Value Mapping: " + greatestEntry.getKey() + " " + greatestEntry.getValue());
	}
}
