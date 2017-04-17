package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentInterface
 */
@WebServlet("/StudentInterface")
public class StudentInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInterface() {
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
		 out.println("<script src=student.js></script>");
		  out.println("<script src=fs.js></script>");
		  out.println("<script src=fill.js></script>");
		  
		  out.println("<html>");
		  out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		  out.println("<body style='background-image:url(star.png);'><a href=StudentDisplayAll class='button create-account'>List of Students</a>");
		  out.println("<form id=myform action=StudentSubmit method=post enctype=\"multipart/form-data\">");
		  out.println("<center><table class='table table-bordered'>");
		  out.println("<caption><h2><i>Student Registration</i></h2></caption>");
		  out.println("<tr><td><b><i>Student enrollment no:</i></b></td><td><input type=text name=sid required='required' size=40></td></tr>");
		  out.println("<tr><td><b><i> Name:</i></b></td><td><input type=text name=sn  size=40></td></tr>");
		  out.println("<tr><td><b><i>Father Name:</i></b></td><td><input type=text name=sfn  size=40></td></tr>");
		  out.println("<tr><td><b><i> Gender:</i></b></td><td><input type=radio name=sg value=Male>Male<input type=radio name=sg value=Female>Female  </td></tr>");
		  out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input type=Date name=sbd required='required' size=40></td></tr>");
		  out.println("<tr><td><b><i>Address:</i></b></td><td><textarea name=sa required='required' rows=3 cols=30></textarea>  </td></tr>");
		  out.println("<tr><td><b><i>Country:</i></b></td><td><select name='cnt'   id='cnt' > </select></br></td></tr>");
		  out.println("<tr><td><b><i>State:</i></b></td><td><select name='st'  id='st' ></select></br></td></tr>");
		  out.println("<tr><td><b><i>City:</i></b></td><td><select name='ct' id='ct' ><option value=''>-Select-</option></select></br></td></tr>");
		  
		  out.println("<tr><td><b><i>Contact No:</i></b></td><td><input type=text name=scno size=40></td></tr>"); 
		  out.println("<tr><td><b><i>Mobile No:</i></b></td><td><input type=text name=smob size=40></td></tr>"); 
          out.println("<tr><td><b><i> Student's Email Id:</i></b></td><td><input type=email name=sem required='required' size=40></td></tr>");
          out.println("<tr><td><b><i> Father's Email Id:</i></b></td><td><input type=email name=fem required='required'  size=40></td></tr>");
          out.println("<tr><td><b><i>Branch :</i></b></td><td><select name='bid'  id='bid' ><option value=''>Select </option></select></br></td></tr>");
		  out.println("<tr><td><b><i>Semester:</i></b></td><td><select name=sm><option value=''>-Select-</option><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option><option value=\"5th\">5th</option><option value=\"6th\">6th</option><option value=\"7th\">7th</option><option value=\"8th\">8th</option></select></td></tr>");
		  out.println("<tr><td><b><i>year:</i></b></td><td><select name=yr><option value=''>-Select-</option><option value=\"1st\">1st</option><option value=\"2nd\">2nd</option><option value=\"3rd\">3rd</option><option value=\"4th\">4th</option></select></td></tr>");
		  
		  //out.println("<tr><td><b><i>Designation:</i></b></td><td><select name =d><option value=HOD>HOD</option><option value=<Proffessor>Proffessor</option><option value=<Asst.Proffesor>Asst. Proffesor</option></select></td></tr>");
		  out.println("<tr><td><b><i>Photograph:</i></b></td><td><input type=file name=sp required='required'  size=40></td></tr>");
		  out.println("<tr><td><b><i>Password:</i></b></td><td><input type=password name=spass required='required' size=40></td></tr>");
		  out.println("<tr><td><input type=submit class='btn btn-success'></td><td><input class='btn btn-warning' type=reset></td></tr>");
		  out.println("</table></center></form></body></html>");
		  out.flush();
		  }

}
