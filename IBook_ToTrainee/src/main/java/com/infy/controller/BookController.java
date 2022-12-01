package com.infy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.infy.dto.BookDTO;
import com.infy.exception.InfyBookException;
import com.infy.repository.BookRepository;
import com.infy.service.BookService;



@RestController
@RequestMapping("/api/v1/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping(method = RequestMethod.GET , value="/{bookId}" )
	public ResponseEntity<BookDTO> getBookDetails(@PathVariable("bookId") Integer bookId) throws InfyBookException{
		
		return new ResponseEntity<BookDTO>( bookService.getBookDetails(bookId) , HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/")
	public void  addBook(@RequestBody BookDTO bookDto) throws InfyBookException{
		bookService.addBook(bookDto);
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET , value="/get" )
	public ResponseEntity<List<BookDTO>>  getBookByAuthorName(@RequestParam("authorName")  String authorName) throws InfyBookException{
		
		return new ResponseEntity<List<BookDTO>>(bookService.getBookByAuthorName(authorName), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/getbooks" )
	public ResponseEntity<List<BookDTO>>  getBookGreaterThanEqualToPrice(@RequestParam("price")  Integer price) throws InfyBookException{
		
		return new ResponseEntity<List<BookDTO>>(bookService.getBookGreaterThanEqualToPrice(price), HttpStatus.OK);
	}
	
}
