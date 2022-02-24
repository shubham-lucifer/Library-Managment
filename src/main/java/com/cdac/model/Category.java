package com.cdac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category_tb")
public class Category {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//for using the generation algorithm for creating primary key as autoincrement
    @Column(name = "id")
private int catid;  
	
	private String catname;

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public int getCatid() {
		return catid;
	}

}
