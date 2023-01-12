package com.test;

public class Book {
	
	public String bookName;
	Author author;
	public int pages;
	public int cost;
	public int bookNo;
	public Book(String bookName, Author author, int pages, int cost, int bookNo) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.bookNo = bookNo;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", pages=" + pages + ", cost=" + cost + ", bookNo="
				+ bookNo + "]";
	}
	
	

}
