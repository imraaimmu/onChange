package com.onchange.inventory.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/purchaseorder"})
public class PurchaseOrderController {

	@RequestMapping(value={"/insertPo"})
	public void insertPo() {
		
	}

	@RequestMapping(value={"/getPo"})
	public void getPo() {

	}
	
	@RequestMapping(value={"/updatePo"})
	public void updatePo() {

	}
	
	@RequestMapping(value={"/deletePo"})
	public void deletePo() {

	}
}
