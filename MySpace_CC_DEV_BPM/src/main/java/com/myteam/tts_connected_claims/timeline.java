package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class timeline implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "key")
	private java.lang.String key;
	@org.kie.api.definition.type.Label(value = "statusUpdate")
	private java.lang.String statusUpdate;
	@org.kie.api.definition.type.Label(value = "time")
	private java.lang.String time;

	public timeline() {
	}

	public java.lang.String getKey() {
		return this.key;
	}

	public void setKey(java.lang.String key) {
		this.key = key;
	}

	public java.lang.String getStatusUpdate() {
		return this.statusUpdate;
	}

	public void setStatusUpdate(java.lang.String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}

	public java.lang.String getTime() {
		return this.time;
	}

	public void setTime(java.lang.String time) {
		this.time = time;
	}

	public timeline(java.lang.String key, java.lang.String statusUpdate,
			java.lang.String time) {
		this.key = key;
		this.statusUpdate = statusUpdate;
		this.time = time;
	}

}