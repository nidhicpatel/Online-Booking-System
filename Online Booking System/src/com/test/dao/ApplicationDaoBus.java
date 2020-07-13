package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.test.beans.*;

public class ApplicationDaoBus {
	
	public int bookBus(BusBooking booking){
		
		int rowsAffected = 0;
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			
			// Creating the statement
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `busBookings`(bookingId,name,number1,startCity,destinationCity,bookdate) VALUES (?, ?, ?, ?, ?,?)");
			
			//Setting the values.
			pstmt.setString(1,booking.getBookingId());
			pstmt.setString(2,booking.getTravellerName());
			pstmt.setString(3,booking.getPhoneNumber());
			pstmt.setString(4,booking.getSource());
			pstmt.setString(5,booking.getDestination());
			pstmt.setString(6,booking.getDate());
			
			//Executing the query.
			rowsAffected = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowsAffected;
	}
	
	public ArrayList<BusBooking> getBusReservations(){
		
		ArrayList<BusBooking> results = new ArrayList<BusBooking>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from busBookings";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				BusBooking booking = new BusBooking();
				booking.setBookingId(set.getString("bookingId"));
				booking.setTravellerName(set.getString("name"));
				booking.setPhoneNumber(set.getString("number1"));
				booking.setSource(set.getString("startCity"));
				booking.setDestination(set.getString("destinationCity"));
				booking.setDate(set.getDate("bookdate").toString());
				results.add(booking);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return results;
		
	}
	
	public ArrayList<Bus> getBuses(String date){
		ArrayList<Bus> buses = new ArrayList<Bus>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from busDetails where busDate like '%"+date+"%'";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				Bus bus = new Bus();	
				bus.setVehicleNo(set.getString("busNo"));
				bus.setSource(set.getString("startCity"));
				bus.setDestination(set.getString("destinationCity"));
				bus.setDate(set.getString("busDate"));
				bus.setTime(set.getString("busTime"));
				bus.setMode("BusBooking");
				buses.add(bus);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return buses;
	}

}