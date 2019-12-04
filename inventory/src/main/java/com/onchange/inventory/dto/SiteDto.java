package com.onchange.inventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SiteDto {

	public long getSid() {
		return siteId;
	}

	public void setSid(long sid) {
		this.siteId = sid;
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

	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String getInchargeContactNumber() {
		return inchargeContactNumber;
	}

	public void setInchargeContactNumber(String inchargeContactNumber) {
		this.inchargeContactNumber = inchargeContactNumber;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "site_id", unique = true, nullable = false)
	private long siteId;
	
	private String name;
	
	private String address;
	
	private String incharge;
	
	private String inchargeContactNumber;
	
}
