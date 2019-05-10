package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Province {
	private long zipCode;
	private String name;
	private String acronym;
	private String country;
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Province(long zipCode, String name, String acronym, String country) {
		super();
		this.zipCode = zipCode;
		this.name = name;
		this.acronym = acronym;
		this.country = country;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Province [zipCode=" + zipCode + ", name=" + name + ", acronym=" + acronym + ", country=" + country
				+ "]";
	}
	
	
}
