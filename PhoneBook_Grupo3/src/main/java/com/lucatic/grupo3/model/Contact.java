package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;


@Entity
@Data
public class Contact {
	
	private Long id;
	private Person person;
	private Address address;
	private Phone phone;
	private Province province;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contact(Long id, Person person, Address address, Phone phone, Province province) {
		super();
		this.id = id;
		this.person = person;
		this.address = address;
		this.phone = phone;
		this.province = province;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", person=" + person + ", address=" + address + ", phone=" + phone + ", province="
				+ province + "]";
	}

	
}
