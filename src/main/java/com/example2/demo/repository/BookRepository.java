package com.example2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example2.demo.entity.Book;

public interface BookRepository  extends JpaRepository<Book,Integer>{

}
