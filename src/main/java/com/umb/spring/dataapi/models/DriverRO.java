package com.umb.spring.dataapi.models;

import java.util.Date;

import com.umb.spring.dataapi.entities.Driver;

public class DriverRO {
	private String id;
	private String firstName;
	private String lastName;
//	private Date dateOfBirth;
//	private String gender;
//	private String ssn;
//	private String licenseNumber;
//	private String licenseState;
	
	public DriverRO() {
		
	}
	public DriverRO(String id,String firstName, String lastName) {
		this.id = id;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public DriverRO(Driver dr) {
		this.id = dr.getId();
		this.firstName=dr.getFirstName();
		this.lastName=dr.getLastName();
//		this.dateOfBirth = dr.getDateOfBirth();
//		this.gender=dr.getGender();
//		this.ssn=dr.getSsn();
//		this.licenseNumber=dr.getLicenseNumber();
//		this.licenseState=dr.getLicenseState();
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
//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getSsn() {
//		return ssn;
//	}
//	public void setSsn(String ssn) {
//		this.ssn = ssn;
//	}
//	public String getLicenseNumber() {
//		return licenseNumber;
//	}
//	public void setLicenseNumber(String licenseNumber) {
//		this.licenseNumber = licenseNumber;
//	}
//	public String getLicenseState() {
//		return licenseState;
//	}
//	public void setLicenseState(String licenseState) {
//		this.licenseState = licenseState;
//	}
	
}
