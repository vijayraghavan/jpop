package com.library.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.services.domain.objects.Book;
import com.library.services.repository.BookRepository;
import com.library.services.util.ConstantsConfig;
import com.library.services.util.GenericResponse;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	GenericResponse<Book> responseBook;

	public GenericResponse<Book> getBoookById(int bookId ) {
		Book bookData= bookRepository.getById(bookId);
		if(null !=bookData && bookData.getId()>0){
			responseBook.setStatus(ConstantsConfig.SUCCESS);
			responseBook.setData(bookData);
		}else {
			responseBook.setStatus(ConstantsConfig.FAILURE);
		}
		return responseBook;
	}
	
	public GenericResponse<Book> getBoooksByAuthorId(int authorId ) {
		List<Book> booksList = bookRepository.getByAuthorId(authorId);
		if(null !=booksList && booksList.size()>0){
			responseBook.setStatus(ConstantsConfig.SUCCESS);
			responseBook.setDataList(booksList);
		}else {
			responseBook.setStatus(ConstantsConfig.FAILURE);
		}
		return responseBook;
	}
	
	public GenericResponse<Book> deleteBoookById(int bookId ) {
		boolean bookResponce = bookRepository.deleteById(bookId);
		if(bookResponce){
			responseBook.setStatus(ConstantsConfig.SUCCESS);
		}else {
			responseBook.setStatus(ConstantsConfig.FAILURE);
		}
		return responseBook;
	}
	
	public GenericResponse<Book> saveBoookData(Book bookData ) {
		Book bookResponse = bookRepository.save(bookData);
		if(null != bookResponse && bookResponse.getId()>0){
			responseBook.setStatus(ConstantsConfig.SUCCESS);
			responseBook.setData(bookResponse);
		}else {
			responseBook.setStatus(ConstantsConfig.FAILURE);
		}
		return responseBook;
	}
	
	public GenericResponse<Book> updateBoookData(Book bookData ) {
		Book bookResponse = bookRepository.save(bookData);
		if(null != bookResponse && bookResponse.getId()>0){
			responseBook.setStatus(ConstantsConfig.SUCCESS);
			responseBook.setData(bookResponse);
		}else {
			responseBook.setStatus(ConstantsConfig.FAILURE);
		}
		return responseBook;
	}
	
	
	
}
