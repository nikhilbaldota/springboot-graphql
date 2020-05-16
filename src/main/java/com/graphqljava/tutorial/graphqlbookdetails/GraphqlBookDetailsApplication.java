package com.graphqljava.tutorial.graphqlbookdetails;

import com.graphqljava.tutorial.graphqlbookdetails.graphql.BookQuery;
import com.graphqljava.tutorial.graphqlbookdetails.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlBookDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlBookDetailsApplication.class, args);
	}

}
