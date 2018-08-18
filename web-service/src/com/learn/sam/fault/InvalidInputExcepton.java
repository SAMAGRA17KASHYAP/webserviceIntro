package com.learn.sam.fault;

@SuppressWarnings("serial")
public class InvalidInputExcepton extends Exception {
	private String errorDetails;
	private String reason;

	public InvalidInputExcepton(String errorDetails, String reason) {
		super(reason);
		this.errorDetails = errorDetails;
	}

	public String getFaultInfo() {
		return this.errorDetails;
	}

}
