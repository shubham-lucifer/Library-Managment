package com.cdac.service;

import java.util.List;

import com.cdac.model.AddBook;
import com.cdac.model.Category;

public interface CategoryService {
	
	public Category findById(int id);//to find out tour package based on primary key id
	public List<Category> getCategory();//to get all tour packages
	public Category update(int id,String catname);//update the tour package based od id
	public void deletetCategoryById(int id);//to delete tour pack
	
	void createCategory(Category cat);

}