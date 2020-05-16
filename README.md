# sprintboot-graphql


References -
https://graphql.org/
https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/
https://www.baeldung.com/spring-graphql
https://dzone.com/articles/graphql-with-springboot

Some basics -
GraphQLQueryResolver
- Since the Query/Mutation/Subscription objects are root GraphQL objects, they don’t have an associated data class. In those cases, any resolvers implementing GraphQLQueryResolver, GraphQLMutationResolver, or GraphQLSubscriptionResolver will be searched for methods that map to fields in their respective root types.
Here in this case BookQuery will be searched for bookById

GraphQLResolver
- When given a AuthorQuery instance, GraphQL Java Tools first attempts to map fields to methods on the resolver before mapping them to fields or methods on the data class. If there is a matching method on the resolver, the data class instance is passed as the first argument to the resolver function. This does not apply to root resolvers, since those don’t have a data class to resolve for. An optional parameter can be defined to inject the DataFetchingEnvironment, and must be the last argument.
Here in this case AuthorQuery will be searched for getAuthor

GraphQLMutationResolver
- Mutations should be used to inform the client that this will cause a change to the data being stored. Use it for insert / update operations
e.g.: type Mutation {
          writePost(title: String!, text: String!, category: String) : Post!
      }

How to run -

1. Run using command - mvn spring-boot:run
2. You can use postman 7+ which supports graphQL
3. Hit below request
{
  bookById(id: "book-1"){
    id
    name
    pageCount
    author {
      firstName
      lastName
    }
  }
}
4. Hit below request. In this case you will see "Query to fetch author" statement wont be printed in the console.
This demonstrates that graphQL would return only what you have queried for adn not unnecessary fetch all the data.
{
  bookById(id: "book-1"){
    id
    name
    pageCount
  }
}

