package com.test.beans;

public class Hotel {
	
	Integer hotelId;
	String hotelName;
	String hotelCity;
	String hotelClass;
	Integer hotelCapacity;
	String hotelOwner;
	
	public Hotel() {
		
	}
	
	
	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(int i) {
		this.hotelId = i;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelClass() {
		return hotelClass;
	}

	public void setHotelClass(String hotelClass) {
		this.hotelClass = hotelClass;
	}

	public Integer getHotelCapacity() {
		return hotelCapacity;
	}

	public void setHotelCapacity(Integer hotelCapacity) {
		this.hotelCapacity = hotelCapacity;
	}

	public String getHotelOwner() {
		return hotelOwner;
	}

	public void setHotelOwner(String hotelOwner) {
		this.hotelOwner = hotelOwner;
	}

	public Hotel(Integer hotelId, String hotelName, String hotelCity, String hotelClass, Integer hotelCapacity,
			String hotelOwner) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelClass = hotelClass;
		this.hotelCapacity = hotelCapacity;
		this.hotelOwner = hotelOwner;
	}
	
}
