package com.onchange.inventory.dao;

import java.util.Optional;

import com.onchange.inventory.dto.SiteDto;

public class  SiteDaoImpl  implements SiteDao{

	@Override
	public <S extends SiteDto> S save(S entity) {
		return null;
	}

	@Override
	public <S extends SiteDto> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<SiteDto> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<SiteDto> findAll() {
		return null;
	}

	@Override
	public Iterable<SiteDto> findAllById(Iterable<Long> ids) {
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
	public void delete(SiteDto entity) {
		
	}

	@Override
	public void deleteAll(Iterable<? extends SiteDto> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}
	
	
}
