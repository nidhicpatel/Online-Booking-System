package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.Flight;
import com.test.dao.ApplicationDaoFlight;

/**
 * Servlet implementation class getFlightses
 */
@WebServlet("/getFlights")
public class getFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/html/searchFlight.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("date");
		ApplicationDaoFlight dao = new ApplicationDaoFlight();
		ArrayList<Flight> Flightses = dao.getFlightes(date);
		
		request.setAttribute("message","Here are the Flightses on: "+date);
		request.setAttribute("Flights",Flightses);
		
		if(Flightses.size() == 0) {
			request.setAttribute("message","Sorry, No Flightses run on this date.");
		}
		request.getRequestDispatcher("/html/searchedFlights.jsp").forward(request, response);
	}

}
