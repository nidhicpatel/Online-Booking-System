package com.test.beans;

public class FlightBooking extends ModeBooking {
	
	String mode = "FlightBooking";
	
	public FlightBooking(String travellerName, String phoneNumber, String dateInput, String source, String destination,String mode,String bookingId) {
		super(travellerName, phoneNumber, dateInput, source, destination,bookingId);
		this.mode = mode;
	}

	public FlightBooking() {
		super();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
