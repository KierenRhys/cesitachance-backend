package com.javahelps.restservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@Column(name="candidate_degree")
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
    private Date contactDate;
	
	@Column(name="contact_place")
    private String contactPlace;
	
	@OneToMany(targetEntity=ContactSchool.class, mappedBy="candidate", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<ContactSchool> schoolsContacts;
	
	@Column(name="interests")
	private String interests;

	/**
	 * @return the candidate's id
	 */
	public String getCandidateId() {
		return candidateId;
	}

	/**
	 * Set a candidate's id
	 * @param candidateId
	 */
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	/**
	 * @return the candidate's last name
	 */
	public String getCandidateLastName() {
		return candidateLastName;
	}

	/**
	 * Set a candidate's last name
	 * @param candidateLastName
	 */
	public void setCandidateLastName(String candidateLastName) {
		this.candidateLastName = candidateLastName;
	}

	/**
	 * @return the candidate's first name
	 */
	public String getCandidateFirstName() {
		return candidateFirstName;
	}

	/**
	 * Set a candidate's first name
	 * @param candidateFirstName
	 */
	public void setCandidateFirstName(String candidateFirstName) {
		this.candidateFirstName = candidateFirstName;
	}

	/**
	 * @return the candidate's gender
	 */
	public String getCandidateGender() {
		return candidateGender;
	}

	/**
	 * Set a candidate's gender
	 * @param candidateGender
	 */
	public void setCandidateGender(String candidateSex) {
		this.candidateGender = candidateSex;
	}

	/**
	 * @return the candidate's birthdate
	 */
	public Date getCandidateBirthdate() {
		return candidateBirthdate;
	}

	/**
	 * Set a candidate's birthdate
	 * @param candidateBirthdate
	 */
	public void setCandidateBirthDate(Date candidateBirthdate) {
		this.candidateBirthdate = candidateBirthdate;
	}

	/**
	 * @return the candidate's address
	 */
	public String getCandidateAddress() {
		return candidateAddress;
	}

	/**
	 * Set a candidate's address
	 * @param candidateAddress
	 */
	public void setCandidateAddress(String candidateAddress) {
		this.candidateAddress = candidateAddress;
	}

	/**
	 * @return the candidate's city
	 */
	public String getCandidateCity() {
		return candidateCity;
	}

	/**
	 * Set a candidate's city
	 * @param candidateCity
	 */
	public void setCandidateCity(String candidateCity) {
		this.candidateCity = candidateCity;
	}

	/**
	 * @return the candidate's postal code
	 */
	public String getCandidatePostalCode() {
		return candidatePostalCode;
	}

	/**
	 * Set a candidate's postal code
	 * @param candidatePostalCode
	 */
	public void setCandidatePostalCode(String candidatePostalCode) {
		this.candidatePostalCode = candidatePostalCode;
	}

	/**
	 * @return the candidate's phone
	 */
	public String getCandidatePhone() {
		return candidatePhone;
	}

	/**
	 * Set a candidate's phone
	 * @param candidatePhone
	 */
	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	/**
	 * @return the candidate's email
	 */
	public String getCandidateEmail() {
		return candidateEmail;
	}

	/**
	 * Set a candidate's email
	 * @param candidateEmail
	 */
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	/**
	 * @return the candidate's formation
	 */
	public String getCandidateFormation() {
		return candidateFormation;
	}

	/**
	 * Set a candidate's formation
	 * @param candidateFormation
	 */
	public void setCandidateFormation(String candidateFormation) {
		this.candidateFormation = candidateFormation;
	}

	/**
	 * @return the candidate's degree
	 */
	public String getCandidateDegree() {
		return candidateDegree;
	}

	/**
	 * Set a candidate's degree
	 * @param candidateDegree
	 */
	public void setCandidateDegree(String candidateDegree) {
		this.candidateDegree = candidateDegree;
	}

	/**
	 * @return the candidate's last school
	 */
	public String getCandidateLastSchool() {
		return candidateLastSchool;
	}

	/**
	 * Set a candidate's last school
	 * @param candidateLastSchool
	 */
	public void setCandidateLastEstablishment(String candidateLastSchool) {
		this.candidateLastSchool = candidateLastSchool;
	}

	/**
	 * @return how the candidate known the Cesi
	 */
	public String getCandidateKnownCesi() {
		return candidateKnownCesi;
	}

	/**
	 * Set a how the candidate known the Cesi
	 * @param candidateKnownCesi
	 */
	public void setCandidateKnownCesi(String candidateKnownCesi) {
		this.candidateKnownCesi = candidateKnownCesi;
	}

	/**
	 * @return true if the candidate has contact with others schools
	 */
	public Boolean getHasContactWithOthersSchools() {
		return hasContactWithOthersSchools;
	}

	/**
	 * Set true if the candidate has contact with others schools
	 * @param hasContactWithOthersSchools
	 */
	public void setHasContactWithOthersSchools(Boolean hasContactWithOthersSchools) {
		this.hasContactWithOthersSchools = hasContactWithOthersSchools;
	}

	/**
	 * @return true if the candidate allow the Cesi to contact him
	 */
	public Boolean getAllowContact() {
		return allowContact;
	}

	/**
	 * Set true if the candidate allow the Cesi to contact him
	 * @param allowContact
	 */
	public void setAllowContact(Boolean allowContact) {
		this.allowContact = allowContact;
	}

	/**
	 * @return the candidate's contact date
	 */
	public Date getContactDate() {
		return contactDate;
	}

	/**
	 * Set a candidate's contact date
	 * @param contactDate
	 */
	public void setContactDate(Date contactDate) {
		this.contactDate = contactDate;
	}

	/**
	 * @return the candidate's contact place
	 */
	public String getContactPlace() {
		return contactPlace;
	}

	/**
	 * Set a candidate's contact place
	 * @param contactPlace
	 */
	public void setContactPlace(String contactPlace) {
		this.contactPlace = contactPlace;
	}

	/**
	 * @return the candidate's contacts with schools
	 */
	public List<ContactSchool> getSchoolsContacts() {
		return schoolsContacts;
	}

	/**
	 * Set a candidate's contacts with schools
	 * @param schoolsContacts
	 */
	public void setSchoolsContacts(List<ContactSchool> schoolsContacts) {
		this.schoolsContacts = schoolsContacts;
	}

	/**
	 * Set the candidate's birthdate
	 * @param candidateBirthdate
	 */
	public void setCandidateBirthdate(Date candidateBirthdate) {
		this.candidateBirthdate = candidateBirthdate;
	}

	/**
	 * Set a candidate's last school
	 * @param candidateId
	 */
	public void setCandidateLastSchool(String candidateLastSchool) {
		this.candidateLastSchool = candidateLastSchool;
	}

	/**
	 * @return the candidate's interests
	 */
	public String getInterests() {
		return interests;
	}

	/**
	 * Set a candidate's interests
	 * @param interests
	 */
	public void setInterests(String interests) {
		this.interests = interests;
	}
}
