package com.prachi.view;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class marksdetails
 */
@WebServlet("/marksdetails")
public class marksdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public marksdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
				  out.println("<script src=fs.js></script>");
				  out.println("<script src=marks.js></script>");
				  out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
				  out.println("<html>");
				out.println("<form action=MarksSubmit>");
				out.println("<caption><h1><i>Marks Register</i></h1></caption>");
				  out.println("<center><table class='table table-bordered'>");
				  
				  out.println("<tr><td><b><i>Branch:</i></b></td><td><select name=bid class='input-text required-entry' id=bid ></select></td></tr>");
				  out.println("<tr><td><b><i>Semester:</i></b></td><td><select class='input-text required-entry' name=sm id=sm><option value=\"-select\">-select-</option><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
			
				  //out.println("<tr><td>Student ID:</td><td><select class='input-text required-entry' name=sid id=sid ></select></td></tr>");
				  // out.println("<tr><td><b><i>Subject :</i></b></td><td><select name=sbid id=sbid ></select></br></td></tr>");
				 // out.println("<tr><td><input type=submit></td><td><input type=reset></td></tr>");
				  out.println("</table></center>");
				  out.println("<span id=result></span>");
				  out.println("</html>");
				  
				  out.flush();
				  }

}
