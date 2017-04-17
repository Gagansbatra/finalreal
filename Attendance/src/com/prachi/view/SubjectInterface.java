	package com.prachi.view;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubjectInterface
 */
@WebServlet("/SubjectInterface")
public class SubjectInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		 try{
			// out.println("<tr valign=top><td><a href=AdminLogin target=mw>Admin Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=FacultyLogin target=mw>Faculty Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=StudentLogin target=mw>Student Login </a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"AboutUs.jsp\" target=mw>About Us</a><br><br><td>");
		
			 }catch(Exception e)
			 {
			 }	
	       out.println("<html>");
	       out.println("<head><style>.table{font-size:12px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
	       out.println("<form action=SubjectSubmit>");
	       out.println("<a href=SubjectDisplayAll class='btn btn-info'>List of Subjects</a>");
	       out.println("<table class='table table-bordered'><caption><h2>Subject Data Register</h2></caption>");
	       out.println("<tr><td><b><i> Subject ID:</i></b></td><td><input class='input-text required-entry' type=text name=sbid required='required' size=40></td></tr>");
	       out.println("<tr><td><b><i> Branch ID:</i></b></td><td><input class='input-text required-entry' type=text name=bid required='required' size=40></td></tr>");
	       out.println("<tr><td><b><i>Subject Name:</i></b></td><td><input class='input-text required-entry' type=text name=sbn required='required' size=40></td></tr>");
	       out.println("<tr><td><b><i>Semester:</i></b></td><td><select class='input-text required-entry' name=sm><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
	       out.println("<tr><td><b><i> Status:</i></b></td><td><input type=radio name=ss value=Theory> Theory    <input type=radio name=ss value=Practical> Practical    <input type=radio name=ss value=Both> Both    </td></tr>");
	     //  out.println("<tr><td><b><i>Status:</i></b></td><td><input type=checkbox name=ss value=theory> Theory <input type=checkbox name=ss value=practical> Practical</td></tr>");
	       out.println("<tr><td><input type=SUBMIT class='btn btn-success'></td><td><input type=RESET class='btn btn-info'></td></tr>");
	 	  out.println("</table></form></html>");
	 	  out.flush();
	 	  }

}
