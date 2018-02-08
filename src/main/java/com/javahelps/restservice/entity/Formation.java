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

	/**
	 * @return the formation's id
	 */
	public Integer getFormationId() {
		return formationId;
	}

	/**
	 * Set a formation's id
	 * @param contactSchoolId
	 */
	public void setFormationId(Integer formationId) {
		this.formationId = formationId;
	}

	/**
	 * @return the formation's name
	 */
	public String getFormationName() {
		return formationName;
	}

	/**
	 * Set a formation's name
	 * @param formationName
	 */
	public void setFormationName(String formationName) {
		this.formationName = formationName;
	}

	/**
	 * @return the formation's business sector
	 */
	public BusinessSector getBusinessSector() {
		return businessSector;
	}

	/**
	 * Set a formation's business sector
	 * @param businessSector
	 */
	public void setBusinessSector(BusinessSector businessSector) {
		this.businessSector = businessSector;
	}

	/**
	 * @return the formation's initials
	 */
	public String getFormationInitials() {
		return formationInitials;
	}

	/**
	 * Set a formation's initials
	 * @param formationInitials
	 */
	public void setFormationInitials(String formationInitials) {
		this.formationInitials = formationInitials;
	}
}
