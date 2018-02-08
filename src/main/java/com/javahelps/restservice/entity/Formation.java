package com.javahelps.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="formation")
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="formation_id")
    private Integer formationId;
	
	@Column(name="formation_name")
	private String formationName;
	
	@Column(name="formation_initials")
	private String formationInitials;
	
	@ManyToOne
	@JoinColumn(name = "business_sector_id")
    private BusinessSector businessSector;

	public Integer getFormationId() {
		return formationId;
	}

	public void setFormationId(Integer formationId) {
		this.formationId = formationId;
	}

	public String getFormationName() {
		return formationName;
	}

	public void setFormationName(String formationName) {
		this.formationName = formationName;
	}

	public BusinessSector getBusinessSector() {
		return businessSector;
	}

	public void setBusinessSector(BusinessSector businessSector) {
		this.businessSector = businessSector;
	}

	public String getFormationInitials() {
		return formationInitials;
	}

	public void setFormationInitials(String formationInitials) {
		this.formationInitials = formationInitials;
	}
}
