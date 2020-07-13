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
import com.test.servlets.*;
/**
 * Servlet implementation class showAll
 */
@WebServlet("/showAllTrain")
public class showAllTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAllTrain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationDaoTrain dao = new ApplicationDaoTrain();
		System.out.println("hi");
		//call the method.
		ArrayList<TrainBooking> results = new ArrayList<>();
		results = dao.getTrainReservations();
		request.setAttribute("results",results);
		request.setAttribute("message","Here are the TrainBooking bookings");
		if(results.size() == 0) {
			request.setAttribute("message","There are no bookings currently.");
		}
		request.getRequestDispatcher("/html/showAllTrain.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
