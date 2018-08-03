package com.su.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_Details")
public class Product {

	@Id
	@Column(name = "product_Id")
	private String productId;
	
	@Column(name = "product_Name")
	private String productName;
	
	@Column(name = "product_Price")
    private String productPrice;
	
	@Column(name = "product_Top_Right_Text")
    private String headerTopRightText;
	
	@Column(name = "product_Top_Left_Text")
    private String headerTopLeftText;
	
	@Column(name = "product_Cta_Text")
    private String productCtaText;
	
	@Column(name = "product_Id")
    private String productDetails;

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

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", headerTopRightText=" + headerTopRightText + ", headerTopLeftText=" + headerTopLeftText
				+ ", productCtaText=" + productCtaText + ", productDetails=" + productDetails + "]";
	}
	
	
	
    
}
