package com.onchange.inventory.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.onchange.inventory.dto.ItemDto;
import com.onchange.inventory.dto.PurchaseOrderDto;
import com.onchange.inventory.dto.links.ItemLinkDto;

public class ItemMapper {

	public static ItemLinkDto convertDtoToLink(ItemDto linkDto,PurchaseOrderDto purchaseOrder) {
		ItemLinkDto itemDto = new ItemLinkDto();
//		itemDto.setItemId(linkDto.getItemId());
		itemDto.setItemName(linkDto.getItemName());
		itemDto.setMrp(linkDto.getMrp());
		itemDto.setQuantity(linkDto.getQuantity());
		itemDto.setsNo(linkDto.getsNo());
		itemDto.setTotalPrice(linkDto.getTotalPrice());
		itemDto.setUnit(linkDto.getUnit());
		itemDto.setUnitPrice(linkDto.getUnitPrice());
		itemDto.setPurchaseOrder(purchaseOrder);
		return itemDto;
	}

	public static List<ItemLinkDto> convertLinkToDto(List<ItemDto> items,PurchaseOrderDto purchaseOrder) {
		return items.stream().map(item->{
			return convertDtoToLink(item,purchaseOrder);
		}).collect(Collectors.toList());
	}
}
