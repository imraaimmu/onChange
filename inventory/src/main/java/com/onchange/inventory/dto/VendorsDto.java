package com.onchange.inventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VendorsDto {

	
	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getLandline() {
		return landline;
	}

	public void setLandline(Integer landline) {
		this.landline = landline;
	}

	public Integer getAlternateNo() {
		return alternateNo;
	}

	public void setAlternateNo(Integer alternateNo) {
		this.alternateNo = alternateNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "vendor_id", unique = true, nullable = false)
	private long vendorId;
	
	private String name;
	
	private String address;
	
	private Integer mobileNo;
	
	private Integer landline;
	
	private Integer alternateNo;
	
	private String mailId;
	
}
