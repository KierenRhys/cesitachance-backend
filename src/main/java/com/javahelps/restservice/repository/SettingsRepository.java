package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.Settings;

@RestResource(exported = false)
public interface SettingsRepository extends JpaRepository<Settings, String> {
	/*
	 * Interface for settings controller
	 */
}
