package com.onchange.inventory.dao.links;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onchange.inventory.dto.links.VendorLinkDto;


@Repository
public interface VendorLinkDao   extends JpaRepository<VendorLinkDto, Long>{

	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM vendor_link_dto WHERE vendor_id = ?1")
	public void deleteById(long vendorId);
	
}

