package com.myspace.onelife;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class callerDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "title")
	private java.lang.String title;
	@org.kie.api.definition.type.Label(value = "firstName")
	private java.lang.String firstName;
	@org.kie.api.definition.type.Label(value = "surname")
	private java.lang.String surname;
	@org.kie.api.definition.type.Label(value = "initials")
	private java.lang.String initials;
	@org.kie.api.definition.type.Label(value = "idNo")
	private java.lang.String idNo;
	@org.kie.api.definition.type.Label(value = "dateOfBirth")
	private java.util.Date dateOfBirth;

	public callerDetails() {
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public java.lang.String getInitials() {
		return this.initials;
	}

	public void setInitials(java.lang.String initials) {
		this.initials = initials;
	}

	public java.lang.String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(java.lang.String idNo) {
		this.idNo = idNo;
	}

	public java.util.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public callerDetails(java.lang.String title, java.lang.String firstName,
			java.lang.String surname, java.lang.String initials,
			java.lang.String idNo, java.util.Date dateOfBirth) {
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.initials = initials;
		this.idNo = idNo;
		this.dateOfBirth = dateOfBirth;
	}

}