package com.myspace.onelife;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class documents implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "personName")
	private java.lang.String personName;
	@org.kie.api.definition.type.Label(value = "documentRequired")
	private java.lang.String documentRequired;
	@org.kie.api.definition.type.Label(value = "operatorId")
	private java.lang.String operatorId;
	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.String status;

	public documents() {
	}

	public java.lang.String getPersonName() {
		return this.personName;
	}

	public void setPersonName(java.lang.String personName) {
		this.personName = personName;
	}

	public java.lang.String getDocumentRequired() {
		return this.documentRequired;
	}

	public void setDocumentRequired(java.lang.String documentRequired) {
		this.documentRequired = documentRequired;
	}

	public java.lang.String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(java.lang.String operatorId) {
		this.operatorId = operatorId;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public documents(java.lang.String personName,
			java.lang.String documentRequired, java.lang.String operatorId,
			java.lang.String status) {
		this.personName = personName;
		this.documentRequired = documentRequired;
		this.operatorId = operatorId;
		this.status = status;
	}

}