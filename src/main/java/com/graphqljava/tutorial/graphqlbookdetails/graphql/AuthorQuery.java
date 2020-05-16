package com.graphqljava.tutorial.graphqlbookdetails.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphqljava.tutorial.graphqlbookdetails.model.Author;
import com.graphqljava.tutorial.graphqlbookdetails.model.Book;
import com.graphqljava.tutorial.graphqlbookdetails.service.AuthorService;
import com.graphqljava.tutorial.graphqlbookdetails.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorQuery implements GraphQLResolver<Book> {

	@Autowired private AuthorService authorService;

	public Author getAuthor(final Book book) {
		System.out.println("Query to fetch author");
		return this.authorService.getAuthor(book);
	}

}
