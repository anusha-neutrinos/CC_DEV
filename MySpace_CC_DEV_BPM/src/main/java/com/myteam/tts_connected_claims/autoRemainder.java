package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class autoRemainder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("processInstanceId")
	private java.lang.String processInstanceId;
	@org.kie.api.definition.type.Label("assessmentId")
	private java.lang.String assessmentId;
	@org.kie.api.definition.type.Label("autoTimer")
	private java.lang.String autoTimer;
	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.Boolean status;

	public autoRemainder() {
	}

	public java.lang.String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.String getAssessmentId() {
		return this.assessmentId;
	}

	public void setAssessmentId(java.lang.String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public java.lang.String getAutoTimer() {
		return this.autoTimer;
	}

	public void setAutoTimer(java.lang.String autoTimer) {
		this.autoTimer = autoTimer;
	}

	public java.lang.Boolean getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.Boolean status) {
		this.status = status;
	}

	public autoRemainder(java.lang.String processInstanceId,
			java.lang.String assessmentId, java.lang.String autoTimer,
			java.lang.Boolean status) {
		this.processInstanceId = processInstanceId;
		this.assessmentId = assessmentId;
		this.autoTimer = autoTimer;
		this.status = status;
	}

}