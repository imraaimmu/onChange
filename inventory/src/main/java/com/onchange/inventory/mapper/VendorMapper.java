package com.onchange.inventory.mapper;

import com.onchange.inventory.dto.VendorDto;
import com.onchange.inventory.dto.links.VendorLinkDto;

public class VendorMapper {


	public static VendorLinkDto convertDtoToLink(VendorDto vendorDto) {
		VendorLinkDto vendorLinkDto = new VendorLinkDto();
		vendorLinkDto.setAddress(vendorDto.getAddress());
		vendorLinkDto.setAlternateNo(vendorDto.getAlternateNo());
		vendorLinkDto.setLandline(vendorDto.getLandline());
		vendorLinkDto.setMailId(vendorDto.getMailId());
		vendorLinkDto.setMobileNo(vendorDto.getMobileNo());
		vendorLinkDto.setName(vendorDto.getName());
//		vendorLinkDto.setVendorId(vendorId);
		return vendorLinkDto;
	}

}
