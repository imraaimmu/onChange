package com.onchange.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.onchange.inventory.dto.ItemDto;

public interface  ItemDao  extends JpaRepository<ItemDto, Long> {
	
	public List<ItemDto> findByItemNameContains(String name);
	
	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM item_dto WHERE item_id = ?1")
	public void deleteById(long itemId);	
}
