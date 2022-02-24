package com.cdac.service;
import java.util.List;

import com.cdac.model.AddBook;


public interface AddBookService {
	public void createAddBook(AddBook cat);//to sace tourpackage
	//public AddBook findById(int id);//to find out tour package based on primary key id
	//public List<AddBook> getCategory();//to get all tour packages
	public AddBook update(int id,String catname);//update the tour package based od id
	//public void deletetCategoryById(int id);//to delete tour pack
	//void createAddBook(AddBook cat);
	void createBook(AddBook cat);
	AddBook findById(int id);
	List<AddBook> getCategory();
}