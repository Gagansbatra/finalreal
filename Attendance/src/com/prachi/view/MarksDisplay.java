package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.MarksDAO;

/**
 * Servlet implementation class MarksDisplay
 */
@WebServlet("/MarksDisplay")
public class MarksDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarksDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String sid=request.getParameter("sid");
		String bid=request.getParameter("bid");
		String sm=request.getParameter("sm");

		PrintWriter out=response.getWriter();
		/* try{
			 out.println("<tr valign=top><td><a href=AdminLogin target=mw>Admin Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=FacultyLogin target=mw>Faculty Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=StudentLogin target=mw>Student Login </a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"AboutUs.jsp\" target=mw>About Us</a><br><br><td>");
		
			 }catch(Exception e)
			 {
			 }	*/
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
	
		try {
			out.println("<html>");
		out.println("<a href=marksdetails>Add New Record</a>");
		ResultSet rs=MarksDAO.displayAllRecord(sid);
		out.println("<input type=readonly name=sid   value="+sid+" size=10 readonly=true >");
		if (rs.next())
		{
		out.println("<table border =1>");
		out.println("<caption><b><i>Marks Register </i></b></caption>");
		int i=1;
		out.println("<tr><th>subject Code  </th><th>Subject Name</th><th>Midterm1</th><th>Midterm2</th><th>Assignment1</th><th>Assignment2</th><th>quiz1</th><th>quiz2</th><th>Lab Quiz</th><th>Class Attendance </th> <th>Lab Attendance </th><th>Internal Viva </th> <th>Lab Performance </th><th>Total </th>");
		 out.println("</tr>");
		 
		do
		 {
			String sbid=rs.getString(15);
			String sbn=rs.getString(2);
			System.out.println("hi me");
			out.println("<tr><td><input type=readonly name=sbid value="+sbid+"  readonly=true size=10></td><td><input type=text name=sbn readonly value="+sbn+"  size=10><br></td>");
		out.println("<td><input type=text name=md1  id=\"md1"+i+"\"  value="+rs.getString(3)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=md2 id=\"md2"+i+"\"   value="+rs.getString(4)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=ass1    id=\"ass1"+i+"\" value="+rs.getString(5)+" size=10 readonly=true ></td>");	
		 out.println("<td><input type=text name=ass2    id=\"ass2"+i+"\" value="+rs.getString(6)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=q1    id=\"q1"+i+"\" value="+rs.getString(7)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=q2    id=\"q2"+i+"\" value="+rs.getString(8)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=lq    id=\"lq"+i+"\" value="+rs.getString(9)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=ca  id=\"ca"+i+"\"  value="+rs.getString(10)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=la   id=\"la"+i+"\"  value="+rs.getString(11)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=iv    id=\"iv"+i+"\" value="+rs.getString(12)+" size=10 readonly=true ></td>");
		 out.println("<td><input type=text name=lp   id=\"lp"+i+"\" value="+rs.getString(13)+" size=10 readonly=true ></td>");
		 int tt=Integer.parseInt(rs.getString(3))+Integer.parseInt(rs.getString(4))+Integer.parseInt(rs.getString(5))+Integer.parseInt(rs.getString(6))+Integer.parseInt(rs.getString(7))+Integer.parseInt(rs.getString(8))+Integer.parseInt(rs.getString(9))+Integer.parseInt(rs.getString(10))+Integer.parseInt(rs.getString(11))+Integer.parseInt(rs.getString(12))+Integer.parseInt(rs.getString(13));
		out.println("<td><input type=text id=\"total"+i+"\"   value="+tt+" size=10 readonly=true ></td>");
		 out.println("</tr>");
		 	i++;
		 }
		while(rs.next());
		
		out.println("</table><a href=UpdateMarks?sid="+sid+"&bid="+bid+"&sm="+sm+"    >Update Marks</a>");
		}
		else 
		{out.println("<b><i>Record not found </i></b>");
		}
		out.println("</form></html>");
		out.flush();
		}catch(Exception e){}
		}
		/* if (rs.next())
		{
			
		out.println("<table border =1>");
		out.println("<caption><b><i>list of Faculties </i></b></caption>");
		out.println("<tr><th>Faculty ID/<br>Name</th><th>DOB/Gender</th><th>Address</th><th>Contact</th><th>Email</th><th>Branch</th><th>Designation</th><th>Photograph</th><th>Update/Delete</tr>");
		do
		{out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"<br>"+rs.getString(4)+"</td><td>"+rs.getString(11)+","+rs.getString(14)+"</br>"+rs.getString(13)+","+rs.getString(12)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td><img src=pic/"+rs.getString(9)+" width=40 height=40></td><td><a href=FacultyEditDelete?fid="+rs.getString(1)+">Edit/Delete</a></tr>");
			}
		while(rs.next());
		out.println("</table>");
		}
		else 
		{out.println("<b><i>Record not found </i></b>");
		}
		out.println("</html>");
	    out.flush();
		}catch(Exception e){}
		}

	} */

}
