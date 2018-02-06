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
@Table(name="contact_school")
public class ContactSchool {

	@Column(name="contact_school_id")
    private String contactSchoolId;
	
	@Column(name="candidate_id")
    private Candidate candidate;
    
	@Column(name="school_name")
    private String schoolName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String getContactSchoolId() {
		return contactSchoolId;
	}

	public void setContactSchoolId(String contactSchoolId) {
		this.contactSchoolId = contactSchoolId;
	}

	@ManyToOne
	@JoinColumn(name = "candidate_id")
	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
