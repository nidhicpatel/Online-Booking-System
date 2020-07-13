package com.test.beans;

public class Bus extends Mode{
	
	String mode = "Bus";

	public Bus(String vehicleNo, String source, String destination, String date, String time,String mode) {
		super(vehicleNo,source,destination,date,time);
		this.mode = mode;
	}

	public Bus() {
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
