package com.prachi.view;

import java.io.IOException
;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.StudentDAO;
import com.prachi.dao.SubjectDAO;

/**
 * Servlet implementation class SubjectDisplayAll
 */
@WebServlet("/SubjectDisplayAll")
public class SubjectDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectDisplayAll() {
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
		try {
			out.println("<html>");
			out.println("<head><style>.table{font-size:12px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		out.println("<a href=SubjectInterface class='btn btn-danger'>Add New Record</a>");
		ResultSet rs=SubjectDAO.displayAllRecord();
		if (rs.next())
		{
		out.println("<table class='table table-bordered'>");
		
		out.println("<caption<<b><i>list of Subjects </i></b></caption>");
		out.println("<tr><th>Subject ID</th><th>Branch ID</th><th>subject Name</th><th>Semester</th><th>Status</th><th>Update/Delete</th></tr>");
		do
		{out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td><a href=SubjectEditDelete?sbid="+rs.getString(1)+" class='btn btn-info'>Edit/Delete</a></tr>");
		}while(rs.next());
		out.println("</table>");
		}
		else 
		{out.println("<b><i>Record not found </i></b>");
		}
		out.println("</html>");
	    out.flush();
		}catch(Exception e){}
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
}
}
