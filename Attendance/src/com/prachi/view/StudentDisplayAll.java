package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.prachi.dao.StudentDAO;

/**
 * Servlet implementation class StudentDisplayAll
 */
@WebServlet("/StudentDisplayAll")
public class StudentDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDisplayAll() {
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
		out.println("<head><style>.table{font-size:9.5px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		out.println("<a href=StudentInterface class='btn btn-info'>Add New Record</a>");
		ResultSet rs=StudentDAO.displayAllRecord();
		if (rs.next())
		{
		out.println("<table class='table table-bordered'>");
		out.println("<caption><b><i>list of Students </i></b></caption>");
		/*if (!rs.getString(4).equals("Male"))
				{ String var="D/O"+rs.getString(4);
				}
		else
		{
		String var="S/O"+rs.getString(4);
		}
		*/
		out.println("<tr><th>Student Rollno</th><th>Name</br>Father's Name</th><th>Gender / <BR> DOB</th><th>Address</th><th>Contact and Mobileno</th><th>student EmailID / <br> Father's EmailID</th><th>Branch / Semester / Year</th><th>Photograph</th><th>Update/Delete</th></tr>");
		do
		{
			if(!rs.getString(4).equals("Male"))
		
			{
				
			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+" D/O "+rs.getString(3)+"</th><th>"+rs.getString(4)+"/ <BR><BR>"+rs.getString(5)+"</td><td>"+rs.getString(6)+","+rs.getString(22)+"</br>"+rs.getString(21)+","+rs.getString(20)+"</td><td>"+rs.getString(10)+","+rs.getString(11)+"</td><td>"+rs.getString(12)+"<br><br>"+rs.getString(13)+"</td><td>"+rs.getString(19)+","+rs.getString(15)+","+rs.getString(16)+"</td><td><img src=pic/"+rs.getString(17)+" width=28 height=28></td><td><a href=StudentEditDelete?sid="+rs.getString(1)+" class='btn btn-warning'>Edit/Delete</a></tr>");
			}
		else
		{
			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+" S/O "+rs.getString(3)+"</th><th>"+rs.getString(4)+"/ </BR><BR>"+rs.getString(5)+"</td><td>"+rs.getString(6)+","+rs.getString(22)+"</br>"+rs.getString(21)+","+rs.getString(20)+"</td><td>"+rs.getString(10)+","+rs.getString(11)+"</td><td>"+rs.getString(12)+"<br><br>"+rs.getString(13)+"</td><td>"+rs.getString(19)+","+rs.getString(15)+","+rs.getString(16)+"</td><td><img src=pic/"+rs.getString(17)+" width=28 height=28></td><td><a href=StudentEditDelete?sid="+rs.getString(1)+" class='btn btn-warning'>Edit/Delete</a></tr>");
		}
			
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

