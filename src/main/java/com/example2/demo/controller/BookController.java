package com.example2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.demo.entity.Book;
import com.example2.demo.entity.Library;
import com.example2.demo.service.BookService;
import com.example2.demo.service.LibraryService;
@RestController
public class BookController {

	@Autowired
	private BookService bs;
	
	@PostMapping("/addBook/{id}")
	public Book addBook(@RequestBody Book book,@PathVariable int id) {
		return bs.insertBook(book,id);
	}
	
	@GetMapping("/disBook")
	public List<Book>displayBook(){
		return bs.showBook();
	}
	
	@PutMapping("/upBook/{bookid}")
	public Book updateBook(@RequestBody Book book,@PathVariable int bookid) {
		return bs.changeBook(book, bookid);
	}
	@DeleteMapping("/delete/{bookid}")
	public void deleteBook(@PathVariable int bookid) {
		bs.removeBook(bookid);
	}

}
