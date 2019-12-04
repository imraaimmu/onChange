package com.onchange.inventory.mapper;

import com.onchange.inventory.dto.SiteDto;
import com.onchange.inventory.dto.links.SiteLinkDto;

public class SiteMapper {


	public static SiteLinkDto convertDtoToLink(SiteDto siteDto) {
		SiteLinkDto siteLinkDto = new SiteLinkDto();
		siteLinkDto.setAddress(siteDto.getAddress());
		siteLinkDto.setIncharge(siteDto.getIncharge());
		siteLinkDto.setInchargeContactNumber(siteDto.getInchargeContactNumber());
		siteLinkDto.setName(siteDto.getName());
		return siteLinkDto;
	}

}
