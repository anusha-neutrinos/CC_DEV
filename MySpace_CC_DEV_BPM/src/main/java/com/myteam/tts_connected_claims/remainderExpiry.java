package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class remainderExpiry implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "assessmentId")
	private java.lang.String assessmentId;
	@org.kie.api.definition.type.Label(value = "processInstanceId")
	private java.lang.String processInstanceId;
	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.Boolean status;
	@org.kie.api.definition.type.Label(value = "remainderExpiryIn")
	private java.lang.String remainderExpiryIn;

	public remainderExpiry() {
	}

	public java.lang.String getAssessmentId() {
		return this.assessmentId;
	}

	public void setAssessmentId(java.lang.String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public java.lang.String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.Boolean getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.Boolean status) {
		this.status = status;
	}

	public java.lang.String getRemainderExpiryIn() {
		return this.remainderExpiryIn;
	}

	public void setRemainderExpiryIn(java.lang.String remainderExpiryIn) {
		this.remainderExpiryIn = remainderExpiryIn;
	}

	public remainderExpiry(java.lang.String assessmentId,
			java.lang.String processInstanceId, java.lang.Boolean status,
			java.lang.String remainderExpiryIn) {
		this.assessmentId = assessmentId;
		this.processInstanceId = processInstanceId;
		this.status = status;
		this.remainderExpiryIn = remainderExpiryIn;
	}

}