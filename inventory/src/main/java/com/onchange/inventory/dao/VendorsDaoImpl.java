package com.onchange.inventory.dao;

import java.util.Optional;

import com.onchange.inventory.dao.VendorsDao;
import com.onchange.inventory.dto.VendorsDto;

public class VendorsDaoImpl implements VendorsDao{

	@Override
	public <S extends VendorsDto> S save(S entity) {
		return null;
	}

	@Override
	public <S extends VendorsDto> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<VendorsDto> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<VendorsDto> findAll() {
		return null;
	}

	@Override
	public Iterable<VendorsDto> findAllById(Iterable<Long> ids) {
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
	public void delete(VendorsDto entity) {
		
	}

	@Override
	public void deleteAll(Iterable<? extends VendorsDto> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}
	
}
