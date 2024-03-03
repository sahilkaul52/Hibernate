package com.sahil.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "custom_gen")
	@SequenceGenerator(name = "custom_gen", sequenceName = "cust_seq", initialValue = 1, allocationSize = 1) //allocationSize matlab kitne amount se next sequence ko badhaana hai
	private int userId;
	
    @Column(name="NAME", length=50)
	private String name;
	
	private String email;
	
	private String origin;
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
