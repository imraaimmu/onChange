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

import com.onchange.inventory.dao.SiteDao;
import com.onchange.inventory.dto.SiteDto;

@RestController
@RequestMapping(value={"/site"})
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class SiteController {

	@Autowired
	SiteDao siteService;
	
	@RequestMapping(value={"/delete/{id}"})
	public void delete(@PathVariable long id) {
		siteService.deleteById(id);
	}

	@RequestMapping(value={"/save","/update"})
	public void save(@RequestBody SiteDto entity) {
		siteService.save(entity);
	}

	@RequestMapping(value={"/site/{id}"})
	public ResponseEntity<Optional<SiteDto>> getSingle(@PathVariable long id) {
		return ResponseEntity.ok().body(siteService.findById(id));
	}

	@RequestMapping(value={"/sites"})
	public ResponseEntity<List<SiteDto>> getAll() {
		return ResponseEntity.ok().body(siteService.findAll());
	}
	
	@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
	@RequestMapping(value={"/suggestion/{searchText}"})
	public ResponseEntity<List<SiteDto>> customerSuggestion(@PathVariable String searchText) {
		return ResponseEntity.ok().body(siteService.findByNameContains(searchText));
	}
	
}
