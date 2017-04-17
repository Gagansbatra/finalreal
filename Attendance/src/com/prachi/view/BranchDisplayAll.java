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
 * Servlet implementation class BranchDisplayAll
 */
@WebServlet("/BranchDisplayAll")
public class BranchDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchDisplayAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		

		try {
			out.println("<html>");
			out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		out.println("<a href=BranchInterface class='btn btn-primary'>Add New Record</a>");
		ResultSet rs=BranchDAO.displayAllRecord();
		if (rs.next())
		{
		out.println("<table class='table table-bordered'>");
		out.println("<caption><b><i>list of Branches </i></b></caption>");
		out.println("<tr><th>Branch ID </th><th> Branch Name</th><th>Update/Delete</th></tr>");
		do
		{out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td><a href=BranchEditDelete?bid="+rs.getString(1)+" class='btn btn-warning'>Edit/Delete</a></tr>");
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

}
