package com.infy.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.dto.BookDTO;
import com.infy.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	@Query("select b from Book b where b.authorName =:authorName")
	List<Book> getBookByAuthorName(@Param("authorName") String authorName);

	@Query("select b from Book b where b.price>=:price")
	List<Book> getBookGreaterThanEqualToPrice(@Param("price") Integer price);

	@Query("select b from Book b where b.price <:price")
	List<Book> getBookLessThanPrice(@Param("price") Integer price);

	@Query("select b from Book b where b.publishedYear Between :startYear and :endYear")
	List<Book> bookPublishedBetweenYear(@Param("startYear") LocalDate startYear,@Param("endYear") LocalDate endYear);

	@Query("select b from Book b where b.publishedYear > :year ")
    List<Book> bookPublishedAfterYear(@Param("year") LocalDate year) ;
	
	@Query("select b from Book b where b.authorName =:authorName and b.publisher=:publisher")
	List<Book> getBookByAuthorNameAndPublisher(@Param("authorName")String authorName, @Param("publisher")String publisher);


}