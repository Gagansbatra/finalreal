package com.prachi.view;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AttendanceInterface
 */
@WebServlet("/AttendanceInterface")
public class AttendanceInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendanceInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession ses=request.getSession();
		 
		try{
			
			
out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		  out.println("<script src=fs.js></script>");
		  out.println("<script src=FetchStudents.js></script>");
		  out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		  out.println("<html>");
		out.println("<form action=AttendanceSubmit>");
		  out.println("<caption><h2><i>Attendance Register</i></h2></caption><center><table class='table table-bordered'>");
		  
		  out.println("<tr><td><input class='input-text required-entry' type=hidden name=fid id=fid value="+ses.getValue("SFID").toString()+" ></td><td></td></tr>");
		  out.println("<tr><td><b><i>Branch:</i></b></td><td><select name=bid class='input-text required-entry'   id=bid ></select></td></tr>");
		  out.println("<tr><td><b><i>Semester:</i></b></td><td><select name=sm class='input-text required-entry' id=sm><option value=\"-select\">-select-</option><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
		  out.println("<tr><td><b><i>Subject :</i></b></td><td><select name=sbid class='input-text required-entry' id=sbid ></select></td></tr>");
		 // out.println("<tr><td><input type=submit></td><td><input type=reset></td></tr>");
		  out.println("</table></center>");
		  out.println("<span id=result></span>");
		  out.println("</html>");
	 out.flush();
	
	
}catch(Exception e)
{
	response.sendRedirect("FacultyLogin");
	 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
