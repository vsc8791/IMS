package com.bookstore.entity;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="bookname")
	private String bookname;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private double price;
	
	
	@Column(name="subcategory1")
	private String subcategory1;
	
	@Column(name="subcategory2")
	private String subcategory2;	
	
	@Column(name="imgpath")
	private String imgpath;

	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getSubcategory1() {
		return subcategory1;
	}



	public void setSubcategory1(String subcategory1) {
		this.subcategory1 = subcategory1;
	}



	public String getSubcategory2() {
		return subcategory2;
	}



	public void setSubcategory2(String subcategory2) {
		this.subcategory2 = subcategory2;
	}



	public String getImgpath() {
		return imgpath;
	}



	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	
	
	

}
