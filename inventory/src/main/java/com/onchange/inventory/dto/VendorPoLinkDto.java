package com.onchange.inventory.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VendorPoLinkDto {


	public long getVid() {
		return vid;
	}

	public void setVid(long vid) {
		this.vid = vid;
	}

	public VendorsDto getVendor() {
		return vendor;
	}

	public void setVendor(VendorsDto vendor) {
		this.vendor = vendor;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	@Id
	private long vid;
	
	
	private VendorsDto vendor;

	private long pid;

	private String contactPersonName;

}
