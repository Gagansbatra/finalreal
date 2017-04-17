package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.AttendanceDAO;
import com.prachi.dao.DBHelper;
import com.prachi.dao.MarksDAO;

/**
 * Servlet implementation class EnterMarks
 */
@WebServlet("/EnterMarks")
public class EnterMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterMarks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String sid=request.getParameter("sid");
String bid=request.getParameter("bid");
String sm=request.getParameter("sm");
//int stu=Integer.parseInt(sid);
PrintWriter out=response.getWriter();

out.println("<script src=asset/jquery-2.2.1.min.js></script>");

try {
	System.out.println("hi");
	int c=0;
	ResultSet rs1=MarksDAO.DisplayAllRecordAttendence();
	System.out.println("hi.....");
	if(rs1.next())
	{
	
	
	do{
		
		
		if(sid.equals(rs1.getString(1)))
		{System.out.println("hello...");
			c++;
		}
		}while(rs1.next());
		
	}

	if(c>0)
	{
		out.println("<b><i>Record Inserted Already .... </i></b>");
		out.println("<body><a href=marksdetails class='btn btn-success'>Add new Record</a>");
	}

	else
	{
		rs1.close();
		
		out.println("<html>");
	out.println("<head><style>.table{font-size:9.5px;}</style><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
	out.println("<form id =myform action=EnterMarksSubmit >");

	out.println("<input type=hidden name=sid   value="+sid+" size=10>");

ResultSet rs=AttendanceDAO.DisplayMarksheet(bid, sm);
if (rs.next())
{
out.println("<table class='table table-bordered'>");
out.println("<caption><b><i>Marks Register </i></b></caption>");
int i=1;
out.println("<tr><th>subject Code  </th><th>Subject Name</th><th>Midterm1</th><th>Midterm2</th><th>Assignment1</th><th>Assignment2</th><th>quiz1</th><th>quiz2</th><th>Lab Quiz</th><th>Class Attendance </th> <th>Lab Attendance </th><th>Internal Viva </th> <th>Lab Performance </th>");
 out.println("</tr>");
 
do
 {
	String sbid=rs.getString(1);
	String sbn=rs.getString(3);
	System.out.println("hi me");
	out.println("<tr><td><input type=text name=sbid value="+sbid+"  readonly size=10></td><td><input type=text name=sbn readonly value="+sbn+"  size=10><br></td>");
out.println("<td><input type=text name=md1  id=\"md1"+i+"\" required='required' value=0 size=10></td>");
 out.println("<td><input type=text name=md2 required='required' id=\"md2"+i+"\"   value=0 size=10></td>");
 out.println("<td><input type=text name=ass1 required='required'   id=\"ass1"+i+"\" value=0 size=10></td>");	
 out.println("<td><input type=text name=ass2 required='required'   id=\"ass2"+i+"\" value=0 size=10></td>");
 out.println("<td><input type=text name=q1 required='required'   id=\"q1"+i+"\" value=0 size=10></td>");
 out.println("<td><input type=text name=q2 required='required'   id=\"q2"+i+"\" value=0 size=10></td>");
 out.println("<td><input type=text name=lq required='required'   id=\"lq"+i+"\" value=0 size=10></td>");
 out.println("<td><input type=text name=ca required='required'  id=\"ca"+i+"\"  value=0 size=10></td>");
 out.println("<td><input type=text name=la required='required'  id=\"la"+i+"\"  value=0 size=10></td>");
 out.println("<td><input type=text name=iv required='required'   id=\"iv"+i+"\" value=0 size=10></td>");
 out.println("<td><input type=text name=lp required='required'   id=\"lp"+i+"\" value=0 size=10></td>");
 out.println("</tr>");
 	i++;
 }
while(rs.next());
out.println("<tr><td><input type=submit class='btn btn-success'></td><td><input class='btn btn-danger' type=reset></td></tr>");

out.println("</table>");
}
else 
{out.println("<b><i>Record not found </i></b>");
}
out.println("</form></html>");
	}out.flush();
}catch(Exception e){}
}
	
}
