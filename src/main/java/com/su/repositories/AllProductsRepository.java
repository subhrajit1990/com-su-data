package com.su.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.su.entities.Product;
import com.su.entities.ProductRequest;

@Repository
public interface AllProductsRepository extends CrudRepository<Product, Integer> {

	@Query("SELECT  NEW com.su.entities.ProductRequest(p.productName,pImage.productImageUrl,pImage.productImageThumbnailUrl,p.productPrice,p.headerTopRightText,p.headerTopLeftText,p.productCtaText,p.productDetails) FROM Product p JOIN p.productImage pImage") 
	List<Object> fetchAll();

}


