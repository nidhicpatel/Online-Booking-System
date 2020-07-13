package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.test.beans.*;
import com.test.dao.*;
/**
 * Servlet implementation class showAll
 */
@WebServlet("/showAllHotel")
public class showAllHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAllHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationDaoHotel dao = new ApplicationDaoHotel();
		System.out.println("hi");
		//call the method.
		ArrayList<HotelBooking> results = new ArrayList<>();
		results = dao.getHotelReservations();
		request.setAttribute("results",results);
		request.setAttribute("message","Here are the HotelBooking");
		if(results.size() == 0) {
			request.setAttribute("message","There are no bookings currently.");
		}
		request.getRequestDispatcher("/html/showAllHotel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
