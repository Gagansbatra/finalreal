package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.SubjectDAO;

/**
 * Servlet implementation class SubjectEditDelete
 */
@WebServlet("/SubjectEditDelete")
public class SubjectEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{String sbid=request.getParameter("sbid");
		   ResultSet rs=SubjectDAO.DisplayById(sbid);
		     PrintWriter out=response.getWriter();
		     if(rs.next())
		     {out.println("<head><style>.table{font-size:9.5px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		      out.println("<html><form action=SubjectFinalEditDelete>");
		      out.println("<table class='table table-bordered'>");
		     out.println("<caption><h2><i>Subject Update/Delete</i></h2></caption>");
		     out.println("<tr><td><b><i>Subject Id:</i></b></td><td><input class='input-text required-entry' type=text name=sbid size=40 value="+rs.getString(1)+"></td></tr>");
			  out.println("<tr><td><b><i> Branch ID:</i></b></td><td><input class='input-text required-entry' type=text name=bid size=40 value="+rs.getString(2)+"></td></tr>");
			  out.println("<tr><td><b><i> Subject Name:</i></b></td><td><input class='input-text required-entry' type=text name=sbn size=40 value="+rs.getString(3)+"></td></tr>");
			  out.println("<tr><td><b><i> Semester:</i></b></td><td><input type=text class='input-text required-entry' name=sm size=40 value="+rs.getString(4)+"></td></tr>");
			  
			  out.println("<tr><td><b><i> Status:</i></b></td><td><input class='input-text required-entry' type=text name=ss size=40 value="+rs.getString(5)+"></td></tr>");
			  out.println("<input type=submit value=Update class='btn btn-success' name=btn><input type=submit class='btn btn-danger' value=Delete name=btn></form></html>");

			  out.println("</table></form></html>");
			  }out.flush();
	   }catch(Exception e)
	   {}	
		}
	}


