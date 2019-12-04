package com.onchange.inventory.dao.links;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onchange.inventory.dto.links.SiteLinkDto;

@Repository
public interface  SiteLinkDao  extends JpaRepository<SiteLinkDto, Long>{
	
	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM site_link_dto WHERE site_id = ?1")
	public void deleteById(long siteId);
	
}
