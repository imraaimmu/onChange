package com.onchange.inventory.dao.links;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onchange.inventory.dto.links.SiteLinkDto;

@Repository
public interface  SiteLinkDao  extends JpaRepository<SiteLinkDto, Long>{
	
	
}
