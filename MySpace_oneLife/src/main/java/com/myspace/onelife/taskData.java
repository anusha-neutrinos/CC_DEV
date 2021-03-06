package com.myspace.onelife;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class taskData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("claims")
	private com.myspace.onelife.claims claims;
	@org.kie.api.definition.type.Label("claimsProcessId")
	private java.lang.Integer claimsProcessId;
	@org.kie.api.definition.type.Label("taskOwner")
	private java.lang.String taskOwner;
	@org.kie.api.definition.type.Label("taskProcessId")
	private java.lang.Integer taskProcessId;
	@org.kie.api.definition.type.Label("taskStatus")
	private java.lang.String taskStatus;
	@org.kie.api.definition.type.Label("taskCreationTime")
	private java.time.LocalDateTime taskCreationTime;
	@org.kie.api.definition.type.Label("taskCreatedBy")
	private java.lang.String taskCreatedBy;

	public taskData() {
	}

	public com.myspace.onelife.claims getClaims() {
		return this.claims;
	}

	public void setClaims(com.myspace.onelife.claims claims) {
		this.claims = claims;
	}

	public java.lang.Integer getClaimsProcessId() {
		return this.claimsProcessId;
	}

	public void setClaimsProcessId(java.lang.Integer claimsProcessId) {
		this.claimsProcessId = claimsProcessId;
	}

	public java.lang.String getTaskOwner() {
		return this.taskOwner;
	}

	public void setTaskOwner(java.lang.String taskOwner) {
		this.taskOwner = taskOwner;
	}

	public java.lang.Integer getTaskProcessId() {
		return this.taskProcessId;
	}

	public void setTaskProcessId(java.lang.Integer taskProcessId) {
		this.taskProcessId = taskProcessId;
	}

	public java.lang.String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(java.lang.String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public java.time.LocalDateTime getTaskCreationTime() {
		return this.taskCreationTime;
	}

	public void setTaskCreationTime(java.time.LocalDateTime taskCreationTime) {
		this.taskCreationTime = taskCreationTime;
	}

	public java.lang.String getTaskCreatedBy() {
		return this.taskCreatedBy;
	}

	public void setTaskCreatedBy(java.lang.String taskCreatedBy) {
		this.taskCreatedBy = taskCreatedBy;
	}

	public taskData(com.myspace.onelife.claims claims,
			java.lang.Integer claimsProcessId, java.lang.String taskOwner,
			java.lang.Integer taskProcessId, java.lang.String taskStatus,
			java.time.LocalDateTime taskCreationTime,
			java.lang.String taskCreatedBy) {
		this.claims = claims;
		this.claimsProcessId = claimsProcessId;
		this.taskOwner = taskOwner;
		this.taskProcessId = taskProcessId;
		this.taskStatus = taskStatus;
		this.taskCreationTime = taskCreationTime;
		this.taskCreatedBy = taskCreatedBy;
	}

}