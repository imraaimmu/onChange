package com.onchange.inventory.service;

import java.util.Optional;

import com.onchange.inventory.dto.ItemDto;

public interface ItemService {

	Optional<ItemDto> findById(Long id);

	ItemDto save(ItemDto entity);

	Iterable<ItemDto> saveAll(Iterable<ItemDto> entities);

	boolean existsById(Long id);

	Iterable<ItemDto> findAll();

	Iterable<ItemDto> findAllById(Iterable<Long> ids);

	long count();

	void deleteById(Long id);

	void delete(ItemDto entity);

	void deleteAll(Iterable<ItemDto> entities);

	void deleteAll();


}
