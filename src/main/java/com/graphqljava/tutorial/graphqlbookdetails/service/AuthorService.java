package com.graphqljava.tutorial.graphqlbookdetails.service;

import com.graphqljava.tutorial.graphqlbookdetails.dao.AuthorDao;
import com.graphqljava.tutorial.graphqlbookdetails.dao.BookDao;
import com.graphqljava.tutorial.graphqlbookdetails.model.Author;
import com.graphqljava.tutorial.graphqlbookdetails.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AuthorService {

	@Autowired AuthorDao authorDao;

	public Author getAuthor(final Book book) {
		return this.authorDao.getAuthor(book);
	}
}
