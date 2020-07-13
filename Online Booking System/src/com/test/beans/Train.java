package com.test.beans;

public class Train extends Mode{
	
	String mode = "Train";

	public Train(String vehicleNo, String source, String destination, String date, String time,String mode) {
		super(vehicleNo,source,destination,date,time);
		this.mode = mode;
	}

	public Train() {
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
