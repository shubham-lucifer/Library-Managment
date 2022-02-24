package com.cdac.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.cdac.model.Category;

import com.cdac.util.*;

public class CategoryServiceImpl implements CategoryService{
	
	Session session=null;
//used for saving the category details
	@Override
	public void createCategory(Category cat) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		 session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(cat);
		tx.commit();
		session.close();
		
	}

	@Override
	public Category findById(int id) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		 session = sf.openSession();
		Transaction tx=session.beginTransaction();
		Category cat =  (Category) session.get(Category.class, id);
	        session.getTransaction().commit();
	        session.close();
	        return cat;
	}

	@Override
	public ArrayList<Category> getCategory() {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql = "FROM Category";
		Query query = session.createQuery(hql);
		
	
		
		ArrayList<Category> results = (ArrayList<Category>) query.list();
		
	return results;
	}

	@Override
	public Category update(int id,String catname) {
		System.out.println("id"+id+"name"+catname);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		 session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Category cat1 =  (Category) session.get(Category.class,id);
        cat1.setCatname(catname);
        session.update(cat1);
        session.getTransaction().commit();
        session.close();
		return cat1;
	}

	@Override
	public void deletetCategoryById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		 session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Category cat1 =  (Category) session.get(Category.class,id);//select * from category_tb where  id=4
		session.delete(cat1);
		tx.commit();
		
		


	}

	
}
