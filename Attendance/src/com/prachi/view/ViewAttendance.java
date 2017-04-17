package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prachi.dao.AttendanceDAO;
import com.prachi.dao.SubjectDAO;

/**
 * Servlet implementation class ViewAttendance
 */
@WebServlet("/ViewAttendance")
public class ViewAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ses=request.getSession();
		String sid=ses.getValue("SID").toString();
		PrintWriter out=response.getWriter();
		
		try {
			out.println("<html>");
		
		ResultSet rs=AttendanceDAO.viewAttendance(sid);
		   out.println("<script src=asset/jquery-2.2.1.min.js></script>");
	       out.println("<script src=reportbydate.js></script>");
	       out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		out.println("<html><form action=ReportByDateSubmit>");
		out.println("<center><table class='table table-bordered'>");
		//out.println("<tr><td>Faculty Id:</td><td><input type=text name=facultyid value="+ses.getValue("SFACULTYID").toString()+" readonly=true></td></tr>");
		//out.println("<tr><td></td><td><input type=hidden name=fid id=fid value="+ses.getValue("SFID").toString()+" readonly=true></td></tr>");
		out.println("<tr><td>Branch Id:</td><td><select  name=bid class='input-text required-entry'  id=bid></select></td></tr>");
		//int id=FacultySubjectDAO.getId();
		  out.println("<tr><td>Semester:</td><td><select class='input-text required-entry' name=sm id=sm><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
	    out.println("<tr><td>Student ID:</td><td><input type=text class='input-text required-entry' id=sid value="+sid+" name=sid readonly></td></tr>");
	    out.println("<tr><td>From Date:</td><td><input type=date class='input-text required-entry'  name=pd id=pd>&nbsp;&nbsp;&nbsp;&nbsp;To Date :<input type=date name=nd id=nd class='input-text required-entry'></td></tr>");
		
	    out.println("</table></center>");
		out.println("<br>");
	    out.println("<span id=result></span>");

	/*	if (rs.next())
		{
		out.println("<table border =1>");
		
		
		out.println("<tr><th>Semester</th><th>Subject</th><th>Date</th></tr>");
		do
		{out.println("<tr><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");
		}while(rs.next());
		out.println("</table>");
		}
		else 
		{out.println("<b><i>Record not found </i></b>");
		}
		out.println("</html>");
	 */   out.flush();
		}catch(Exception e){}

	}

}
