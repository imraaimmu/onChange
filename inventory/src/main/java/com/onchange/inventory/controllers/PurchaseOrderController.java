package com.onchange.inventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onchange.inventory.dao.ItemDao;
import com.onchange.inventory.dao.PurchaseOrderDao;
import com.onchange.inventory.dao.SiteDao;
import com.onchange.inventory.dao.VendorDao;
import com.onchange.inventory.dao.links.ItemLinkDao;
import com.onchange.inventory.dao.links.SiteLinkDao;
import com.onchange.inventory.dao.links.VendorLinkDao;
import com.onchange.inventory.dto.PurchaseOrderDto;

@RestController
@RequestMapping(value={"/purchaseorder"})
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class PurchaseOrderController {

	@Autowired
	ItemLinkDao itemLinkDao;

	@Autowired
	ItemDao itemDao;
	
	@Autowired
	PurchaseOrderDao purchaseOrderService;
	
	@Autowired
	SiteLinkDao siteLinkDao;

	@Autowired
	SiteDao siteDao;

	@Autowired
	VendorLinkDao vendorLinkDao;

	@Autowired
	VendorDao vendorDao;
	
	@RequestMapping(value={"/save","/update"})
	public void insert(@RequestBody PurchaseOrderDto purchaseOrder) {
		vendorLinkDao.save(purchaseOrder.getVendor());
		siteLinkDao.save(purchaseOrder.getSite());
		purchaseOrderService.save(purchaseOrder);
		purchaseOrder.getItems().forEach(item->{
			itemLinkDao.save(item);
		});
	}
	
	@GetMapping("/initial")
    ResponseEntity<?> getInitialData() {
		long poCount = purchaseOrderService.count()+1;
        return ResponseEntity.ok().body(poCount);
    }
	

	@RequestMapping(value={"/po/{id}"})
	public void getSingle(@PathVariable long id) {
		purchaseOrderService.findById(id);
	}
	
	@RequestMapping(value={"/delete/{id}"})
	public void delete(@PathVariable long id) {
		purchaseOrderService.deleteById(id);
	}
	
	@RequestMapping(value={"/list"})
	public List<PurchaseOrderDto> getPoList() {
			 return purchaseOrderService.findAll();
	}
}
