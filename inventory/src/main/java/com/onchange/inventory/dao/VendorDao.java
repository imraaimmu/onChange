package com.onchange.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onchange.inventory.dto.VendorDto;

public interface VendorDao   extends JpaRepository<VendorDto, Long>{
	
	
	public List<VendorDto> findByNameContains(String name);
}

