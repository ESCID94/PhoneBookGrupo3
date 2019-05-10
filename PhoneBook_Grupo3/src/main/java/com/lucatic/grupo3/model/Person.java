package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Person {
	private long id;
	private String name;
	private String lastName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(long id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
	

}
