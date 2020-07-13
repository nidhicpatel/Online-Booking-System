package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.Flight;
import com.test.beans.Hotel;
import com.test.dao.ApplicationDaoHotel;

/**
 * Servlet implementation class getFlightses
 */
@WebServlet("/getHotels")
public class getHotels extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getHotels() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/html/searchHotel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String city = request.getParameter("city");
		city = city.toLowerCase();
		ApplicationDaoHotel dao = new ApplicationDaoHotel();
		ArrayList<Hotel> hotels = dao.getHotels(city);
		
		request.setAttribute("message","Here are the hotels in: "+city);
		request.setAttribute("hotels",hotels);
		
		if(hotels.size() == 0) {
			request.setAttribute("message","Sorry, No hotels in this city");
		}
		request.getRequestDispatcher("/html/searchedHotels.jsp").forward(request, response);
	}

}
