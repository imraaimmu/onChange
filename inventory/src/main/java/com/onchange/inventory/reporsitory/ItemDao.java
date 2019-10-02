package com.onchange.inventory.reporsitory;

import org.springframework.data.repository.CrudRepository;

import com.onchange.inventory.dto.ItemDto;

public interface  ItemDao  extends CrudRepository<ItemDto, Long> {

	
	
	
	
}
