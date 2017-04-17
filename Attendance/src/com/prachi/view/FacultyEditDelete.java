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
 * Servlet implementation class FacultyEditDelete
 */
@WebServlet("/FacultyEditDelete")
public class FacultyEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 PrintWriter out=response.getWriter();
		

		try{String fid=request.getParameter("fid");
		   ResultSet rs=FacultyDAO.DisplayById(fid);
		    
		     if(rs.next())
		     {out.println("<head><style>.table{font-size:11px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		      out.println("<html><form action=FacultyFinalEditDelete  method=post enctype=\"multipart/form-data\">");
		      out.println("<table><tr><td>");
			  out.println("<table class='table table-bordered'>");
			  out.println("<caption><h2><i>Faculty Update/Delete</i></h2></caption>");
			  out.println("<tr><td><b><i>Faculty Id:</i></b></td><td><input class='input-text required-entry' size=50 type=text name=fid  value="+rs.getString(1)+"></td></tr>");
			  out.println("<tr><td><b><i>Name:</i></b></td><td><input class='input-text required-entry' size=50 type=text name=fn  value=\""+rs.getString(2)+"\"></td></tr>");
			  out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input class='input-text required-entry' size=50 type=text name=fbd  value="+rs.getString(3)+"></td></tr>");
			  if(rs.getString(4).equals("Male"))
			  {
			  out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=fg value=Male Checked>Male<input type=radio name=fg value=Female>Female</td></tr>");
			  }
			  else
			  {
				  out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=fg value=Male>Male<input type=radio name=fg value=Female checked>Female</td></tr>");	  
			  }
			  //out.println("<tr><td><b><i>Address:</i></b></td><td><textarea name=ea rows=3 cols=30>"+rs.getString(5)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>Address:</i></b></td><td><textarea class='input-text required-entry' size=50 name=fa rows=3 cols=30>"+rs.getString(11)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>Country:</i></b></td><td><textarea class='input-text required-entry' size=50 name=fc rows=3 cols=30>"+rs.getString(12)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>State:</i></b></td><td><textarea class='input-text required-entry' size=50 name=fs rows=3 cols=30>"+rs.getString(13)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>City:</i></b></td><td><textarea  class='input-text required-entry' size=50 name=fci rows=3 cols=30>"+rs.getString(14)+"</textarea></td></tr>");
			  out.println("<tr><td><b><i>Contact No:</i></b></td><td><input  class='input-text required-entry' size=50 type=text name=fc  value="+rs.getString(5)+"></td></tr>");
			  out.println("<tr><td><b><i>Email Id:</i></b></td><td><input class='input-text required-entry' size=50 type=text name=fm  value="+rs.getString(6)+"></td></tr>");
			  out.println("<tr><td><b><i>Branch:</i></b></td><td><input class='input-text required-entry' size=50 type=text name=bid  value="+rs.getString(7)+"></td></tr>");
			  out.println("<tr><td><b><i>Designation:</i></b></td><td><select class='input-text required-entry'  name=fd><option>"+rs.getString(8)+"</option><option value=HOD>HOD</option><option value=<Proffessor>Proffessor</option><option value=<Asst.Proffesor>Asst. Proffesor</option></select></td></tr>");
			  out.println("</table></td>");
			  out.print("<td><img src=pic/"+rs.getString(9)+" width=100 height=100 style='vealign:top;' valign=top><br><br><input class='input-text required-entry' type=file name=fp></td></tr></table><br>");
			  out.println("<input type=submit value=Update name=btn class='btn btn-success'>&nbsp;&nbsp;<input type=submit class='btn btn-info' value=Delete name=btn></form></html>");
					  
					  
			   
		     }
			  out.flush();
		   }catch(Exception e)
		   {}	}
}

