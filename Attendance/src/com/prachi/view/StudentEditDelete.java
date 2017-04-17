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
 * Servlet implementation class StudentEditDelete
 */
@WebServlet("/StudentEditDelete")
public class StudentEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{String sid=request.getParameter("sid");
		
		   ResultSet rs=StudentDAO.DisplayById(sid);
		     PrintWriter out=response.getWriter();
		
		     if(rs.next())
		     {
		      out.println("<html><form action=StudentFinalEditDelete method=post enctype=\"multipart/form-data\">");
		      out.println("<table><tr><td>");
		      
		      
			  out.println("<table>");
			  out.println("<caption><h2><i>Student Update/Delete</i></h2></caption>");
			  out.println("<tr><td><b><i>Student Enrollment no.:</i></b></td><td><input type=text name=sid size=40 value="+rs.getString(1)+"></td></tr>");
			  out.println("<tr><td><b><i>Name:</i></b></td><td><input type=text name=sn size=40 value=\""+rs.getString(2)+"\"></td></tr>");
			  out.println("<tr><td><b><i>Father Name:</i></b></td><td><input type=text name=sfn size=40 value=\""+rs.getString(3)+"\"></td></tr>");
			  
			  if(rs.getString(4).equals("Male"))
			  {
			  out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=sg value=Male Checked>Male<input type=radio name=sg value=Female>Female</td></tr>");
			  }
			  else
			  {
				  out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=sg value=Male>Male<input type=radio name=sg value=Female checked>Female</td></tr>");	  
			  }out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input type=text name=sbd size=40 value="+rs.getString(5)+"></td></tr>");
			  out.println("<tr><td><b><i>Address:</i></b></td><td><textarea name=sa rows=3 cols=30>"+rs.getString(6)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>Country:</i></b></td><td><textarea name=sc rows=3 cols=30>"+rs.getString(7)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>State:</i></b></td><td><textarea name=ss rows=3 cols=30>"+rs.getString(8)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>City:</i></b></td><td><textarea name=sci rows=3 cols=30>"+rs.getString(9)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>Contact No:</i></b></td><td><input type=text name=scno size=40 value="+rs.getString(10)+"></td></tr>");
			  out.println("<tr><td><b><i>Mobile No:</i></b></td><td><input type=text name=smob size=40 value="+rs.getString(11)+"></td></tr>");
			  out.println("<tr><td><b><i> Student's Email Id:</i></b></td><td><input type=text name=sem size=40 value="+rs.getString(12)+"></td></tr>");
			  out.println("<tr><td><b><i> Father's Email Id:</i></b></td><td><input type=text name=fem size=40 value="+rs.getString(13)+"></td></tr>");
			  out.println("<tr><td><b><i>Branch:</i></b></td><td><input type=text name=sb size=40 value="+rs.getString(14)+"></td></tr>");
			  out.println("<tr><td><b><i>Semester:</i></b></td><td><input type=text name=sm size=40 value="+rs.getString(15)+"></td></tr>");
			  out.println("<tr><td><b><i>Year:</i></b></td><td><input type=text name=sy size=40 value="+rs.getString(16)+"></td></tr>");
			 // out.println("<tr><td><b><i>Designation:</i></b></td><td><select name=fd><option>"+rs.getString(8)+"</option><option value=HOD>HOD</option><option value=<Proffessor>Proffessor</option><option value=<Asst.Proffesor>Asst. Proffesor</option></select></td></tr>");
			  out.println("</table></td>");
			  out.print("<td><img src=pic/"+rs.getString(17)+" width=200 height=200><br><br><input type=file name=sp></td></tr></table><br><br>");
			  out.println("<input type=submit value=Update name=btn><input type=submit value=Delete name=btn></form></html>");
					  
					  
			   
		     }
			  out.flush();
		   }catch(Exception e)
		   {}	
		}

}
