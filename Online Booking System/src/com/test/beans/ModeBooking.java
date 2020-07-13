package com.test.beans;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ModeBooking {
	
	String bookingId;
	String travellerName;
	String phoneNumber;
	String date;
	String source;
	String destination;
	
	public ModeBooking() {
		
	}
	
	public ModeBooking(String travellerName,String phoneNumber,String dateInput,String source,String destination,String bookingId) {
		this.travellerName = travellerName;
		this.phoneNumber = phoneNumber;
		this.date = dateInput;
		this.source = source;
		this.destination = destination;
		this.bookingId = bookingId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getTravellerName() {
		return travellerName;
	}

	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
	
}
