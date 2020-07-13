package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.test.beans.*;

public class ApplicationDaoTrain {
	
	public int bookTrain(TrainBooking booking){
		
		int rowsAffected = 0;
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			
			// Creating the statement
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `trainBookings`(bookingId,name,number,startCity,destinationCity,bookdate) VALUES (?, ?, ?, ?, ?,?)");
			
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
	
	public ArrayList<TrainBooking> getTrainReservations(){
		
		ArrayList<TrainBooking> results = new ArrayList<TrainBooking>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from trainBookings";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				TrainBooking booking = new TrainBooking();
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
	
	public ArrayList<Train> getTraines(String date){
		ArrayList<Train> Traines = new ArrayList<Train>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from trainDetails where TrainDate like '%"+date+"%'";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				Train Train = new Train();	
				Train.setVehicleNo(set.getString("trainNo"));
				Train.setSource(set.getString("startCity"));
				Train.setDestination(set.getString("destinationCity"));
				Train.setDate(set.getString("trainDate"));
				Train.setTime(set.getString("trainTime"));
				Train.setMode("TrainBooking");
				Traines.add(Train);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return Traines;
	}

}