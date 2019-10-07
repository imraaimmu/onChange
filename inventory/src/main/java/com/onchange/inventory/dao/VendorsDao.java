package com.onchange.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.onchange.inventory.dto.VendorsDto;

public interface VendorsDao   extends CrudRepository<VendorsDto, Long>{}
