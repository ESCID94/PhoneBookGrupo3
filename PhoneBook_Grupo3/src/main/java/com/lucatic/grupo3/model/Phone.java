package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Phone {
	private int phoneNumber;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(int phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + "]";
	}
	
	
}
