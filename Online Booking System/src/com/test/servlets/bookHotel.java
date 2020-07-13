package com.test.servlets;
import com.test.beans.*;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.test.dao.*;
/**
 * Servlet implementation class bookFlight
 */
@WebServlet("/bookHotel")
public class bookHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/html/bookHotel.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public String gen() 
	{ 
	    Random r = new Random( System.currentTimeMillis() );
	    return Integer.toString(((1 + r.nextInt(2)) * 10000 + r.nextInt(10000))); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookingId  = gen();
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String hotelName = request.getParameter("hname");
		Integer noOfRooms = Integer.parseInt(request.getParameter("noOfRooms"));
		String date = request.getParameter("date");
		Integer noOfDaysToStay = Integer.parseInt(request.getParameter("noOfDaysToStay"));
		System.out.println(date);
		HotelBooking booking = new HotelBooking(bookingId,name,number,hotelName,date,noOfRooms,noOfDaysToStay);
		
		//getting application Dao
		ApplicationDaoHotel dao = new ApplicationDaoHotel();
		
		//Calling our execution method.
		request.setAttribute("message","Ticket Booked Successfully");
		request.setAttribute("bookingDetails","");
		int reply = dao.bookHotel(booking);
		if(reply != 0){
			request.setAttribute("bookingDetails",booking);
		}
		else {
			request.setAttribute("message","Some error occured! Please try again");
		}
		request.getRequestDispatcher("/html/bookedDetailsHotel.jsp").forward(request, response);
	}

}
