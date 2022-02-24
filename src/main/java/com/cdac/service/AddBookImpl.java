package com.cdac.service;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.cdac.model.AddBook;
import com.cdac.util.*;

public class AddBookImpl implements AddBookService{
	
	Session session=null;
//used for saving the category details
	public void createAddBook(AddBook cat) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		 session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(cat);
		tx.commit();
		session.close();
		
	}
	@Override
	public AddBook findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<AddBook> getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddBook update(int id, String catname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	public void createBook(AddBook cat) {
		// TODO Auto-generated method stub
	
	}
	
}
