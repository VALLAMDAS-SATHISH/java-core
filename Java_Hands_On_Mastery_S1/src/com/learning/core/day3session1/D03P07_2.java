package com.learning.core.day3session1;

	import java.util.HashSet;

	class Product {
	    String productId;
	    String productName;

	    public Product(String productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }
	}

	public class D03P07_2 {
	    public static void main(String[] args) {
	        HashSet<Product> productSet = new HashSet<>();

	        // Predefined information of 4 products
	        Product product1 = new Product("P001", "Maruti 800");
	        Product product2 = new Product("P002", "Maruti Zen");
	        Product product3 = new Product("P003", "Maruti Dezire");
	        Product product4 = new Product("P004", "Maruti Alto");

	        // Add products to the HashSet
	        productSet.add(product1);
	        productSet.add(product2);
	        productSet.add(product3);
	        productSet.add(product4);

	        // List all the Product details
	        for (Product product : productSet) {
	            System.out.println(product.productId + " " + product.productName);
	        }
	    }
	}
	
