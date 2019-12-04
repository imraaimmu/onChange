package com.onchange.inventory.dto.links;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.onchange.inventory.dto.PurchaseOrderDto;

@Entity
public class ItemLinkDto {

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Float getMrp() {
		return mrp;
	}

	public void setMrp(Float mrp) {
		this.mrp = mrp;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "item_id", unique = true, nullable = false)
	private long itemId;
	
	@ManyToOne
	private PurchaseOrderDto purchaseOrder;
	
	public PurchaseOrderDto getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrderDto purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	private Integer sNo;
	
	private String itemName;
	
	private String unit; //REFER unit ENUM
	
	private Float quantity;
	
	private Float mrp;
	
	private Float unitPrice;
	
	private Float totalPrice;
	
	
}
