package com.learning.core.day3session2;

import java.time.LocalDate;
import java.util.*;

class Book implements Comparable<Book> {
	private int bookId;
	private String title;
	private double price;
	private LocalDate publicationDate;
	private String author;

	public Book(int bookId, String title, double price, String author, LocalDate publicationDate) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return bookId + " " + title + "\n" + price + "\n" + author + "\n" + publicationDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, title, price, publicationDate, author);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		return bookId == book.bookId && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title)
				&& Objects.equals(publicationDate, book.publicationDate) && Objects.equals(author, book.author);
	}

	@Override
	public int compareTo(Book otherBook) {
		return this.bookId - otherBook.bookId;
	}
}

public class D03P08_3 {
	public static void main(String[] args) {
		TreeSet<Book> bookSet = new TreeSet<>();

		// Predefined book details
		Book book1 = new Book(1001, "Python Learning", 295.0, "Sharad", LocalDate.of(1997, 5, 19));
		Book book2 = new Book(1002, "Modern Mainframe", 523.0, "Gilad Bracha", LocalDate.of(1984, 11, 23));
		Book book3 = new Book(1003, "Java Programming", 295.0, "Henry Harvin", LocalDate.of(1984, 11, 19));
		Book book4 = new Book(1004, "Read C++", 715.0, "Martic C. Brown", LocalDate.of(2020, 2, 2));
		Book book5 = new Book(1005, "Net Platform", 3497.0, "Mark J. Price", LocalDate.of(1984, 3, 6));

		// Adding books to TreeSet
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		bookSet.add(book5);

		// Printing all book details
		for (Book book : bookSet) {
			System.out.print(book);
		}
	}
}
