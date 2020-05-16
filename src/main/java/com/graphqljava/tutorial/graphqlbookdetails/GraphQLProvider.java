/*
package com.graphqljava.tutorial.graphqlbookdetails;

import org.springframework.stereotype.Component;

@Component
public class GraphQLProvider {

	*/
/*private GraphQL graphQL;

	@Bean
	public GraphQL graphQL() {
		return graphQL;
	}

	@Autowired GraphQLDataFetchers graphQLDataFetchers;

	@PostConstruct
	public void init() throws IOException {
		File file = new File(ClassLoader.getSystemClassLoader().getResource("schema.graphqls").getFile());
		String sdl = FileUtils.readFileToString(file, "UTF-8");
		GraphQLSchema graphQLSchema = buildSchema(sdl);
		this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
	}

	private GraphQLSchema buildSchema(String sdl) {
		TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(sdl);
		RuntimeWiring runtimeWiring = buildWiring();
		SchemaGenerator schemaGenerator = new SchemaGenerator();
		return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring);
	}

	private RuntimeWiring buildWiring() {
		return RuntimeWiring.newRuntimeWiring().type(newTypeWiring("Query").dataFetcher("bookById", graphQLDataFetchers.getBookByIdDataFetcher()))
				.type(newTypeWiring("Book").dataFetcher("author", graphQLDataFetchers.getAuthorDataFetcher())).build();
	}*//*

}
*/
