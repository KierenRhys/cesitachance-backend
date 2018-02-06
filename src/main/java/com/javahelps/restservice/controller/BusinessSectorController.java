package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.BusinessSector;
import com.javahelps.restservice.repository.BusinessSectorRepository;

@RestController
@RequestMapping(path = "/business-sector")
public class BusinessSectorController {

	@Autowired
    private BusinessSectorRepository repository;

	@GetMapping
    public Iterable<BusinessSector> findAll() {
        return repository.findAll();
    }

	@GetMapping(path = "/{business_sector_id}")
    public BusinessSector find(@PathVariable("business_sector_id") String business_sector_id) {
        return repository.findOne(business_sector_id);
    }
}
