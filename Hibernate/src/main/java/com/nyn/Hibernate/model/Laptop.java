package com.nyn.Hibernate.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Laptop {
	@Id
	/* @GeneratedValue */
	private int lid;
	private String lname;
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
