package com.javahelps.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.ContactSchool;

@RestResource(exported = false)
public interface ContactSchoolRepository extends JpaRepository<ContactSchool, String> {
	/*
	 * Interface for contact school controller
	 */
	
	// Fonction to found all contacts by candidate
	List<ContactSchool> findAllByCandidate(String candidate_id);
}