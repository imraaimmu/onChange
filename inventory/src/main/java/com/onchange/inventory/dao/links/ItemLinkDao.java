package com.onchange.inventory.dao.links;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onchange.inventory.dto.links.ItemLinkDto;

@Repository
public interface  ItemLinkDao  extends JpaRepository<ItemLinkDto, Long> {

	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM item_link_dto WHERE item_id = ?1")
	public void deleteById(long itemId);
	
}
