package com.cdac.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addbook_tb")
public class AddBook {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "isbn")
	private int isbn;  
	
	private String bname;
	private String pubname;
	private String lang;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getPubname() {
		return pubname;
	}
	public void setPubname(String pubname) {
		this.pubname = pubname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getCattype() {
		return cattype;
	}
	public void setCattype(String cattype) {
		this.cattype = cattype;
	}
	public int getActualcopy() {
		return actualcopy;
	}
	public void setActualcopy(int actualcopy) {
		this.actualcopy = actualcopy;
	}
	public int getCurrentcopy() {
		return currentcopy;
	}
	public void setCurrentcopy(int currentcopy) {
		this.currentcopy = currentcopy;
	}
	private String cattype;
	private int actualcopy;
	private int currentcopy;
	
	
}
