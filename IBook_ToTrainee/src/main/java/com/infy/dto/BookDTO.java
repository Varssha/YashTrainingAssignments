package com.infy.dto;

import java.time.LocalDate;

public class BookDTO {

	private Integer bookId;
	private String bookName;
	private String authorName;
	private LocalDate publishedYear;
	private String publisher;
	private Long isbn;
	private Integer price;

	public BookDTO() {}
	
	public BookDTO(Integer bookId, String bookName, String authorName, LocalDate publishedYear, String publisher,
			Long isbn, Integer price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishedYear = publishedYear;
		this.publisher = publisher;
		this.isbn = isbn;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public LocalDate getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(LocalDate publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", publishedYear=" + publishedYear + ", publisher=" + publisher + ", isbn=" + isbn + ", price="
				+ price + "]";
	}

}
