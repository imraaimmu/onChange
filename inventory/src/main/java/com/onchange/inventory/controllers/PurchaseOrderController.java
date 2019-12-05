package com.onchange.inventory.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
import com.onchange.inventory.dto.ItemDto;
import com.onchange.inventory.dto.PurchaseOrderDto;
import com.onchange.inventory.dto.SiteDto;
import com.onchange.inventory.dto.VendorDto;
import com.onchange.inventory.dto.links.ItemLinkDto;
import com.onchange.inventory.dto.links.SiteLinkDto;
import com.onchange.inventory.dto.links.VendorLinkDto;
import com.onchange.inventory.mapper.ItemMapper;
import com.onchange.inventory.mapper.SiteMapper;
import com.onchange.inventory.mapper.VendorMapper;

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
		
		long vendorId = purchaseOrder.getVendor().getVendorId();
		long siteId = purchaseOrder.getSite().getSid();
		
		
		List<Long> itemIds = purchaseOrder.getItems().stream().map(ItemLinkDto::getItemId).collect(Collectors.toList());
		
		Optional<SiteDto> siteDto = siteDao.findById(siteId);
		Optional<VendorDto> vendorDto = vendorDao.findById(vendorId);
		List<ItemDto> itemDtos = itemDao.findAllById(itemIds);
		
		boolean siteSuccess = false;
		boolean vendorSuccess = false;
		boolean itemSuccess = false;
		
		SiteLinkDto siteLinkDto = null;
		if(siteDto.isPresent()) {
			siteLinkDto = SiteMapper.convertDtoToLink(siteDto.get());
			siteSuccess = true;
		}
		VendorLinkDto vendorLinkDto = null;
		if(vendorDto.isPresent()) {
			vendorLinkDto = VendorMapper.convertDtoToLink(vendorDto.get());
			vendorSuccess = true;
		}
		List<ItemLinkDto> items = null;
		if(!itemDtos.isEmpty()) {
			 items = ItemMapper.convertLinkToDto(itemDtos, purchaseOrder);
			 itemSuccess = true;
		}
		
		if(siteSuccess && itemSuccess && vendorSuccess) {
			purchaseOrder.setVendor(vendorLinkDto);
			purchaseOrder.setSite(siteLinkDto);
			purchaseOrder.setItems(items);
			purchaseOrderService.save(purchaseOrder);
		}
		
	}
	
	@GetMapping("/initial")
    ResponseEntity<?> getInitialData() {
		long poCount = purchaseOrderService.count()+1;
        return ResponseEntity.ok().body(poCount);
    }
	

	@RequestMapping(value={"/po/{id}"})
	public Optional<PurchaseOrderDto> getSingle(@PathVariable long id) {
		return purchaseOrderService.findById(id);
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
