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
 * Servlet implementation class bookTrain
 */
@WebServlet("/bookTrain")
public class bookTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookTrain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/html/bookTrain.jsp").forward(request, response);
		
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
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String date = request.getParameter("date");
		System.out.println(date);
		TrainBooking booking = new TrainBooking(name,number,date,from,to,"TrainBooking",bookingId);
		
		//getting application Dao
		ApplicationDaoTrain dao = new ApplicationDaoTrain();
		
		//Calling our execution method.
		request.setAttribute("message","Ticket Booked Successfully");
		request.setAttribute("bookingDetails","");
		int reply = dao.bookTrain(booking);
		if(reply != 0){
			request.setAttribute("bookingDetails",booking);
		}
		else {
			request.setAttribute("message","Some error occured! Please try again");
		}
		request.getRequestDispatcher("/html/bookedDetailsTrain.jsp").forward(request, response);
	}

}
