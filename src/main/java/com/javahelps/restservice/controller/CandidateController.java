package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Candidate;
import com.javahelps.restservice.entity.ContactSchool;
import com.javahelps.restservice.repository.CandidateRepository;
import com.javahelps.restservice.repository.ContactSchoolRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/candidate")
public class CandidateController {

	@Autowired
    private CandidateRepository repository;
	
	@Autowired
	private ContactSchoolRepository repositoryContactSchool;

    @GetMapping
    @CrossOrigin
    public List<Candidate> findAll() {
        return repository.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/{candidate_id}")
    public Candidate find(@PathVariable("candidate_id") String candidate_id) {
        return repository.findOne(candidate_id);
    }
    
    @CrossOrigin
    @GetMapping(path = "/{candidate_id}/interests")
    public String findInterests(@PathVariable("candidate_id") String candidate_id) {
    	String interests = repository.findOne(candidate_id).getInterests();
    	return interests;
    }
    
    @CrossOrigin
	@PostMapping(path= "/sync", consumes = "application/json")
    public Iterable<Candidate> create(@RequestBody List<Candidate> candidates) {
        for (Candidate candidate : candidates) {
        	createOne(candidate);
        }
        return repository.findAll();
    }
	
    @CrossOrigin
	@PostMapping(consumes = "application/json")
    public void createOne(@RequestBody Candidate candidate) {
    	repository.save(candidate);
    	for (ContactSchool contact : candidate.getSchoolsContacts()) {
        		ContactSchool _contact = new ContactSchool();
        		_contact.setCandidate(candidate);
        		_contact.setSchoolName(contact.getSchoolName());
        		repositoryContactSchool.save(_contact);
        }
    }

    @CrossOrigin
    @DeleteMapping(path = "/{candidate_id}")
    public void delete(@PathVariable("candidate_id") String candidate_id) {
        repository.delete(candidate_id);
    }

    @CrossOrigin
    @PutMapping(path = "/{candidate_id}")
    public Candidate update(@PathVariable("candidate_id") String candidate_id, @RequestBody Candidate candidate) throws BadHttpRequest {
        if (repository.exists(candidate_id)) {
            return repository.save(candidate);
        } else {
            throw new BadHttpRequest();
        }
    }
}
