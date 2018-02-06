package com.javahelps.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.Formation;

@RestResource(exported = false)
public interface FormationRepository extends JpaRepository<Formation, String> {

	List<Formation> findAllByBusinessSector(String business_sector_id);
}