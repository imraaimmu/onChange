package com.onchange.inventory.service;

import java.util.Optional;

import com.onchange.inventory.dto.PurchaseOrderDto;
import com.onchange.inventory.dto.PurchaseOrderDto;

public interface PurchaseOrderService {

	Optional<PurchaseOrderDto> findById(Long id);

	PurchaseOrderDto save(PurchaseOrderDto entity);

	Iterable<PurchaseOrderDto> saveAll(Iterable<PurchaseOrderDto> entities);

	boolean existsById(Long id);

	Iterable<PurchaseOrderDto> findAll();

	Iterable<PurchaseOrderDto> findAllById(Iterable<Long> ids);

	long count();

	void deleteById(Long id);

	void delete(PurchaseOrderDto entity);

	void deleteAll(Iterable<PurchaseOrderDto> entities);

	void deleteAll();


}
