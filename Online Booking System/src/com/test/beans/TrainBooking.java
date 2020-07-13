package com.test.beans;

public class TrainBooking extends ModeBooking {
	
	String mode = "TrainBooking";
	
	public TrainBooking(String travellerName, String phoneNumber, String dateInput, String source, String destination,String mode,String bookingId) {
		super(travellerName, phoneNumber, dateInput, source, destination,bookingId);
		this.mode = mode;
	}

	public TrainBooking() {
		super();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
