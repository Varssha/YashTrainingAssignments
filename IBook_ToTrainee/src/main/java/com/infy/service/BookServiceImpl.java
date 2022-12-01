package com.infy.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.infy.dto.BookDTO;
import com.infy.entity.Book;
import com.infy.exception.InfyBookException;
import com.infy.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Lazy
	@Autowired
	ModelMapper modelMapper;

	@Override
	public BookDTO getBookDetails(Integer bookId) throws InfyBookException {
		Optional<Book> book = bookRepository.findById(bookId);
		book.orElseThrow(() -> new InfyBookException("Book not found"));
		BookDTO bookDto = this.modelMapper.map(book, BookDTO.class);
		return bookDto;
	}

	@Override
	public void addBook(BookDTO bookDTO) throws InfyBookException {
		Book book = this.modelMapper.map(bookDTO, Book.class);
		Book savedBook = bookRepository.save(book);
		this.modelMapper.map(savedBook, BookDTO.class);
	}

	@Override
	public List<BookDTO> getBookByAuthorName(String authorName) throws InfyBookException {
		List<Book> bookByAuthorName = bookRepository.getBookByAuthorName(authorName);
		return bookByAuthorName.stream().map(u -> this.modelMapper.map(u, BookDTO.class)).collect(Collectors.toList());

	}

	@Override
	public List<BookDTO> getBookGreaterThanEqualToPrice(Integer price) throws InfyBookException {
		List<Book> books = bookRepository.getBookGreaterThanEqualToPrice(price);
		return books.stream().map(b -> this.modelMapper.map(b, BookDTO.class)).collect(Collectors.toList());

	}

	@Override
	public List<BookDTO> getBookLessThanPrice(Integer price) throws InfyBookException {
		List<Book> bookLessThanPrice = bookRepository.getBookLessThanPrice(price);
		return bookLessThanPrice.stream().map(b1 -> this.modelMapper.map(b1, BookDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<BookDTO> bookPublishedBetweenYear(LocalDate startYear, LocalDate endYear) throws InfyBookException {
		List<Book> bookPublishedBetweenYear = bookRepository.bookPublishedBetweenYear(startYear, endYear);
		return bookPublishedBetweenYear.stream().map(c -> this.modelMapper.map(c, BookDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<BookDTO> bookPublishedAfterYear(LocalDate year) throws InfyBookException {
		List<Book> bookPublishedAfterYear = bookRepository.bookPublishedAfterYear(year);
		return bookPublishedAfterYear.stream().map(d -> this.modelMapper.map(d, BookDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<BookDTO> getBookByAuthorNameAndPublisher(String authorName, String publisher) throws InfyBookException {
		List<Book> bookByAuthorNameAndPublisher = bookRepository.getBookByAuthorNameAndPublisher(authorName, publisher);
		return bookByAuthorNameAndPublisher.stream().map(d -> this.modelMapper.map(d, BookDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public void updateBookPrice(Integer bookId, Integer price) throws InfyBookException {
		Book book = bookRepository.findById(bookId).orElseThrow(() -> new InfyBookException("Book not found"));
		book.setPrice(price);
		bookRepository.save(book);
	}

	@Override
	public void deleteBook(Integer bookId) throws InfyBookException {

		bookRepository.findById(bookId).orElseThrow(() -> new InfyBookException("Book not found"));
		bookRepository.deleteById(bookId);
	}
}
