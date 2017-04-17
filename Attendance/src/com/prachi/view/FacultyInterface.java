package com.prachi.view;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyInterface
 */
@WebServlet("/FacultyInterface")
public class FacultyInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		 out.println("<script src=asset/jquery.validate.min.js></script>");
		 out.println("<script src=validate.js></script>");
		out.println("<script src=fs.js></script>");
		out.println("<script src=faculty.js></script>");
		//out.println("<script src=validate.js></script>");
		  out.println("<script src=fill.js></script>");
		  out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		  out.println("<html>");
		  out.println("<a href=FacultyDisplayAll class='button create-account'>List of Faculties</a>");
		  out.println("<form id=myform action=FacultySubmit method=post enctype=\"multipart/form-data\">");
		  out.println("<center><table class='table table-bordered'>");
		  out.println("<caption><h2><i>Faculty Registration</i></h2></caption>");
		  out.println("<tr><td><b><i>Faculty Id:</i></b></td><td><input type=text name=fid required='required' size=40></td></tr>");
		  out.println("<tr><td><b><i>Faculty Name:</i></b></td><td><input type=text name=fn size=40></td></tr>");
		  out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input type=DATE name=fbd required='required' size=40></td></tr>");
		  out.println("<tr><td><b><i>Faculty Gender:</i></b></td><td><input type=radio name=fg  value=Male>Male<input type=radio name=fg value=Female>Female </td> </tr>");
		  out.println("<tr><td><b><i>Address:</i></b></td><td><textarea name=fa required='required' rows=3 cols=30></textarea></td></tr>");
		  out.println("<tr><td><b><i>Country:</i></b></td><td><select name='cnt'   id='cnt' >    </select>  </br> </td> </tr>");
		  out.println("<tr><td><b><i>State:</i></b></td><td><select name='st'  id='st' > </select></br></td></tr>");
		  out.println("<tr><td><b><i>City:</i></b></td><td><select name='ct' id='ct' >  <option value=''>-Select-</option></select></br></td></tr>"); 
		 // out.println("<tr><td><b><i>Address:</i></b></td><td><textarea name=ea rows=3 cols=30></textarea></td></tr>");
		  out.println("<tr><td><b><i>Contact No:</i></b></td><td><input type=text name=fc required='required' size=40></td></tr>"); 
		  out.println("<tr><td><b><i>Email Id:</i></b></td><td><input type=email name=fm required='required' size=40></td></tr>");
		  out.println("<tr><td><b><i>Branch :</i></b></td><td><select name='bid'  id='bid' > required='required' </select></br></td></tr>");
		  out.println("<tr><td><b><i>Designation:</i></b></td><td><select name =fd> required='required' <option value=HOD>HOD</option><option value=Proffessor>Proffessor</option><option value=Asst.Proffesor>Asst. Proffesor</option></select></td></tr>");
		  out.println("<tr><td><b><i>Photograph:</i></b></td><td><input type=file name=fp required='required' size=40></td></tr>");
		  out.println("<tr><td><b><i>Password:</i></b></td><td><input type=password name=fpass required='required' size=40></td></tr>");
		  out.println("<tr><td><input type=submit class='btn btn-success'></td><td><input  class='btn btn-info' type=reset></td></tr>");
		  out.println("</table></form></html>");
		  out.flush();
		  }}


