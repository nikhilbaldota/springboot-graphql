package com.graphqljava.tutorial.graphqlbookdetails.service;

import com.graphqljava.tutorial.graphqlbookdetails.dao.BookDao;
import com.graphqljava.tutorial.graphqlbookdetails.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BookService {

	@Autowired BookDao bookDao;

	public Book getBookById(final String id) {
		return this.bookDao.getBookById(id);
	}
}
