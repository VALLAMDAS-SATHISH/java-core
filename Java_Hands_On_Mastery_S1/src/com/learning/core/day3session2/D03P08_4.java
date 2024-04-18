package com.learning.core.day3session2;

import java.util.*;

class Book0 implements Comparable<Book0> {
	private int bookId;
	private String title;
	private double price;
	private String author;
	private Date dateOfPublication;

	public Book0(int bookId, String title, double price, String author, Date dateOfPublication) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
	}

	@Override
	public String toString() {
		return bookId + " " + title + "\n" + price + " " + author + "\n" + dateOfPublication + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, title, price, author, dateOfPublication);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book0 book0 = (Book0) obj;
		return bookId == book0.bookId && Double.compare(book0.price, price) == 0 && Objects.equals(title, book0.title)
				&& Objects.equals(author, book0.author) && Objects.equals(dateOfPublication, book0.dateOfPublication);
	}

	@Override
	public int compareTo(Book0 other) {
		return this.author.compareTo(other.author);
	}
}

public class D03P08_4 {
	public static void main(String[] args) {
		Set<Book0> bookSet = new TreeSet<>();

		bookSet.add(new Book0(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
		bookSet.add(new Book0(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
		bookSet.add(new Book0(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6)));
		bookSet.add(new Book0(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(120, 1, 2)));
		bookSet.add(new Book0(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19)));

		for (Book0 book : bookSet) {
			System.out.println(book);
		}
	}
}
