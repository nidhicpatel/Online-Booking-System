package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.Train;
import com.test.dao.ApplicationDaoTrain;

/**
 * Servlet implementation class getTrainses
 */
@WebServlet("/getTrains")
public class getTrains extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTrains() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/html/searchTrain.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("date");
		ApplicationDaoTrain dao = new ApplicationDaoTrain();
		ArrayList<Train> Trainses = dao.getTraines(date);
		
		request.setAttribute("message","Here are the Trainses on: "+date);
		request.setAttribute("Trains",Trainses);
		
		if(Trainses.size() == 0) {
			request.setAttribute("message","Sorry, No Trainses run on this date.");
		}
		request.getRequestDispatcher("/html/searchedTrains.jsp").forward(request, response);
	}

}
