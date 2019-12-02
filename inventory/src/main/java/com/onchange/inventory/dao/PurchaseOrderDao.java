package com.onchange.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onchange.inventory.dto.PurchaseOrderDto;

public interface  PurchaseOrderDao  extends JpaRepository<PurchaseOrderDto, Long>{
	
	
}
