package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Scanner;

class Product0 {
	private String productId;
	private String productName;

	public Product0(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}
}

public class D03P07_4 {
	public static void main(String[] args) {
		HashSet<Product0> products = new HashSet<>();

		// Predefined information of 4 products
		products.add(new Product0("P001", "Maruti 800"));
		products.add(new Product0("P002", "Maruti Dezire"));
		products.add(new Product0("P003", "Maruti Alto"));
		products.add(new Product0("P004", "Maruti Baleno"));

/*		System.out.println("Products before removal:");
		for (Product0 product : products) {
			System.out.println(product.getProductId() + " " + product.getProductName());
		} */

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the product id to remove:");
		String productIdToRemove = scanner.nextLine();

		// Removing a particular product from the HashSet by using product id
		boolean removed = false;
		for (Product0 product : products) {
			if (product.getProductId().equals(productIdToRemove)) {
				products.remove(product);
				removed = true;
				break;
			}
		}

		if (removed) {
			System.out.println("\nProduct with ID " + productIdToRemove + " removed successfully.");
		} else {
			System.out.println("\nProduct with ID " + productIdToRemove + " not found.");
		}

		System.out.println("\nProducts after removal:");
		for (Product0 product : products) {
			System.out.println(product.getProductId() + " " + product.getProductName());
		}
	}
}
