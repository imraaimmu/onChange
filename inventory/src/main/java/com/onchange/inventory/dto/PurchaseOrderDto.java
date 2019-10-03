package com.onchange.inventory.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order_dto")
public class PurchaseOrderDto {

	
	public long getPoId() {
		return poId;
	}

	public void setPoId(long poId) {
		this.poId = poId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "purchase_order_dto", cascade = CascadeType.ALL)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchase_order_dto")
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
	@Column(name = "po_id", unique = true, nullable = false)
	private long poId;
	
	private LocalDate date;
	
	private VendorsDto vendor;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "purchase_order_dto", cascade = CascadeType.ALL)
	public VendorsDto getVendor() {
		return vendor;
	}

	public void setVendor(VendorsDto vendor) {
		this.vendor = vendor;
	}

	private SiteDto site; //.it contains delivery address
	
	private String contactPersonName;
	
	private Integer contactNo;
	
	private Float initialPayment;
	
	private Float  totalPayment;
	
	private Float  balancePayment;
	
	private Integer paymentStatus;//0 -> unpaid 1-> paid -> 2 partially paid
	
	private LocalDate expectedDeliveryDate;
	
	private LocalDate actualDeliveryDate;
	
	
	private List<ItemDto> items;
	
	private Float grandTotal;
	
	private boolean testCertificateRequired;
	
	private String checkedBy;
	
	private String authorizedBy;
	
	
	
}
