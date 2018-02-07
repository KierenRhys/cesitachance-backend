package com.javahelps.restservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="candidate")
public class Candidate {
	
	@Id
	@Column(name="candidate_id")
    private String candidateId;
	
	@Column(name="candidate_last_name")
	private String candidateLastName;
	
	@Column(name="candidate_first_name")
    private String candidateFirstName;
	
	@Column(name="candidate_gender")
    private String candidateGender;
	
	@Column(name="candidate_birthdate")
    private Date candidateBirthdate;
	
	@Column(name="candidate_address")
    private String candidateAddress;
	
	@Column(name="candidate_city")
    private String candidateCity;
	
	@Column(name="candidate_postal_code")
    private String candidatePostalCode;
	
	@Column(name="candidate_phone")
    private String candidatePhone;
	
	@Column(name="candidate_email")
    private String candidateEmail;
	
	@Column(name="candidate_formation")
    private String candidateFormation;
	
	@Column(name="candidat_degree")
	private String candidateDegree;
	
	@Column(name="candidate_last_school")
    private String candidateLastSchool;
	
	@Column(name="candidate_known_cesi")
    private String candidateKnownCesi;
	
	@Column(name="has_contact_with_others_schools")
	private Boolean hasContactWithOthersSchools;
	
	@Column(name="allow_contact")
    private Boolean allowContact;
	
	@Column(name="contact_date")
	@Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date contactDate;
	
	@Column(name="contact_place")
    private String contactPlace;
	
	@OneToMany(targetEntity=ContactSchool.class, mappedBy="candidate", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<ContactSchool> schoolsContacts;
	
	@ManyToMany
    @JoinTable(name="candidate_formation")
	public List<Formation> formations;

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateLastName() {
		return candidateLastName;
	}

	public void setCandidateLastName(String candidateLastName) {
		this.candidateLastName = candidateLastName;
	}

	public String getCandidateFirstName() {
		return candidateFirstName;
	}

	public void setCandidateFirstName(String candidateFirstName) {
		this.candidateFirstName = candidateFirstName;
	}

	public String getCandidateGender() {
		return candidateGender;
	}

	public void setCandidateGender(String candidateSex) {
		this.candidateGender = candidateSex;
	}

	public Date getCandidateBirthdate() {
		return candidateBirthdate;
	}

	public void setCandidateBirthDate(Date candidateBirthdate) {
		this.candidateBirthdate = candidateBirthdate;
	}

	public String getCandidateAddress() {
		return candidateAddress;
	}

	public void setCandidateAddress(String candidateAddress) {
		this.candidateAddress = candidateAddress;
	}

	public String getCandidateCity() {
		return candidateCity;
	}

	public void setCandidateCity(String candidateCity) {
		this.candidateCity = candidateCity;
	}

	public String getCandidatePostalCode() {
		return candidatePostalCode;
	}

	public void setCandidatePostalCode(String candidatePostalCode) {
		this.candidatePostalCode = candidatePostalCode;
	}

	public String getCandidatePhone() {
		return candidatePhone;
	}

	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public String getCandidateFormation() {
		return candidateFormation;
	}

	public void setCandidateFormation(String candidateFormation) {
		this.candidateFormation = candidateFormation;
	}

	public String getCandidateDegree() {
		return candidateDegree;
	}

	public void setCandidateDegree(String candidateDegree) {
		this.candidateDegree = candidateDegree;
	}

	public String getCandidateLastSchool() {
		return candidateLastSchool;
	}

	public void setCandidateLastEstablishment(String candidateLastSchool) {
		this.candidateLastSchool = candidateLastSchool;
	}

	public String getCandidateKnownCesi() {
		return candidateKnownCesi;
	}

	public void setCandidateKnownCesi(String candidateKnownCesi) {
		this.candidateKnownCesi = candidateKnownCesi;
	}

	public Boolean getHasContactWithOthersSchools() {
		return hasContactWithOthersSchools;
	}

	public void setHasContactWithOthersSchools(Boolean hasContactWithOthersSchools) {
		this.hasContactWithOthersSchools = hasContactWithOthersSchools;
	}

	public Boolean getAllowContact() {
		return allowContact;
	}

	public void setAllowContact(Boolean allowContact) {
		this.allowContact = allowContact;
	}

	public Date getContactDate() {
		return contactDate;
	}

	public void setContactDate(Date contactDate) {
		this.contactDate = contactDate;
	}

	public String getContactPlace() {
		return contactPlace;
	}

	public void setContactPlace(String contactPlace) {
		this.contactPlace = contactPlace;
	}

	public List<ContactSchool> getSchoolsContacts() {
		return schoolsContacts;
	}

	public void setSchoolsContacts(List<ContactSchool> schoolsContacts) {
		this.schoolsContacts = schoolsContacts;
	}

	public void setCandidateBirthdate(Date candidateBirthdate) {
		this.candidateBirthdate = candidateBirthdate;
	}

	public void setCandidateLastSchool(String candidateLastSchool) {
		this.candidateLastSchool = candidateLastSchool;
	}
	
	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
}
