package com.example2.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private int bookid;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="library_id")
	private Library library;
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String name, Library library) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.library = library;
	}

	public int getId() {
		return bookid;
	}

	public void setId(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	
	
	

}
