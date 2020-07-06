package com.library.services.bookservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.services.domain.objects.Book;
import com.library.services.service.BookService;
import com.library.services.util.ConstantsConfig;
import com.library.services.util.GenericResponse;

@RestController
@RequestMapping("/book")
public class BookController {

	
	@Autowired
	BookService bookService;

	@GetMapping
	private String defaultMethod() {
		return "Book Service";
	}

	@GetMapping("/getBook/{id}")
	private GenericResponse<Book> getBookById(@PathVariable("id") int bookId){
		return bookService.getBoookById(bookId);
	} 

	@PostMapping
	private GenericResponse<Book> saveBook(@RequestBody Book bookRequest) {
		return bookService.saveBoookData(bookRequest);
	}

	@DeleteMapping
	private GenericResponse<Book> deleteBook(@PathVariable int bookId){
		return bookService.deleteBoookById(bookId);
	}

	@GetMapping("/getBooksByAuthor/{id}")
	private GenericResponse<Book> getListOfHorrorBooks(@PathVariable("id") int authorId){
		return bookService.getBoooksByAuthorId(authorId);
	} 

	@PostMapping("/updateBookData")
	private GenericResponse<Book> updateBook(@RequestBody Book bookRequest) {
		return bookService.updateBoookData(bookRequest);
	}


}
