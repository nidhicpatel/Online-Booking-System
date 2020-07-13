package com.test.beans;

public class BusBooking extends ModeBooking {
	
	String mode = "BusBooking";
	
	public BusBooking(String travellerName, String phoneNumber, String dateInput, String source, String destination,String mode,String bookingId) {
		super(travellerName, phoneNumber, dateInput, source, destination,bookingId);
		this.mode = mode;
	}

	public BusBooking() {
		super();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
