package com.spring.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.book.entity.Books;
@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  