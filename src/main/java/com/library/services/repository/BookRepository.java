package com.library.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.services.domain.objects.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book getById(int id);
	List<Book> getByAuthorId(int authorId); 
	Boolean deleteById(int id);
	//dssBook save(Book book);
	//Book updateById(Book book);
}
