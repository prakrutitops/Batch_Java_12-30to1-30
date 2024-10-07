package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Person1")
public class Person 
{
	@Id
	@GeneratedValue(generator="increment")//id
	@GenericGenerator(name="increment",strategy="increment")
	@Column(name="pid")//colname=pid
	private int id;
	
	@Column(name="pname")//colname=pname
	private String name12;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name12;
	}
	public void setName(String name) {
		this.name12 = name;
	}
	

}
