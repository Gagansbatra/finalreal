package com.prachi.view;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FacultyReport
 */
@WebServlet("/FacultyReport")
public class FacultyReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
HttpSession ses=request.getSession(false);
		 try{
				
				   out.println("<script src=asset/jquery-2.2.1.min.js></script>");
			       out.println("<script src=FacultyReport.js></script>");
				out.println("<html><form action=ReportSubmit>");
				Calendar  c=Calendar.getInstance();
				
				String cd=c.get(Calendar.YEAR)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.DATE);
				out.println("<table>");
				out.println("<tr><td></td><td><input type=hidden name=fid id=fid value="+ses.getValue("SFID").toString()+" readonly=true></td></tr>");
			    out.println("<tr><td>Date:</td><td><input type=text  name=pd id=pd></td><td><input type=text name=cd value="+cd+" id=cd readonly=true></td></tr>");
			   
			    out.println("<tr><td>Branch Id:</td><td><select  name=branchid  id=bid></select></td></tr>");
				//int id=FacultySubjectDAO.getId();
			    out.println("<tr><td><b><i>Semester:</i></b></td><td><select name=sm id=sm><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
			    out.println("<tr><td>Subject:</td><td><select name=sbid id=sbid ></select></td></tr>");
			     out.println("</table>");
				out.println("<br>");
			    out.println("<span id=result></span>");
			    out.println("</html>");
			    
			
			   // out.println("<tr><td>Semester:</td><td><input type=text name=sm id=sm></td></tr>");
			   
				 }catch(Exception e)
				 {
					 
				response.sendRedirect("FacultyLogIn");	 
					 
				 }
			     }
} 
			


