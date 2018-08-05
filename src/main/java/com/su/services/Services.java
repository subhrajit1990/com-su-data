package com.su.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.apache.log4j.Logger;
import org.glassfish.jersey.internal.guava.Lists;
import org.hibernate.hql.internal.ast.tree.IsNotNullLogicOperatorNode;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.su.entities.Product;
import com.su.entities.ProductImage;
import com.su.entities.ProductRequest;
import com.su.entities.User;
import com.su.entities.UserRequest;
import com.su.repositories.ProductRepository;
import com.su.repositories.UserRepository;

@Service
public class Services {
	private Logger logger = Logger.getLogger(Services.class);
	
	HashMap<String, Object> response = null;
	@Inject
	UserRepository userRepository;
	
	@Inject
	ProductRepository productRepository;

	public ArrayList<User> viewUsers() {
		ArrayList<User> users = Lists.newArrayList(userRepository.findAll());
		logger.info("DATA " + users.toString());
		return users;
	}

	public Object userLogin(UserRequest userRequest) throws Exception {
		// TODO Auto-generated method 
		response = new HashMap<String, Object>();
		Optional<User> userLoginRes = userRepository.findById(userRequest.getUserId()); //(userRequest.getUserId());
		
		if(userLoginRes == null ){
			response.put("status", "100");
			response.put("message","No Record Found");
		}else {
			response.put("status", "0");
			response.put("message","Success");
		}
		return response;
	}

	public Object procuctDetails(ProductRequest productRequest)throws Exception {
		// TODO Auto-generated method stub
		
		response = new HashMap<String, Object>();
		
		Product product = new Product();
		ProductImage productImage = new ProductImage();
		
		product.setProductId(productRequest.getProductId());
		product.setHeaderTopLeftText(productRequest.getHeaderTopLeftText());
		product.setHeaderTopRightText(productRequest.getHeaderTopRightText());
		product.setProductCtaText(productRequest.getProductCtaText());
		product.setProductDetails(productRequest.getProductDetails());
		product.setProductName(productRequest.getProductName());
		product.setProductPrice(productRequest.getProductPrice());
		
		
		productImage.setProductImageThumbnailUrl(productRequest.getProductImageThumbnailUrl());
		productImage.setProductImageUrl(productRequest.getProductImageUrl());
		
		product.setProductImage(productImage);
		
		
		productImage.setProduct(product);
		
		//product.getProductImage().(productImage);
		
		productRepository.save(product);
		
		response.put("status", "success");
		
		return response;
	}

	public Object categoryMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object products() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object modifyUser(UserRequest userRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
