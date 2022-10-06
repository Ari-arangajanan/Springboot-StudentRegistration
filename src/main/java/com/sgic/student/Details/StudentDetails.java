package com.sgic.student.Details;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// this entity class will convert the class in to table data 

@Entity  //this annotation tells the JPA to these are the things need to be saved in the DB
@Table
public class StudentDetails {
   
	@Id // setup the primary 
	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private int mobileNumber;
	private String email;
	private String DateOfBirth;
	private int age;
	
	public StudentDetails() {
		
	}
	
	public StudentDetails(String id, String firstName, String lastName, String address, int mobileNumber, String email,
			String dateOfBirth, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.DateOfBirth = dateOfBirth;
		this.age = age;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
 }
