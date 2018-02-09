package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	// GET all settings
	@GetMapping
    public Iterable<Settings> findAll() {
        return repository.findAll();
    }
	
    // GET pass admin
    @GetMapping(path = "/admin")
    public String findAdmin() {
        Settings settings = repository.findOne("admin");
        return settings.getValue();
    }
	
	// POST verify password
	@PostMapping(path = "/admin", consumes = "application/json")
	public String findPass(@RequestBody String password) {
		String passwordAdmin = findAdmin();
		if (password == passwordAdmin) {
			return passwordAdmin;
		} 
		else {
			return "you shall not pass !";
		}
	}
	
	// POST a setting
	@PostMapping(consumes = "application/json")
    public void create(@RequestBody List<Settings> settings) {
    	repository.save(settings);
    }
}
