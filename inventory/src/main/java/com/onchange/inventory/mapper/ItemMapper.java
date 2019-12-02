package com.onchange.inventory.mapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.onchange.inventory.dto.ItemDto;
import com.onchange.inventory.dto.links.ItemLinkDto;

public class ItemMapper {

	public static ItemDto convertLinkToDto(ItemLinkDto linkDto) {
		ItemDto itemDto = new ItemDto();
		itemDto.setItemId(linkDto.getItemId());
		itemDto.setItemName(linkDto.getItemName());
		itemDto.setMrp(linkDto.getMrp());
		itemDto.setQuantity(linkDto.getQuantity());
		itemDto.setsNo(linkDto.getsNo());
		itemDto.setTotalPrice(linkDto.getTotalPrice());
		itemDto.setUnit(linkDto.getUnit());
		itemDto.setUnitPrice(linkDto.getUnitPrice());
		return itemDto;
	}

	public static List<ItemDto> convertLinkToDto(List<ItemLinkDto> items) {
		return items.stream().map(item->{
			return convertLinkToDto(item);
		}).collect(Collectors.toList());
	}
}
