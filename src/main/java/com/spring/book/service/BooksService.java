package com.spring.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.book.entity.Books;
import com.spring.book.repository.BooksRepository;

@Service
public class BooksService {
	@Autowired
	private BooksRepository booksRepository;

	public List< Books> getAllBooks(){
		List<Books> books=new ArrayList<>();
		booksRepository.findAll().forEach(books1->books.add(books1));
		return books;
	}
	public Books getBookById(int id) {
		return booksRepository.findById(id).get();
		
	}
	public Books save(Books books) {
		return booksRepository.save(books);
		
	}
	public void delete(int id) {
		booksRepository.deleteById(id);
	}
	public void  update(Books books,int Bookid) {
		booksRepository.save(books);
	}
	
}
