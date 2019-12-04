package com.onchange.inventory.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.onchange.inventory.dto.links.ItemLinkDto;
import com.onchange.inventory.dto.links.SiteLinkDto;
import com.onchange.inventory.dto.links.VendorLinkDto;

@Entity
public class PurchaseOrderDto {

	
	public long getPoId() {
		return poId;
	}

	public void setPoId(long poId) {
		this.poId = poId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public SiteLinkDto getSite() {
		return site;
	}

	public void setSite(SiteLinkDto site) {
		this.site = site;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public Float getInitialPayment() {
		return initialPayment;
	}

	public void setInitialPayment(Float initialPayment) {
		this.initialPayment = initialPayment;
	}

	public Float getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(Float totalPayment) {
		this.totalPayment = totalPayment;
	}

	public Float getBalancePayment() {
		return balancePayment;
	}

	public void setBalancePayment(Float balancePayment) {
		this.balancePayment = balancePayment;
	}

	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public LocalDate getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(LocalDate actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public List<ItemLinkDto> getItems() {
		return items;
	}

	public void setItems(List<ItemLinkDto> items) {
		this.items = items;
	}

	public Float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public boolean isTestCertificateRequired() {
		return testCertificateRequired;
	}

	public void setTestCertificateRequired(boolean testCertificateRequired) {
		this.testCertificateRequired = testCertificateRequired;
	}

	public String getCheckedBy() {
		return checkedBy;
	}

	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}

	public String getAuthorizedBy() {
		return authorizedBy;
	}

	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}

	@Id
	@Column(unique = true, nullable = false)
	private long poId;
	
	private String date;
	
	@OneToOne(fetch = FetchType.LAZY)
	private VendorLinkDto vendor;
	
	public VendorLinkDto getVendor() {
		return vendor;
	}

	public void setVendor(VendorLinkDto vendor) {
		this.vendor = vendor;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	private SiteLinkDto site; //.it contains delivery address
	
	private String contactPersonName;
	
	private Integer contactNo;
	
	private Float initialPayment;
	
	private Float  totalPayment;
	
	private Float  balancePayment;
	
	private Integer paymentStatus;//0 -> unpaid 1-> paid -> 2 partially paid
	
	private LocalDate expectedDeliveryDate;
	
	private LocalDate actualDeliveryDate;
	
	@OneToMany(fetch = FetchType.LAZY,targetEntity=ItemLinkDto.class)
	private List<ItemLinkDto> items;
	
	private Float grandTotal;
	
	private boolean testCertificateRequired;
	
	private String checkedBy;
	
	private String authorizedBy;
	
	
}
