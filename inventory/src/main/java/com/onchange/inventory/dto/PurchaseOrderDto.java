package com.onchange.inventory.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrderDto {

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public VendorPoLinkDto getVendor() {
		return vendor;
	}

	public void setVendor(VendorPoLinkDto vendor) {
		this.vendor = vendor;
	}

	public SiteDto getSite() {
		return site;
	}

	public void setSite(SiteDto site) {
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

	
	public List<ItemDto> getItems() {
		return items;
	}

	public void setItems(List<ItemDto> items) {
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
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long pid;
	
	private LocalDate date;
	
	@OneToOne
	@JoinColumn(name="vid")
	private VendorPoLinkDto vendor;
	
	@OneToOne
	@JoinColumn(name="sid")
	private SiteDto site; //.it contains delivery address
	
	private String contactPersonName;
	
	private Integer contactNo;
	
	private Float initialPayment;
	
	private Float  totalPayment;
	
	private Float  balancePayment;
	
	private Integer paymentStatus;//0 -> unpaid 1-> paid -> 2 partially paid
	
	private LocalDate expectedDeliveryDate;
	
	private LocalDate actualDeliveryDate;
	
	@ManyToOne
	private List<ItemDto> items;
	
	private Float grandTotal;
	
	private boolean testCertificateRequired;
	
	private String checkedBy;
	
	private String authorizedBy;
	
	
	
}
