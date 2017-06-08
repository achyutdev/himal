package com.himal.school.model;

import java.util.Date;

public class Person {

	private Long id;
	private String firstName;
	private String middleName;
	private String lasttName;
	private Address address;
	private Contact contact;
	private Date dateOfBirth;
	
	public Long getId() {
		return id;
	}

	public String getLasttName() {
		return lasttName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Address getAddress() {
		return address;
	}

	public String getFirstName() {
		return firstName;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
