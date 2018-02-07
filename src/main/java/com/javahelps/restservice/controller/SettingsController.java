package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Settings;
import com.javahelps.restservice.repository.SettingsRepository;

@RestController
@RequestMapping(path = "/settings")
public class SettingsController {

	@Autowired
    private SettingsRepository repository;

	@GetMapping
    public Iterable<Settings> findAll() {
        return repository.findAll();
    }

	@GetMapping(path = "/{setting_name}")
    public Settings find(@PathVariable("setting_name") String setting_name) {
        return repository.findOne(setting_name);
    }
	
	@PostMapping(consumes = "application/json")
    public void create(@RequestBody List<Settings> settings) {
    	repository.save(settings);
    }
}
