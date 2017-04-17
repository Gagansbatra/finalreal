package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyStudentInterface
 */
@WebServlet("/FacultyStudentInterface")
public class FacultyStudentInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyStudentInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		  out.println("<script src=fs.js></script>");
		  out.println("<html>");
		  out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		  out.println("<form action=FacultySubjecSubmit>");
		  out.println("<table class='table table-bordered'>");
		  out.println("<caption><h1><i> Faculty-Subject Register </i></h1></caption>");
		  out.println("<tr><td><b><i>Faculty ID:</i></b></td><td><select name='fid'  id='fid' ><option value=''>Select </option> </select></br></td></tr>");
		  out.println("<tr><td><b><i>Branch ID :</i></b></td><td><select name='bid'  id='bid' ><option value=''>Select </option></select></br></td></tr>");
		  out.println("<tr><td><b><i>Semester:</i></b></td><td><select name=sm id=sm><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
		  out.println("<tr><td><b><i>Subject ID :</i></b></td><td><select name='sbid'  id='sbid' ><option value=''>Select </option></select></br></td></tr>");
		  out.println("<tr><td><input type=submit class='btn btn-success' value=submit ></td><td><input class='btn btn-info' type=reset></td></tr>");
		  out.println("</table></form></html>");
		  out.flush();
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
