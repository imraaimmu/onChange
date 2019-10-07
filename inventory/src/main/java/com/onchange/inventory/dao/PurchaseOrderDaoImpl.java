package com.onchange.inventory.dao;

import java.util.Optional;

import com.onchange.inventory.dao.PurchaseOrderDao;
import com.onchange.inventory.dto.PurchaseOrderDto;

public class  PurchaseOrderDaoImpl implements PurchaseOrderDao{

	@Override
	public <S extends PurchaseOrderDto> S save(S entity) {
		return null;
	}

	@Override
	public <S extends PurchaseOrderDto> Iterable<S> saveAll(Iterable<S> entities) {
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
	public void deleteAll(Iterable<? extends PurchaseOrderDto> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}
	
	
}
