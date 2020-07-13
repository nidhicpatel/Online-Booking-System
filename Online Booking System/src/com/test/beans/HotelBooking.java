package com.test.beans;

public class HotelBooking {
	

	String bookingId;
	String name;
	String number;
	String hotelName;
	String bookDate;
	Integer noOfRooms;
	Integer noOfDaysToStay;
	
	public HotelBooking() {
		
	}
	
	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public Integer getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public Integer getNoOfDaysToStay() {
		return noOfDaysToStay;
	}

	public void setNoOfDaysToStay(Integer noOfDaysToStay) {
		this.noOfDaysToStay = noOfDaysToStay;
	}

	public HotelBooking(String bookingId, String name, String number, String hotelName, String bookDate,
			Integer noOfRooms, Integer noOfDaysToStay) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.number = number;
		this.hotelName = hotelName;
		this.bookDate = bookDate;
		this.noOfRooms = noOfRooms;
		this.noOfDaysToStay = noOfDaysToStay;
	}
	
	
}
