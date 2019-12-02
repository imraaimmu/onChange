package com.onchange.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onchange.inventory.dto.ItemDto;

public interface  ItemDao  extends JpaRepository<ItemDto, Long> {
	
	public List<ItemDto> findByItemNameContains(String name);
}
