package io.carisuma2010.study.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.carisuma2010.study.springboot.domain.Book;
import io.carisuma2010.study.springboot.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	public ResponseEntity<Book> findById(Long bookId) {
		Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException("Not Found" + bookId));
		return ResponseEntity.ok(book);
	}
	
}
