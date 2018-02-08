package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Formation;
import com.javahelps.restservice.repository.FormationRepository;

@RestController
@RequestMapping(path = "/formation")
public class FormationController {

	@Autowired
    private FormationRepository repository;

	// GET all formations
	@GetMapping
    public Iterable<Formation> findAll() {
        return repository.findAll();
    }

	// GET one formation by ID
	@GetMapping(path = "/{formation_id}")
    public Formation find(@PathVariable("formation_id") String formation_id) {
        return repository.findOne(formation_id);
    }
	
	// GET all formations by business sector
	@GetMapping(path = "/{business_sector_id}")
    public List<Formation> findAllByBusinessSector(@PathVariable("business_sector_id") String business_sector_id) {
        return repository.findAllByBusinessSector(business_sector_id);
    }
}
