package com.onchange.inventory.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onchange.inventory.dao.VendorDao;
import com.onchange.inventory.dto.VendorDto;

@RestController
@RequestMapping(value={"/vendor"})
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class VendorController {

	@Autowired
	VendorDao vendorService;
	
	@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
	@RequestMapping(value={"/vendors"})
	public ResponseEntity<?> showCustomers(int count) {
		return ResponseEntity.ok().body(vendorService.findAll());
	}
		
	@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
	@RequestMapping(value={"/suggestion/{searchText}"})
	public ResponseEntity<List<VendorDto>> customerSuggestion(@PathVariable String searchText) {
		return ResponseEntity.ok().body(vendorService.findByNameContains(searchText));
	}
	
	@RequestMapping(value={"/delete/{id}"})
	public void delete(@PathVariable long id) {
		vendorService.deleteById(id);
	}

	@RequestMapping(value={"/save","/update"})
	public ResponseEntity<VendorDto> save(@RequestBody VendorDto entity) {
		return ResponseEntity.ok().body(vendorService.save(entity));
	}

	@RequestMapping(value={"/site/{id}"})
	public ResponseEntity<Optional<VendorDto>> getSingle(@PathVariable long id) {
		return ResponseEntity.ok().body(vendorService.findById(id));
	}
	
}
