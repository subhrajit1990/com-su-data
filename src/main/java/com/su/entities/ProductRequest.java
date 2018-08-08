package com.su.entities;

public class ProductRequest {

	private String productName;
    private String productImageUrl;
    private String productImageThumbnailUrl;
    private String productPrice;
    private String headerTopRightText;
    private String headerTopLeftText;
    private String productCtaText;
    private String productDetails;
    private String productId;
    
    
    public ProductRequest() {
    	
    }
    
    public ProductRequest(String productName, String productImageUrl) {
    	this.productName = productName;
    	this.productImageUrl = productImageUrl;
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
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public String getProductImageThumbnailUrl() {
		return productImageThumbnailUrl;
	}
	public void setProductImageThumbnailUrl(String productImageThumbnailUrl) {
		this.productImageThumbnailUrl = productImageThumbnailUrl;
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
		return "ProductRequest [productName=" + productName + ", productImageUrl=" + productImageUrl
				+ ", productImageThumbnailUrl=" + productImageThumbnailUrl + ", productPrice=" + productPrice
				+ ", headerTopRightText=" + headerTopRightText + ", headerTopLeftText=" + headerTopLeftText
				+ ", productCtaText=" + productCtaText + ", productDetails=" + productDetails + "]";
	}
    
    
    
}
