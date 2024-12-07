package com.ecommerse.Ecommerse.project.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "categories")
public class Category {
	
	@Id
	private long categoryId;
	private String categoryName;
	
	public Category(long categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}
