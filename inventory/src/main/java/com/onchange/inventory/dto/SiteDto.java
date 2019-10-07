package com.onchange.inventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class SiteDto {

	public long getSid() {
		return siteId;
	}

	public void setSid(long sid) {
		this.siteId = sid;
	}

	public String getSame() {
		return same;
	}

	public void setSame(String same) {
		this.same = same;
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

	public Integer getInchargeContactNumber() {
		return inchargeContactNumber;
	}

	public void setInchargeContactNumber(Integer inchargeContactNumber) {
		this.inchargeContactNumber = inchargeContactNumber;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "site_id", unique = true, nullable = false)
	private long siteId;
	
	private String same;
	
	private String address;
	
	private String incharge;
	
	private Integer inchargeContactNumber;
	
}
