package com.example2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.demo.entity.Library;
import com.example2.demo.service.LibraryService;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryService ls;
	
	@PostMapping("/addLib")
	public Library addLibrary(@RequestBody Library library) {
		return ls.insertLibrary(library);
	}
	
	@GetMapping("/disLib")
	public List<Library>displayLibrary(){
		System.out.println("hello");
		return ls.showLibrary();
	}
	
	@PutMapping("/upLib/{libraryId}")
	public Library updateLibrary(@RequestBody Library library,@PathVariable int libraryId) {
		return ls.changeLibrary(library, libraryId);
	}
	@DeleteMapping("/delete/{libraryId}")
	public void deleteLibrary(@PathVariable int libraryId) {
		ls.removeLibrary(libraryId);
	}

}