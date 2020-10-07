package com.nyn.Hibernate.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class Stu_dent {
	@Id
	/* @GeneratedValue(strategy = GenerationType.AUTO) */
	private int id;
	@Column(unique = true)
	private String name;
	@OneToOne 
	private Laptop laptop;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Stu_dent(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}
	
	public Stu_dent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stu_dent [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
}
