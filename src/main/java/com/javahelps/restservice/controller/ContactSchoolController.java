package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.ContactSchool;
import com.javahelps.restservice.repository.ContactSchoolRepository;

@RestController
@RequestMapping(path = "/contact_school")
public class ContactSchoolController {

	@Autowired
    private ContactSchoolRepository repository;

    public void create(@RequestBody List<ContactSchool> contacts_scchool) {
		repository.save(contacts_scchool);
    }

    @GetMapping(path = "/{candidate_id}")
    public List<ContactSchool> findAllByCandidate(@PathVariable("candidate_id") String candidate_id) {
        return repository.findAllByCandidate(candidate_id);
    }
}
