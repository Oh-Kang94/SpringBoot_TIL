package com.springlec.base.model;

import java.sql.Timestamp;

public class ADto {
	int aId;
	String aName;
	String aPhone;
	String aAddress;
	String aEmail;
	String aRelation;
	Timestamp aInsertdate;
	
	public ADto() {
		// TODO Auto-generated constructor stub
	}

	public ADto(int aId, String aName, String aPhone, String aAddress, String aEmail, String aRelation,
			Timestamp aInsertdate) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aPhone = aPhone;
		this.aAddress = aAddress;
		this.aEmail = aEmail;
		this.aRelation = aRelation;
		this.aInsertdate = aInsertdate;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaPhone() {
		return aPhone;
	}

	public void setaPhone(String aPhone) {
		this.aPhone = aPhone;
	}

	public String getaAddress() {
		return aAddress;
	}

	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getaRelation() {
		return aRelation;
	}

	public void setaRelation(String aRelation) {
		this.aRelation = aRelation;
	}

	public Timestamp getaInsertdate() {
		return aInsertdate;
	}

	public void setaInsertdate(Timestamp aInsertdate) {
		this.aInsertdate = aInsertdate;
	}
	
	
}
