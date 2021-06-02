package com.example2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example2.demo.entity.Library;

public interface LibraryRepository extends JpaRepository<Library,Integer> {

}
