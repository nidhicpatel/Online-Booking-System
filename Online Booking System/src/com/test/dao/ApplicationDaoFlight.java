package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.test.beans.*;

public class ApplicationDaoFlight {
	
	public int bookFlight(FlightBooking booking){
		
		int rowsAffected = 0;
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			
			// Creating the statement
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `flightBookings`(bookingId,name,number,startCity,destinationCity,bookdate) VALUES (?, ?, ?, ?, ?,?)");
			
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
	
	public ArrayList<FlightBooking> getFlightReservations(){
		
		ArrayList<FlightBooking> results = new ArrayList<FlightBooking>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from flightBookings";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				FlightBooking booking = new FlightBooking();
				booking.setBookingId(set.getString("bookingId"));
				booking.setTravellerName(set.getString("name"));
				booking.setPhoneNumber(set.getString("number"));
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
	
	public ArrayList<Flight> getFlightes(String date){
		ArrayList<Flight> Flightes = new ArrayList<Flight>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from flightDetails where FlightDate like '%"+date+"%'";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				Flight Flight = new Flight();	
				Flight.setVehicleNo(set.getString("flightNo"));
				Flight.setSource(set.getString("startCity"));
				Flight.setDestination(set.getString("destinationCity"));
				Flight.setDate(set.getString("flightDate"));
				Flight.setTime(set.getString("flightTime"));
				Flight.setMode("FlightBooking");
				Flightes.add(Flight);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return Flightes;
	}

}