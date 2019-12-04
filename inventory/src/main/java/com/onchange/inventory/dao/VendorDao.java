package com.onchange.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.onchange.inventory.dto.VendorDto;

public interface VendorDao   extends JpaRepository<VendorDto, Long>{
	
	
	public List<VendorDto> findByNameContains(String name);
	
	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM vendor_dto WHERE vendor_id = ?1")
	public void deleteById(long vendorId);
	
}

