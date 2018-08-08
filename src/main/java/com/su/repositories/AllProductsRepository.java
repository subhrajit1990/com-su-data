package com.su.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.su.entities.Product;

@Repository
public interface AllProductsRepository extends CrudRepository<Product, Integer> {

	@Query("SELECT  new com.su.entities.ProductRequest(p.productName,pImage.productImageUrl) FROM Product p JOIN ProductImage pImage") 
	public List<Object> fetchAll();

}

