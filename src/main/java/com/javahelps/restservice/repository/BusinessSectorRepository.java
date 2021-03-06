package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.BusinessSector;

@RestResource(exported = false)
public interface BusinessSectorRepository extends JpaRepository<BusinessSector, String> {
	/*
	 * Interface for business sector controller
	 */
}