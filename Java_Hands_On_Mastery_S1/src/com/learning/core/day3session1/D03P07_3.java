package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Scanner;

class Product1 {
	private String productId;
	private String productName;

	public Product1(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public int hashCode() {
		return productId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Product1 other = (Product1) obj;
		return productId.equals(other.productId);
	}
}

public class D03P07_3 {
	public static void main(String[] args) {
		HashSet<Product1> productHashSet = new HashSet<>();
		// Predefined products
		productHashSet.add(new Product1("P001", "iPhone 12"));
		productHashSet.add(new Product1("P002", "Samsung Galaxy S21"));
		productHashSet.add(new Product1("P003", "Maruti Dezire"));
		productHashSet.add(new Product1("P004", "HP Laptop"));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter product id to search: ");
		String searchProductId = scanner.nextLine();

		boolean found = false;
		for (Product1 product : productHashSet) {
			if (product.getProductId().equals(searchProductId)) {
				found = true;
				System.out.println("Product Found: " + product.getProductName());
				break;
			}
		}

		if (!found) {
			System.out.println("Product not found.");
		}
		scanner.close();
	}
}
