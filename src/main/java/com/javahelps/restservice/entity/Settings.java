package com.javahelps.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="settings")
public class Settings {

	@Id
	@Column(name="name")
    private String name;
	
	@Column(name="value")
	private String value;

	/**
	 * @return the setting's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set a setting's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the setting's value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set a setting's value
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
