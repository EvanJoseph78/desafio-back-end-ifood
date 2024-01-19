package com.evan.desafiobackendifood.config.mongo;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.context.annotation.Bean;

public class MongoDBconfig {
  @Bean
  public MongoDatabaseFactory mongoConfigure() {
    return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017");
  }

  @Bean
  public MongoTemplate mongoTemplate() {
    return new MongoTemplate(mongoConfigure());
  }
}
