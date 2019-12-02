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

import com.onchange.inventory.dao.ItemDao;
import com.onchange.inventory.dto.ItemDto;

@RestController
@RequestMapping(value={"/item"})
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ItemController {

	@Autowired
	ItemDao itemService;
	
	@RequestMapping(value={"/delete/{id}"})
	public void delete(@PathVariable long id) {
		itemService.deleteById(id);
	}

	@RequestMapping(value={"/save","/update"})
	public void save(@RequestBody ItemDto dto) {
		itemService.save(dto);
	}

	@RequestMapping(value={"/item/{id}"})
	public ResponseEntity<Optional<ItemDto>> getSingle(@PathVariable long id) {
		return ResponseEntity.ok().body(itemService.findById(id));
	}

	@RequestMapping(value={"/items"})
	public ResponseEntity<List<ItemDto>> getAll() {
		return ResponseEntity.ok().body(itemService.findAll());
	}
	
	@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
	@RequestMapping(value={"/suggestion/{searchText}"})
	public ResponseEntity<List<ItemDto>> customerSuggestion(@PathVariable String searchText) {
		return ResponseEntity.ok().body(itemService.findByItemNameContains(searchText));
	}
}
