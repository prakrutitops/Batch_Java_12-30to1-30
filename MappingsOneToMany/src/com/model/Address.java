package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Address3")
public class Address 
{
	@OneToMany
	
	List<Person>list;
	
	public List<Person> getList() {
		return list;
	}
	public void setList(List<Person> list) {
		this.list = list;
	}
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")
	@Column(name="aid")
	
private int id;
	@Column(name="Address")
private String addr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}

}
