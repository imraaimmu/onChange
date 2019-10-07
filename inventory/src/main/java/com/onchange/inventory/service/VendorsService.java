package com.onchange.inventory.service;

import java.util.Optional;

import com.onchange.inventory.dto.VendorsDto;

public interface VendorsService {

	Optional<VendorsDto> findById(Long id);

	VendorsDto save(VendorsDto entity);

	Iterable<VendorsDto> saveAll(Iterable<VendorsDto> entities);

	boolean existsById(Long id);

	Iterable<VendorsDto> findAll();

	Iterable<VendorsDto> findAllById(Iterable<Long> ids);

	long count();

	void deleteById(Long id);

	void delete(VendorsDto entity);

	void deleteAll(Iterable<VendorsDto> entities);

	void deleteAll();




}
