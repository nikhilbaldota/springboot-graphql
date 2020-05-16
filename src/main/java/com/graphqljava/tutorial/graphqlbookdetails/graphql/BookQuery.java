package com.graphqljava.tutorial.graphqlbookdetails.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqljava.tutorial.graphqlbookdetails.model.Book;
import com.graphqljava.tutorial.graphqlbookdetails.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookQuery implements GraphQLQueryResolver {

	@Autowired private BookService bookService;

	public Book getBookById(final String id) {
		return this.bookService.getBookById(id);
	}

}
