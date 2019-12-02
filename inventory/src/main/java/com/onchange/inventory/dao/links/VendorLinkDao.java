package com.onchange.inventory.dao.links;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onchange.inventory.dto.links.VendorLinkDto;


@Repository
public interface VendorLinkDao   extends JpaRepository<VendorLinkDto, Long>{
	
	
	public List<VendorLinkDto> findByNameContains(String name);
}

