package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Address {
	private String street;
	private int number;
	private int floor;
	private String door;
	private int postalCode;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, int number, int floor, String door, int postalCode, String city) {
		super();
		this.street = street;
		this.number = number;
		this.floor = floor;
		this.door = door;
		this.postalCode = postalCode;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", floor=" + floor + ", door=" + door
				+ ", postalCode=" + postalCode + ", city=" + city + "]";
	}
	
	
}
