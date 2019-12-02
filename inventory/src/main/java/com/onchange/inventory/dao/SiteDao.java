package com.onchange.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onchange.inventory.dto.SiteDto;

public interface  SiteDao  extends JpaRepository<SiteDto, Long>{
	
	public List<SiteDto> findByNameContains(String name);
	
}
