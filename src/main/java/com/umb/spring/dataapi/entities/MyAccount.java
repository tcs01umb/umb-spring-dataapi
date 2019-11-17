package com.umb.spring.dataapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import com.umb.spring.dataapi.models.MyAccountRO;

import java.util.Date;

@Entity
@Table(name="MYACCOUNT")
public class MyAccount {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String type;
	private String lineOfBusiness;
	@Temporal(TemporalType.DATE)
	private Date effectiveDate;
	private String monthlyPremium;
	public MyAccount() {
		
	}
	public MyAccount(MyAccountRO ma) {
		this.id = ma.getId();
		this.type=ma.getType();
		this.lineOfBusiness=ma.getLineOfBusiness();
		this.effectiveDate = ma.getEffectiveDate();
		this.monthlyPremium=ma.getMonthlyPremium();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getMonthlyPremium() {
		return monthlyPremium;
	}
	public void setMonthlyPremium(String monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}
}
