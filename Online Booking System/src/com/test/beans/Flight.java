package com.test.beans;

public class Flight extends Mode{
	
	String mode = "Flight";

	public Flight(String vehicleNo, String source, String destination, String date, String time,String mode) {
		super(vehicleNo,source,destination,date,time);
		this.mode = mode;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
