package com.onchange.inventory.service;

import java.util.Optional;

import com.onchange.inventory.dto.PurchaseOrderDto;

public class  PurchaseOrderServiceImpl implements PurchaseOrderService{

	@Override
	public PurchaseOrderDto save(PurchaseOrderDto entity) {
		return null;
	}

	@Override
	public Iterable<PurchaseOrderDto> saveAll(Iterable<PurchaseOrderDto> entities) {
		return null;
	}

	@Override
	public Optional<PurchaseOrderDto> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<PurchaseOrderDto> findAll() {
		return null;
	}

	@Override
	public Iterable<PurchaseOrderDto> findAllById(Iterable<Long> ids) {
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
	public void delete(PurchaseOrderDto entity) {
		
	}

	@Override
	public void deleteAll(Iterable<PurchaseOrderDto> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

}
