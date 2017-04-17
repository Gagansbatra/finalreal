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
 * Servlet implementation class ReportByDate
 */
@WebServlet("/ReportByDate")
public class ReportByDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportByDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try{
				PrintWriter out=response.getWriter();
				
				 // HttpSession ses=request.getSession();
				   out.println("<script src=asset/jquery-2.2.1.min.js></script>");
			       out.println("<script src=reportbydate.js></script>");
				out.println("<html><form action=ReportByDateSubmit>");
				out.println("<table>");
				//out.println("<tr><td>Faculty Id:</td><td><input type=text name=facultyid value="+ses.getValue("SFACULTYID").toString()+" readonly=true></td></tr>");
				//out.println("<tr><td></td><td><input type=hidden name=fid id=fid value="+ses.getValue("SFID").toString()+" readonly=true></td></tr>");
				out.println("<tr><td>Branch Id:</td><td><select  name=bid  id=bid></select></td></tr>");
				//int id=FacultySubjectDAO.getId();
				  out.println("<tr><td><b><i>Semester:</i></b></td><td><select name=sm id=sm><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
			    out.println("<tr><td>Student ID:</td><td><select name=sid id=sid ></select></td></tr>");
			    out.println("<tr><td>From Date:</td><td><input type=date  name=pd id=pd></td><td> To Date :<input type=date name=nd id=nd ></td></tr>");
				
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



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method s void setBranchid(String parameter) {
		// TODO Auto-generated method stub
		
	}

}
