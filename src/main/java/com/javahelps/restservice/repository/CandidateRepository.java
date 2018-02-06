package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.Candidate;

@RestResource(exported = false)
public interface CandidateRepository extends JpaRepository<Candidate, String> {

}