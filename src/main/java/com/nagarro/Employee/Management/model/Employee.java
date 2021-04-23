package com.nagarro.Employee.Management.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
     private long empcode;
	@Column(name= "name")
     private String name;
     
     @Column(name= "location")
     private String location;
     
     @Column(name="email")
     private String email;
     
     @Column(name="dob")
     private String dob;
	public long getEmpcode() {
		return empcode;
	}
	public void setEmpcode(long empcode) {
		this.empcode = empcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
     
}
