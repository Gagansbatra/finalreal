package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.prachi.dao.FacultyDAO;
/**
 * Servlet implementation class FacultyDisplayAll
 */
@WebServlet("/FacultyDisplayAll")
public class FacultyDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyDisplayAll() {
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
			out.println("<head><style>.table{font-size:11px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		out.println("<body><a href=FacultyInterface class='btn btn-success'>Add New Record</a>");
		ResultSet rs=FacultyDAO.displayAllRecord();
		if (rs.next())
		{
			
		out.println("<center><table class='table table-bordered'>");
		out.println("<caption><b><i>list of Faculties </i></b></caption>");
		out.println("<tr><th>Faculty ID/<br>Name</th><th>DOB/Gender</th><th>Address</th><th>Contact</th><th>Email</th><th>Branch</th><th>Designation</th><th>Photograph</th><th>Update/Delete</tr>");
		do
		{out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"<br>"+rs.getString(4)+"</td><td>"+rs.getString(11)+","+rs.getString(18)+"</br>"+rs.getString(17)+","+rs.getString(16)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(15)+"</td><td>"+rs.getString(8)+"</td><td><img src=pic/"+rs.getString(9)+" width=40 height=40></td><td><a href=FacultyEditDelete?fid="+rs.getString(1)+" class='btn btn-info'>Edit/Delete</a></tr>");
			}
		while(rs.next());
		out.println("</table></body></center>");
		}
		else 
		{out.println("<b><i>Record not found </i></b>");
		}
		out.println("</html>");
	    out.flush();
		}catch(Exception e){}
		}
	}

