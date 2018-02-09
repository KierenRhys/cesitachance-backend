package com.javahelps.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="contact_school")
public class ContactSchool {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contact_school_id")
    private Integer contactSchoolId;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "candidate_id")
    private Candidate candidate;
    
	@Column(name="school_name")
    private String schoolName;

	/**
	 * @return the contact school's id
	 */
	public Integer getContactSchoolId() {
		return contactSchoolId;
	}

	/**
	 * Set a contact school's id
	 * @param contactSchoolId
	 */
	public void setContactSchoolId(Integer contactSchoolId) {
		this.contactSchoolId = contactSchoolId;
	}
	
	/**
	 * @return the contact school's candidate
	 */
	public Candidate getCandidate() {
		return candidate;
	}

	/**
	 * Set a contact school's candidate
	 * @param candidate
	 */
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	/**
	 * @return the contact school's name
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * Set acontact school's name
	 * @param candidateId
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
