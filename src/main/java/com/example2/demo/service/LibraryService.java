package com.example2.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.demo.entity.Library;
import com.example2.demo.repository.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository lr;
	
	public Library insertLibrary(Library library) {
		return lr.save(library);
		
	}
	
	public List<Library> showLibrary(){
		return lr.findAll();
	}
	public Library changeLibrary(Library library,int libraryId) {
		library.setId(libraryId);
		return lr.save(library);
	}
	
	public void removeLibrary(int libraryId) {
		lr.deleteById(libraryId);
	}

}
