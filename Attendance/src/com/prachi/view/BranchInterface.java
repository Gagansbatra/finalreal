package com.prachi.view;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BranchInterface
 */
@WebServlet("/BranchInterface")
public class BranchInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BranchInterface() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=response.getWriter();
		

		  out.println("<html>");
		  out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		  out.println("<a href=BranchDisplayAll class='btn btn-primary'>List of all Branches</a>");
		  out.println("<form action=BranchSubmit>");
		  out.println("<table class='table table-bordered'>");
	      out.println("<caption><h2><i>Branch Data Submission</i></h2></caption>");
	 out.println("<tr><td><b><i>Branch Id:</i></b></td><td><input class='input-text required-entry' type=text name=bid required='required' size=40></td></tr>");
	  out.println("<tr><td><b><i>Branch Name:</i></b></td><td><input class='input-text required-entry' type=text name=bn required='required' size=40></td></tr>");
	  out.println("<tr><td><input type=SUBMIT class='btn btn-success'></td><td><input class='btn btn-info' type=RESET></td></tr>");
	  out.println("</table></form></html>");
	  out.flush();
}
}
