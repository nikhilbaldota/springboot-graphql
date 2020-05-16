package com.graphqljava.tutorial.graphqlbookdetails.dao;

import com.graphqljava.tutorial.graphqlbookdetails.model.Author;
import com.graphqljava.tutorial.graphqlbookdetails.model.Book;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorDao {
	List<Book> books = new ArrayList<>();
	List<Author> authors = new ArrayList<>();

	@PostConstruct
	public void init() {

		Author author1 = new Author();
		author1.setId("author-1");
		author1.setFirstName("Joanne");
		author1.setLastName("Rowling");
		authors.add(author1);

		Book book1 = new Book();
		book1.setId("book-1");
		book1.setName("Harry Potter and the Philosopher's Stone");
		book1.setPageCount("223");
		book1.setAuthor(author1);
		books.add(book1);

		Author author2 = new Author();
		author2.setId("author-2");
		author2.setFirstName("Herman");
		author2.setLastName("Melville");
		authors.add(author2);

		Book book2 = new Book();
		book2.setId("book-2");
		book2.setName("Moby Dick");
		book2.setPageCount("635");
		book2.setAuthor(author2);
		books.add(book2);

	}

	public Author getAuthor(Book book) {
		return authors.stream().filter(author -> author.getId().equals(book.getAuthor().getId())).findFirst().orElse(null);

	}
}
