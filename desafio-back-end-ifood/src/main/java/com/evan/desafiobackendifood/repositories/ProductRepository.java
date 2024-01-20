package com.evan.desafiobackendifood.repositories;

import com.evan.desafiobackendifood.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
