package com.revature.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spring.model.Book;



public interface BookRepository extends JpaRepository<Book, Long>{

}
