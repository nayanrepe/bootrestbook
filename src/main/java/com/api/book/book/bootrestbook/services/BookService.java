package com.api.book.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.book.bootrestbook.Entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {

		list.add(new Book(11, "java complete ref", "XYZ"));
		list.add(new Book(16, "head to first java", "ABC"));

		list.add(new Book(56, "Thing java ", "NAYAN"));

	}

	// get all books

	public List<Book> getAllBooks() {
		return list;

	}

	// get single book by id
	public Book getBookById(int id) {

		Book book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;

	}
	
	//adding the book
	
	public Book addBook(Book b) {
		
		list.add(b);
		return b;
	}

}
