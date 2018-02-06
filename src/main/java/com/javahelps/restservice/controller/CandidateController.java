package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Candidate;
import com.javahelps.restservice.repository.CandidateRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/candidate")
public class CandidateController {

	@Autowired
    private CandidateRepository repository;

    @GetMapping
    public Iterable<Candidate> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{candidate_id}")
    public Candidate find(@PathVariable("candidate_id") String candidate_id) {
        return repository.findOne(candidate_id);
    }
    
    @PostMapping(consumes = "application/json")
    public void create(@RequestBody List<Candidate> candidats) {
        repository.save(candidats);
    }

    @DeleteMapping(path = "/{candidate_id}")
    public void delete(@PathVariable("candidate_id") String candidate_id) {
        repository.delete(candidate_id);
    }

    @PutMapping(path = "/{candidate_id}")
    public Candidate update(@PathVariable("candidate_id") String candidate_id, @RequestBody Candidate candidate) throws BadHttpRequest {
        if (repository.exists(candidate_id)) {
            return repository.save(candidate);
        } else {
            throw new BadHttpRequest();
        }
    }
}
