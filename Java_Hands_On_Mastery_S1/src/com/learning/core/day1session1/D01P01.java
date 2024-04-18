package com.learning.core.day1session1;

 class Book  {
	private String book_title;
	private double book_price;
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
 }
	
	public class D01P01{
		public static Book createBooks(String book_title,double book_price) {
			Book book=new Book();
			book.setBook_title(book_title);
			book.setBook_price(book_price);
			return book;
			
		}
		
		public static void showBooks(Book book) {
			System.out.println("Book Title: "+book.getBook_title()+" and price:"+book.getBook_price());
			
		}
		
		public static void main(String[] args) {
			
			String bookTitle="Java Programming";
			double bookPrice=350.0;
			
			Book book=createBooks(bookTitle,bookPrice);
			showBooks(book);
		}
		
	}
	


