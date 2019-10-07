package com.onchange.inventory.service;

import java.util.Optional;

import com.onchange.inventory.dto.SiteDto;

public interface SiteService {

	Optional<SiteDto> findById(Long id);

	SiteDto save(SiteDto entity);

	Iterable<SiteDto> saveAll(Iterable<SiteDto> entities);

	boolean existsById(Long id);

	Iterable<SiteDto> findAll();

	Iterable<SiteDto> findAllById(Iterable<Long> ids);

	long count();

	void deleteById(Long id);

	void delete(SiteDto entity);

	void deleteAll(Iterable<SiteDto> entities);

	void deleteAll();




}
