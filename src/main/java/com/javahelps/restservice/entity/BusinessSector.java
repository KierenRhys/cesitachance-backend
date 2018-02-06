package com.javahelps.restservice.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="business_sector")
public class BusinessSector {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="business_sector_id")
    private Integer businessSectorId;
	
	@Column(name="business_sector_name")
	private String businessSectorName;
	
	@OneToMany(targetEntity=Formation.class, mappedBy="businessSector", fetch=FetchType.EAGER)
	private List<Formation> formations;

	public Integer getBusinessSectorId() {
		return businessSectorId;
	}

	public void setBusinessSectorId(Integer businessSectorId) {
		this.businessSectorId = businessSectorId;
	}

	public String getBusinessSectorName() {
		return businessSectorName;
	}

	public void setBusinessSectorName(String businessSectorName) {
		this.businessSectorName = businessSectorName;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
}
