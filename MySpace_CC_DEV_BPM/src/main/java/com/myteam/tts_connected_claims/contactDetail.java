package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class contactDetail implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label("contactNumber")
	private String contactNumber;

	@org.kie.api.definition.type.Label("smsEnabled")
	private java.lang.Boolean smsEnabled;

	@org.kie.api.definition.type.Label("preferredContactNumber")
	private java.lang.Boolean preferredContactNumber;

	public contactDetail() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Boolean getSmsEnabled() {
		return this.smsEnabled;
	}

	public void setSmsEnabled(java.lang.Boolean smsEnabled) {
		this.smsEnabled = smsEnabled;
	}

	public java.lang.Boolean getPreferredContactNumber() {
		return this.preferredContactNumber;
	}

	public void setPreferredContactNumber(
			java.lang.Boolean preferredContactNumber) {
		this.preferredContactNumber = preferredContactNumber;
	}

	public java.lang.String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(java.lang.String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public contactDetail(java.lang.String name, java.lang.String contactNumber,
			java.lang.Boolean smsEnabled,
			java.lang.Boolean preferredContactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.smsEnabled = smsEnabled;
		this.preferredContactNumber = preferredContactNumber;
	}

}