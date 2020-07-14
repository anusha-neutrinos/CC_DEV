package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vehicleDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("year")
	private String year;

	@org.kie.api.definition.type.Label("registrationNumber")
	private java.lang.String registrationNumber;

	@org.kie.api.definition.type.Label("make")
	private java.lang.String make;

	@org.kie.api.definition.type.Label("model")
	private java.lang.String model;

	@org.kie.api.definition.type.Label("colour")
	private java.lang.String colour;

	@org.kie.api.definition.type.Label("riskItemCancellationDate")
	private java.lang.String riskItemCancellationDate;

	@org.kie.api.definition.type.Label("riskItemInactiveReason")
	private java.lang.String riskItemInactiveReason;

	@org.kie.api.definition.type.Label("riskItemInceptionDate")
	private java.lang.String riskItemInceptionDate;

	@org.kie.api.definition.type.Label("carHireVehicleTypeDescription")
	private java.lang.String carHireVehicleTypeDescription;

	@org.kie.api.definition.type.Label("carHireCompanyDescription")
	private java.lang.String carHireCompanyDescription;

	@org.kie.api.definition.type.Label("carHireTheftDuration")
	private java.lang.String carHireTheftDuration;

	@org.kie.api.definition.type.Label("carHireAccidentDuration")
	private java.lang.String carHireAccidentDuration;

	@org.kie.api.definition.type.Label("carHireInactiveReason")
	private java.lang.String carHireInactiveReason;

	@org.kie.api.definition.type.Label("carHireActiveIndicator")
	private java.lang.String carHireActiveIndicator;

	@org.kie.api.definition.type.Label("carHireCoverTypeDescription")
	private java.lang.String carHireCoverTypeDescription;

	@org.kie.api.definition.type.Label("carHireNotActiveReason")
	private java.lang.String carHireNotActiveReason;

	@org.kie.api.definition.type.Label("carhireCoverTypeCode")
	private java.lang.String carhireCoverTypeCode;

	@org.kie.api.definition.type.Label("coverTypeCode")
	private java.lang.String coverTypeCode;

	@org.kie.api.definition.type.Label("coverTypeDescription")
	private java.lang.String coverTypeDescription;

	@org.kie.api.definition.type.Label("regularDriverSequenceNumber")
	private java.lang.String regularDriverSequenceNumber;

	@org.kie.api.definition.type.Label("riskItemAssistBenefits")
	private java.lang.String riskItemAssistBenefits;

	@org.kie.api.definition.type.Label("riskTypeCode")
	private java.lang.String riskTypeCode;

	@org.kie.api.definition.type.Label("statusCode")
	private java.lang.String statusCode;

	@org.kie.api.definition.type.Label("statusDescription")
	private java.lang.String statusDescription;

	@org.kie.api.definition.type.Label("vehicleActiveIndicator")
	private java.lang.String vehicleActiveIndicator;

	@org.kie.api.definition.type.Label("vinNumber")
	private java.lang.String vinNumber;

	public vehicleDetails() {
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(java.lang.String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.lang.String getMake() {
		return this.make;
	}

	public void setMake(java.lang.String make) {
		this.make = make;
	}

	public java.lang.String getModel() {
		return this.model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	public java.lang.String getYear() {
		return this.year;
	}

	public void setYear(java.lang.String year) {
		this.year = year;
	}

	public java.lang.String getColour() {
		return this.colour;
	}

	public void setColour(java.lang.String colour) {
		this.colour = colour;
	}

	public java.lang.String getRiskItemCancellationDate() {
		return this.riskItemCancellationDate;
	}

	public void setRiskItemCancellationDate(
			java.lang.String riskItemCancellationDate) {
		this.riskItemCancellationDate = riskItemCancellationDate;
	}

	public java.lang.String getRiskItemInactiveReason() {
		return this.riskItemInactiveReason;
	}

	public void setRiskItemInactiveReason(
			java.lang.String riskItemInactiveReason) {
		this.riskItemInactiveReason = riskItemInactiveReason;
	}

	public java.lang.String getRiskItemInceptionDate() {
		return this.riskItemInceptionDate;
	}

	public void setRiskItemInceptionDate(java.lang.String riskItemInceptionDate) {
		this.riskItemInceptionDate = riskItemInceptionDate;
	}

	public java.lang.String getCarHireVehicleTypeDescription() {
		return this.carHireVehicleTypeDescription;
	}

	public void setCarHireVehicleTypeDescription(
			java.lang.String carHireVehicleTypeDescription) {
		this.carHireVehicleTypeDescription = carHireVehicleTypeDescription;
	}

	public java.lang.String getCarHireCompanyDescription() {
		return this.carHireCompanyDescription;
	}

	public void setCarHireCompanyDescription(
			java.lang.String carHireCompanyDescription) {
		this.carHireCompanyDescription = carHireCompanyDescription;
	}

	public java.lang.String getCarHireTheftDuration() {
		return this.carHireTheftDuration;
	}

	public void setCarHireTheftDuration(java.lang.String carHireTheftDuration) {
		this.carHireTheftDuration = carHireTheftDuration;
	}

	public java.lang.String getCarHireAccidentDuration() {
		return this.carHireAccidentDuration;
	}

	public void setCarHireAccidentDuration(
			java.lang.String carHireAccidentDuration) {
		this.carHireAccidentDuration = carHireAccidentDuration;
	}

	public java.lang.String getCarHireInactiveReason() {
		return this.carHireInactiveReason;
	}

	public void setCarHireInactiveReason(java.lang.String carHireInactiveReason) {
		this.carHireInactiveReason = carHireInactiveReason;
	}

	public java.lang.String getCarHireActiveIndicator() {
		return this.carHireActiveIndicator;
	}

	public void setCarHireActiveIndicator(
			java.lang.String carHireActiveIndicator) {
		this.carHireActiveIndicator = carHireActiveIndicator;
	}

	public java.lang.String getCarHireCoverTypeDescription() {
		return this.carHireCoverTypeDescription;
	}

	public void setCarHireCoverTypeDescription(
			java.lang.String carHireCoverTypeDescription) {
		this.carHireCoverTypeDescription = carHireCoverTypeDescription;
	}

	public java.lang.String getCarHireNotActiveReason() {
		return this.carHireNotActiveReason;
	}

	public void setCarHireNotActiveReason(
			java.lang.String carHireNotActiveReason) {
		this.carHireNotActiveReason = carHireNotActiveReason;
	}

	public java.lang.String getCarhireCoverTypeCode() {
		return this.carhireCoverTypeCode;
	}

	public void setCarhireCoverTypeCode(java.lang.String carhireCoverTypeCode) {
		this.carhireCoverTypeCode = carhireCoverTypeCode;
	}

	public java.lang.String getCoverTypeCode() {
		return this.coverTypeCode;
	}

	public void setCoverTypeCode(java.lang.String coverTypeCode) {
		this.coverTypeCode = coverTypeCode;
	}

	public java.lang.String getCoverTypeDescription() {
		return this.coverTypeDescription;
	}

	public void setCoverTypeDescription(java.lang.String coverTypeDescription) {
		this.coverTypeDescription = coverTypeDescription;
	}

	public java.lang.String getRegularDriverSequenceNumber() {
		return this.regularDriverSequenceNumber;
	}

	public void setRegularDriverSequenceNumber(
			java.lang.String regularDriverSequenceNumber) {
		this.regularDriverSequenceNumber = regularDriverSequenceNumber;
	}

	public java.lang.String getRiskItemAssistBenefits() {
		return this.riskItemAssistBenefits;
	}

	public void setRiskItemAssistBenefits(
			java.lang.String riskItemAssistBenefits) {
		this.riskItemAssistBenefits = riskItemAssistBenefits;
	}

	public java.lang.String getRiskTypeCode() {
		return this.riskTypeCode;
	}

	public void setRiskTypeCode(java.lang.String riskTypeCode) {
		this.riskTypeCode = riskTypeCode;
	}

	public java.lang.String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(java.lang.String statusCode) {
		this.statusCode = statusCode;
	}

	public java.lang.String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(java.lang.String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public java.lang.String getVehicleActiveIndicator() {
		return this.vehicleActiveIndicator;
	}

	public void setVehicleActiveIndicator(
			java.lang.String vehicleActiveIndicator) {
		this.vehicleActiveIndicator = vehicleActiveIndicator;
	}

	public java.lang.String getVinNumber() {
		return this.vinNumber;
	}

	public void setVinNumber(java.lang.String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public vehicleDetails(java.lang.String description, java.lang.String year,
			java.lang.String registrationNumber, java.lang.String make,
			java.lang.String model, java.lang.String colour,
			java.lang.String riskItemCancellationDate,
			java.lang.String riskItemInactiveReason,
			java.lang.String riskItemInceptionDate,
			java.lang.String carHireVehicleTypeDescription,
			java.lang.String carHireCompanyDescription,
			java.lang.String carHireTheftDuration,
			java.lang.String carHireAccidentDuration,
			java.lang.String carHireInactiveReason,
			java.lang.String carHireActiveIndicator,
			java.lang.String carHireCoverTypeDescription,
			java.lang.String carHireNotActiveReason,
			java.lang.String carhireCoverTypeCode,
			java.lang.String coverTypeCode,
			java.lang.String coverTypeDescription,
			java.lang.String regularDriverSequenceNumber,
			java.lang.String riskItemAssistBenefits,
			java.lang.String riskTypeCode, java.lang.String statusCode,
			java.lang.String statusDescription,
			java.lang.String vehicleActiveIndicator, java.lang.String vinNumber) {
		this.description = description;
		this.year = year;
		this.registrationNumber = registrationNumber;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.riskItemCancellationDate = riskItemCancellationDate;
		this.riskItemInactiveReason = riskItemInactiveReason;
		this.riskItemInceptionDate = riskItemInceptionDate;
		this.carHireVehicleTypeDescription = carHireVehicleTypeDescription;
		this.carHireCompanyDescription = carHireCompanyDescription;
		this.carHireTheftDuration = carHireTheftDuration;
		this.carHireAccidentDuration = carHireAccidentDuration;
		this.carHireInactiveReason = carHireInactiveReason;
		this.carHireActiveIndicator = carHireActiveIndicator;
		this.carHireCoverTypeDescription = carHireCoverTypeDescription;
		this.carHireNotActiveReason = carHireNotActiveReason;
		this.carhireCoverTypeCode = carhireCoverTypeCode;
		this.coverTypeCode = coverTypeCode;
		this.coverTypeDescription = coverTypeDescription;
		this.regularDriverSequenceNumber = regularDriverSequenceNumber;
		this.riskItemAssistBenefits = riskItemAssistBenefits;
		this.riskTypeCode = riskTypeCode;
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
		this.vehicleActiveIndicator = vehicleActiveIndicator;
		this.vinNumber = vinNumber;
	}

}