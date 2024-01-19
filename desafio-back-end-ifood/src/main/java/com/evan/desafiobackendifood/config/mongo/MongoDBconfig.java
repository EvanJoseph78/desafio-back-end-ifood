package com.evan.desafiobackendifood.config.mongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.context.annotation.Bean;

@Configuration
public class MongoDBconfig {

  @Bean
  public MongoDatabaseFactory mongoConfigure() {
    return new SimpleMongoClientDatabaseFactory(
        "mongodb://localhost:27017/product-satalog");
  }

  @Bean
  public MongoTemplate mongoTemplate() {
    return new MongoTemplate(mongoConfigure());
  }
}
