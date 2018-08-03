package com.su.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_Image")
public class ProductImage {

	@Id
	@Column(name = "product_Image_Url")
    private String productImageUrl;
	
	@Column(name = "product_Image_Thumbnail_Url")
    private String productImageThumbnailUrl;

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

	@Override
	public String toString() {
		return "ProductImage [productImageUrl=" + productImageUrl + ", productImageThumbnailUrl="
				+ productImageThumbnailUrl + "]";
	}
	
	
	
    
    
    
}
