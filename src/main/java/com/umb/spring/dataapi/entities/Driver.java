package com.umb.spring.dataapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import com.umb.spring.dataapi.models.DriverRO;

import java.util.Date;

@Entity
@Table(name="DRIVER")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String gender;
	private String ssn;
	private String licenseNumber;
	private String licenseState;
	public Driver() {
		
	}
	public Driver(DriverRO dr) {
		this.id = dr.getId();
		this.firstName=dr.getFirstName();
		this.lastName=dr.getLastName();
		this.dateOfBirth = dr.getDateOfBirth();
		this.gender=dr.getGender();
		this.ssn=dr.getSsn();
		this.licenseNumber=dr.getLicenseNumber();
		this.licenseState=dr.getLicenseState();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLicenseState() {
		return licenseState;
	}
	public void setLicenseState(String licenseState) {
		this.licenseState = licenseState;
	}
	
}
