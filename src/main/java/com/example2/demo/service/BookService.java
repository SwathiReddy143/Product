package com.example2.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.demo.entity.Book;
import com.example2.demo.entity.Library;
import com.example2.demo.repository.BookRepository;
import com.example2.demo.repository.LibraryRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository br;
	@Autowired
	private LibraryRepository llr;
	public Book insertBook(Book book,int id) {
		Library lib=llr.findById(id).get();
		book.setLibrary(lib);
		return br.save(book);
		
		
	}
	public List<Book> showBook(){
		return br.findAll();
	}
	public Book changeBook(Book book,int bookId) {
        book.setId(bookId);
		return br.save(book);
	}
	public void removeBook(int bookId) {
		br.deleteById(bookId);
	}



}
