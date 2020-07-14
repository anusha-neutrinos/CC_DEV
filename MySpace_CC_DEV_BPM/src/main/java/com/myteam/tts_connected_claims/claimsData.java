package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class claimsData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("amount")
	private java.lang.String amount;
	@org.kie.api.definition.type.Label("claimNumber")
	private java.lang.String claimNumber;
	@org.kie.api.definition.type.Label("captureDate")
	private java.lang.String captureDate;
	@org.kie.api.definition.type.Label("incidentDate")
	private java.lang.String incidentDate;
	@org.kie.api.definition.type.Label("incidentTime")
	private java.lang.String incidentTime;
	@org.kie.api.definition.type.Label("incidentDescription")
	private java.lang.String incidentDescription;
	@org.kie.api.definition.type.Label("policyClaim")
	private java.lang.String policyClaim;
	@org.kie.api.definition.type.Label("claimExcess")
	private java.lang.String claimExcess;
	@org.kie.api.definition.type.Label("damageDescription")
	private java.lang.String damageDescription;
	@org.kie.api.definition.type.Label("secondaryCause")
	private java.lang.String secondaryCause;

	@org.kie.api.definition.type.Label("type")
	private com.myteam.tts_connected_claims.type type;

	@org.kie.api.definition.type.Label("coverType")
	private com.myteam.tts_connected_claims.coverType coverType;

	@org.kie.api.definition.type.Label("status")
	private com.myteam.tts_connected_claims.status status;

	@org.kie.api.definition.type.Label("supplier")
	private com.myteam.tts_connected_claims.supplier supplier;

	@org.kie.api.definition.type.Label("repudiationReason")
	private com.myteam.tts_connected_claims.repudiationReason repudiationReason;

	@org.kie.api.definition.type.Label("risk")
	private com.myteam.tts_connected_claims.risk risk;

	@org.kie.api.definition.type.Label("claimsProcessor")
	private com.myteam.tts_connected_claims.claimsProcessor claimsProcessor;

	@org.kie.api.definition.type.Label("causeOfLoss")
	private com.myteam.tts_connected_claims.causeOfLoss causeOfLoss;

	@org.kie.api.definition.type.Label("tpDriver")
	private com.myteam.tts_connected_claims.tpDriver tpDriver;

	@org.kie.api.definition.type.Label(value = "guiltyParty")
	private java.lang.String guiltyParty;

	public claimsData() {
	}

	public java.lang.String getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.String amount) {
		this.amount = amount;
	}

	public java.lang.String getClaimNumber() {
		return this.claimNumber;
	}

	public void setClaimNumber(java.lang.String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public java.lang.String getCaptureDate() {
		return this.captureDate;
	}

	public void setCaptureDate(java.lang.String captureDate) {
		this.captureDate = captureDate;
	}

	public java.lang.String getIncidentDate() {
		return this.incidentDate;
	}

	public void setIncidentDate(java.lang.String incidentDate) {
		this.incidentDate = incidentDate;
	}

	public java.lang.String getIncidentTime() {
		return this.incidentTime;
	}

	public void setIncidentTime(java.lang.String incidentTime) {
		this.incidentTime = incidentTime;
	}

	public java.lang.String getIncidentDescription() {
		return this.incidentDescription;
	}

	public void setIncidentDescription(java.lang.String incidentDescription) {
		this.incidentDescription = incidentDescription;
	}

	public java.lang.String getPolicyClaim() {
		return this.policyClaim;
	}

	public void setPolicyClaim(java.lang.String policyClaim) {
		this.policyClaim = policyClaim;
	}

	public java.lang.String getClaimExcess() {
		return this.claimExcess;
	}

	public void setClaimExcess(java.lang.String claimExcess) {
		this.claimExcess = claimExcess;
	}

	public java.lang.String getDamageDescription() {
		return this.damageDescription;
	}

	public void setDamageDescription(java.lang.String damageDescription) {
		this.damageDescription = damageDescription;
	}

	public java.lang.String getSecondaryCause() {
		return this.secondaryCause;
	}

	public void setSecondaryCause(java.lang.String secondaryCause) {
		this.secondaryCause = secondaryCause;
	}

	public com.myteam.tts_connected_claims.type getType() {
		return this.type;
	}

	public void setType(com.myteam.tts_connected_claims.type type) {
		this.type = type;
	}

	public com.myteam.tts_connected_claims.coverType getCoverType() {
		return this.coverType;
	}

	public void setCoverType(com.myteam.tts_connected_claims.coverType coverType) {
		this.coverType = coverType;
	}

	public com.myteam.tts_connected_claims.status getStatus() {
		return this.status;
	}

	public void setStatus(com.myteam.tts_connected_claims.status status) {
		this.status = status;
	}

	public com.myteam.tts_connected_claims.supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(com.myteam.tts_connected_claims.supplier supplier) {
		this.supplier = supplier;
	}

	public com.myteam.tts_connected_claims.repudiationReason getRepudiationReason() {
		return this.repudiationReason;
	}

	public void setRepudiationReason(
			com.myteam.tts_connected_claims.repudiationReason repudiationReason) {
		this.repudiationReason = repudiationReason;
	}

	public com.myteam.tts_connected_claims.risk getRisk() {
		return this.risk;
	}

	public void setRisk(com.myteam.tts_connected_claims.risk risk) {
		this.risk = risk;
	}

	public com.myteam.tts_connected_claims.claimsProcessor getClaimsProcessor() {
		return this.claimsProcessor;
	}

	public void setClaimsProcessor(
			com.myteam.tts_connected_claims.claimsProcessor claimsProcessor) {
		this.claimsProcessor = claimsProcessor;
	}

	public com.myteam.tts_connected_claims.causeOfLoss getCauseOfLoss() {
		return this.causeOfLoss;
	}

	public void setCauseOfLoss(
			com.myteam.tts_connected_claims.causeOfLoss causeOfLoss) {
		this.causeOfLoss = causeOfLoss;
	}

	public com.myteam.tts_connected_claims.tpDriver getTpDriver() {
		return this.tpDriver;
	}

	public void setTpDriver(com.myteam.tts_connected_claims.tpDriver tpDriver) {
		this.tpDriver = tpDriver;
	}

	public java.lang.String getGuiltyParty() {
		return this.guiltyParty;
	}

	public void setGuiltyParty(java.lang.String guiltyParty) {
		this.guiltyParty = guiltyParty;
	}

	public claimsData(
			java.lang.String amount,
			java.lang.String claimNumber,
			java.lang.String captureDate,
			java.lang.String incidentDate,
			java.lang.String incidentTime,
			java.lang.String incidentDescription,
			java.lang.String policyClaim,
			java.lang.String claimExcess,
			java.lang.String damageDescription,
			java.lang.String secondaryCause,
			com.myteam.tts_connected_claims.type type,
			com.myteam.tts_connected_claims.coverType coverType,
			com.myteam.tts_connected_claims.status status,
			com.myteam.tts_connected_claims.supplier supplier,
			com.myteam.tts_connected_claims.repudiationReason repudiationReason,
			com.myteam.tts_connected_claims.risk risk,
			com.myteam.tts_connected_claims.claimsProcessor claimsProcessor,
			com.myteam.tts_connected_claims.causeOfLoss causeOfLoss,
			com.myteam.tts_connected_claims.tpDriver tpDriver,
			java.lang.String guiltyParty) {
		this.amount = amount;
		this.claimNumber = claimNumber;
		this.captureDate = captureDate;
		this.incidentDate = incidentDate;
		this.incidentTime = incidentTime;
		this.incidentDescription = incidentDescription;
		this.policyClaim = policyClaim;
		this.claimExcess = claimExcess;
		this.damageDescription = damageDescription;
		this.secondaryCause = secondaryCause;
		this.type = type;
		this.coverType = coverType;
		this.status = status;
		this.supplier = supplier;
		this.repudiationReason = repudiationReason;
		this.risk = risk;
		this.claimsProcessor = claimsProcessor;
		this.causeOfLoss = causeOfLoss;
		this.tpDriver = tpDriver;
		this.guiltyParty = guiltyParty;
	}

}