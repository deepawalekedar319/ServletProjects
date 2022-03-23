package com.kedar.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/servlet2")
public class RequestAttributeServlet2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// doGet(-,-) logic
		
		// set response content type
		resp.setContentType("text/html");
		// get the PrintWriter object
		PrintWriter pw = resp.getWriter();
	
		// Accessing the request attribute in Servlet 2
		pw.println("<h1> This is the request attribute from Servlet - 2 :: " + req.getAttribute("attribute1"));
		
		// forward the request to the Second Servlet
		// Create requestDispatcher object
		RequestDispatcher rd = req.getRequestDispatcher("servlet3");
		// Forward the control
		rd.forward(req, resp);
		
		// close the Stream
		pw.close();
		
	} // doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// when post request has came 
		doGet(req, resp);
	} // doPost(-,-)	 
} // class