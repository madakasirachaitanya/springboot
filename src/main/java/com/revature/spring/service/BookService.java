package com.revature.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spring.model.Book;
import com.revature.spring.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(long id) {
		return bookRepository.findOne(id);
	}
}
