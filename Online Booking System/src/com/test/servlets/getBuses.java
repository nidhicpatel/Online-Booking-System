package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.Bus;
import com.test.dao.ApplicationDaoBus;

/**
 * Servlet implementation class getBuses
 */
@WebServlet("/getBuses")
public class getBuses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getBuses() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/html/searchBus.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("date");
		ApplicationDaoBus dao = new ApplicationDaoBus();
		ArrayList<Bus> buses = dao.getBuses(date);
		
		request.setAttribute("message","Here are the buses on: "+date);
		request.setAttribute("buses",buses);
		
		if(buses.size() == 0) {
			request.setAttribute("message","Sorry, No buses run on this date.");
		}
		request.getRequestDispatcher("/html/searchedBuses.jsp").forward(request, response);
	}

}
