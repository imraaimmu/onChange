package com.onchange.inventory.dto.links;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.onchange.inventory.dto.PurchaseOrderDto;

@Entity
public class VendorLinkDto {

	
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getAlternateNo() {
		return alternateNo;
	}

	public void setAlternateNo(String alternateNo) {
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
	@Column(name = "vendor_id",unique = true, nullable = false)
	private long vendorId;
	
	private String name;
	
	private String address;
	
	private String mobileNo;
	
	private String landline;
	
	private String alternateNo;
	
	private String mailId;
	
	@OneToOne(mappedBy = "vendor",targetEntity = PurchaseOrderDto.class,cascade = {CascadeType.ALL})
	private PurchaseOrderDto purchaseOrderDto;
	
}
