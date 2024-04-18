package com.learning.core.day3session2;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

class Car4 implements Comparable<Car4> {
	private String name;
	private double price;

	public Car4(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car4 car = (Car4) o;
		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public int compareTo(Car4 o) {
		return Double.compare(this.price, o.price);
	}
}

public class D03P08_9 {
	public static void main(String[] args) {
		TreeMap<Car4, String> carTreeMap = new TreeMap<>();

		// Predefined information of 4 Car details
		carTreeMap.put(new Car4("Toyota", 50000.0), "Toyota");
		carTreeMap.put(new Car4("Honda", 60000.0), "Honda");
		carTreeMap.put(new Car4("BMW", 70000.0), "BMW");
		carTreeMap.put(new Car4("Reva", 80050.0), "Reva");

		System.out.println("Original TreeMap:");
		for (Car4 car : carTreeMap.keySet()) {
			System.out.println(car.getName() + " " + car.getPrice());
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter the new price to replace: ");
		double newPrice = scanner.nextDouble();
		scanner.close();

		for (Car4 car : carTreeMap.keySet()) {
			if (car.getPrice() == newPrice) {
				carTreeMap.put(car, "Car3");
			}
		}

		System.out.println("\nTreeMap after replacing the value:");
		for (Car4 car : carTreeMap.keySet()) {
			System.out.println(car.getName() + " " + car.getPrice());
		}
	}
}
