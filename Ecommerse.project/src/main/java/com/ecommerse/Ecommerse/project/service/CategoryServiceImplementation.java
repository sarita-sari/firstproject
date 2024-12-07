package com.ecommerse.Ecommerse.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerse.Ecommerse.project.modal.Category;

@Service
public class CategoryServiceImplementation implements CategoryService {
	
	private List<Category> cat = new ArrayList<Category>(); 

	@Override
	public List<Category> getAllCategories() {
		return cat;
	}

	@Override
	public void createCategory(Category category) {
		cat.add(category);
		
	}

	@Override
	public String deleteCategory(long categoryId) {
		Category category = cat.stream()
				.filter(c -> c.getCategoryId() == categoryId)
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resourse not found"));
		
		cat.remove(category);
		return "Deleted" + category + "successfully!";
	}

}
