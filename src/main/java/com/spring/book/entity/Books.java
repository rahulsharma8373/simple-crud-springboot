package com.spring.book.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Books {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	@Column  
	private int bookid;  
	@Column  
	private String bookname;  
	@Column  
	private String author;  
	@Column  
	private int price;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BooksService [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ "]";
	}
	public Books(int bookid, String bookname, String author, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
	
}
