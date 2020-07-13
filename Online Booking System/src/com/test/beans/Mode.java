package com.test.beans;

public class Mode {
	
	String vehicleNo;
	String source;
	String destination;
	String date;
	String time;
	
	public Mode() {
		
	}

	public Mode(String vehicleNo, String source, String destination, String date, String time) {
		this.vehicleNo = vehicleNo;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.time = time;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
