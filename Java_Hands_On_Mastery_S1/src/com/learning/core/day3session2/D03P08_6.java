package com.learning.core.day3session2;

import java.util.*;

class Car0 implements Comparable<Car0> {
	private String name;
	private double price;

	public Car0(String name, double price) {
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
		Car0 car = (Car0) obj;
		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
	}

	// Override compareTo method for natural ordering
	@Override
	public int compareTo(Car0 o) {
		return Double.compare(this.price, o.price);
	}
}

public class D03P08_6 {
	public static void main(String[] args) {
		TreeMap<Car0, String> carMap = new TreeMap<>(Collections.reverseOrder());

		// Predefined car details
		carMap.put(new Car0("Benz", 900000.0), "Germany");
		carMap.put(new Car0("Audi", 600100.0), "Germany");
		carMap.put(new Car0("Swift", 305000.0), "Japan");
		carMap.put(new Car0("Bugatti", 80050.0), "France");

		// Retrieving the price of the car in reverse order
		for (Map.Entry<Car0, String> entry : carMap.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
}
