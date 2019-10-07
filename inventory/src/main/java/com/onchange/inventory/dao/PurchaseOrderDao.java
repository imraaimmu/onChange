package com.onchange.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.onchange.inventory.dto.PurchaseOrderDto;

public interface  PurchaseOrderDao  extends CrudRepository<PurchaseOrderDto, Long>{
	
	
}
