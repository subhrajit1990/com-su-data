package com.su.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.su.entities.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
