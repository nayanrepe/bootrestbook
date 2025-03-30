package com.api.book.book.bootrestbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.book.bootrestbook.Entities.Book;
import com.api.book.book.bootrestbook.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	/*
	 * @RequestMapping(value ="/books", method= RequestMethod.GET)
	 */
	
	//Get all book handler 
	@GetMapping("/books")
	public List<Book> getBooks() {

		return this.bookService.getAllBooks();

	}

	//get single book handler

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);

	}
	
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book b =this.bookService.addBook(book);
		return book;
		
	}

}
