package com.onchange.inventory.service;

import java.util.Optional;

import com.onchange.inventory.dto.ItemDto;

public class  ItemServiceImpl  implements ItemService{

	@Override
	public ItemDto save(ItemDto entity) {
		return null;
	}

	@Override
	public Iterable<ItemDto> saveAll(Iterable<ItemDto> entities) {
		return null;
	}

	@Override
	public Optional<ItemDto> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<ItemDto> findAll() {
		return null;
	}

	@Override
	public Iterable<ItemDto> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		
	}

	@Override
	public void delete(ItemDto entity) {
		
	}

	@Override
	public void deleteAll(Iterable<ItemDto> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

}
