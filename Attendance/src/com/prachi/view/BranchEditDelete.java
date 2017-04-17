package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.BranchDAO;

/**
 * Servlet implementation class BranchEditDelete
 */
@WebServlet("/BranchEditDelete")
public class BranchEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{String bid=request.getParameter("bid");
		   ResultSet rs=BranchDAO.DisplayById(bid);
		     PrintWriter out=response.getWriter();
		     
		     if(rs.next())
		     {
		      out.println("<html>");
		      //out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		      out.println("<form action=BranchFinalEditDelete>");
		      out.println("<table class='table table-bordered'>");
		     out.println("<caption><h2><i>Branch Update/Delete</i></h2></caption>");
		     out.println("<tr><td><b><i>Branch Id:</i></b></td><td><input class='input-text required-entry' type=text name=bid size=40 value="+rs.getString(1)+"></td></tr>");
			  out.println("<tr><td><b><i> Branch Name:</i></b></td><td><input class='input-text required-entry' type=text name=bn size=40 value="+rs.getString(2)+"></td></tr>");
			   out.println("</table></form></html>");
			   out.println("<input type=submit value=Update class='btn btn-success' name=btn>&nbsp;&nbsp;&nbsp;&nbsp;<input type=submit class='btn btn-info' value=Delete class='btn btn-success' name=btn></form></html>");
			  }out.flush();
	   }catch(Exception e)
	   {}	}

}
