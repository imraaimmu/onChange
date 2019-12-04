package com.onchange.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.onchange.inventory.dto.SiteDto;

public interface  SiteDao  extends JpaRepository<SiteDto, Long>{
	
	public List<SiteDto> findByNameContains(String name);
	

	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM site_dto WHERE site_id = ?1")
	public void deleteById(long siteId);
}
