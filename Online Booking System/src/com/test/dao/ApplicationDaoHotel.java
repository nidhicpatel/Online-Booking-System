package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.test.beans.HotelBooking;
import com.test.beans.Hotel;

public class ApplicationDaoHotel {
	
	public ArrayList<Hotel> getHotels(String city){
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from hotelDetails where hotelCity like '%"+city+"%'";
			java.sql.Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);	
			while(set.next()) {
				Hotel hotel = new Hotel();	
				hotel.setHotelId(set.getInt("hotelId"));
				hotel.setHotelName(set.getString("hotelName"));
				hotel.setHotelCapacity(set.getInt("hotelCapacity"));
				hotel.setHotelCity(set.getString("hotelCIty"));
				hotel.setHotelOwner(set.getString("hotelOwner"));
				hotel.setHotelClass(set.getString("hotelCLass"));
				hotels.add(hotel);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return hotels;
	}

public int bookHotel(HotelBooking hotel){
		
		int rowsAffected = 0;
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			
			// Creating the statement
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `hotelBookings`(bookingId,name,number,hotelName,bookdate,noOfRooms,noOfDaysToStay) VALUES (?, ?, ?, ?, ?,?,?)");
			
			//Setting the values.
			
			pstmt.setString(1, hotel.getBookingId());
			pstmt.setString(2, hotel.getName());
			pstmt.setString(3, hotel.getNumber());
			pstmt.setString(4, hotel.getHotelName());
			pstmt.setString(5, hotel.getBookDate());
			pstmt.setInt(6, hotel.getNoOfRooms());
			pstmt.setInt(7, hotel.getNoOfDaysToStay());
			
			//Executing the query.
			rowsAffected = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowsAffected;
	}
public ArrayList<HotelBooking> getHotelReservations(){
	
	ArrayList<HotelBooking> results = new ArrayList<HotelBooking>();
	try {
		Connection connection = DBConnection.getConnectionToDatabase();
		String sql = "select * from hotelBookings";
		java.sql.Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery(sql);
		while(set.next()) {
			HotelBooking booking = new HotelBooking();
			booking.setBookingId(set.getString("bookingId"));
			booking.setBookDate(set.getString("bookdate"));
			booking.setHotelName(set.getString("hotelName"));
			booking.setNoOfDaysToStay(set.getInt("noOfDaysToStay"));
			booking.setNoOfRooms(set.getInt("noOfRooms"));
			booking.setName(set.getString("name"));
			booking.setNumber(set.getString("number"));
			results.add(booking);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return results;
	
}
	
}

