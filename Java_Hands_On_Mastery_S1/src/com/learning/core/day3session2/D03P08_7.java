package com.learning.core.day3session2;

import java.util.*;

class Car1 implements Comparable<Car1> {
	private String name;
	private double price;

	public Car1(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
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
		Car1 car = (Car1) obj;
		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
	}

	// Implement compareTo method for natural ordering based on price
	@Override
	public int compareTo(Car1 other) {
		return Double.compare(this.price, other.price);
	}
}

public class D03P08_7 {
	public static void main(String[] args) {
		TreeMap<Car1, String> carMap = new TreeMap<>();

		// Predefined car details
		Car1 car1 = new Car1("Benz", 900000.0);
		Car1 car2 = new Car1("Bugatti", 80050.0);
		Car1 car3 = new Car1("Toyota", 60000.0);
		Car1 car4 = new Car1("Ford", 45000.0);

		// Storing cars in TreeMap
		carMap.put(car1, car1.getName());
		carMap.put(car2, car2.getName());
		carMap.put(car3, car3.getName());
		carMap.put(car4, car4.getName());

		// Retrieving the key-value mapping associated with the greatest and least price
		Car1 greatestPriceCar = carMap.lastKey();
		Car1 leastPriceCar = carMap.firstKey();

		System.out.println(greatestPriceCar); // Output greatest price
		System.out.println(leastPriceCar); // Output least price
	}
}
