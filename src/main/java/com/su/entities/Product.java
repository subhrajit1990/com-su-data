package com.su.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class Product {

	@Id
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
    private String productPrice;
	
	@Column(name = "product_top_right_text")
    private String headerTopRightText;
	
	@Column(name = "product_top_left_text")
    private String headerTopLeftText;
	
	@Column(name = "product_cta_text")
    private String productCtaText;
	
	@Column(name = "product_details")
    private String productDetails;

	
	@OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "product")
	private ProductImage productImage;
	
	


	public ProductImage getProductImage() {
		return productImage;
	}

	public void setProductImage(ProductImage productImage) {
		this.productImage = productImage;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getHeaderTopRightText() {
		return headerTopRightText;
	}

	public void setHeaderTopRightText(String headerTopRightText) {
		this.headerTopRightText = headerTopRightText;
	}

	public String getHeaderTopLeftText() {
		return headerTopLeftText;
	}

	public void setHeaderTopLeftText(String headerTopLeftText) {
		this.headerTopLeftText = headerTopLeftText;
	}

	public String getProductCtaText() {
		return productCtaText;
	}

	public void setProductCtaText(String productCtaText) {
		this.productCtaText = productCtaText;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	
//	create table product_details
//	product_Id VARCHAR(50) NOT NULL,
//	product_Name VARCHAR(100),
//	product_Price DECIMAL(10 , 2) DEFAULT 0.00,
//	product_Top_Right_Text VARCHAR(100),
//	product_Top_Left_Text VARCHAR(100),
//	product_Details VARCHAR(100),
//
//	PRIMARY KEY(product_Id)
//
//	 ;

		
	
    
}
