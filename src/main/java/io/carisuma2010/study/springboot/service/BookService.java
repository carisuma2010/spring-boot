package io.carisuma2010.study.springboot.service;

import java.util.Optional;

import io.carisuma2010.study.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
	
	
}
