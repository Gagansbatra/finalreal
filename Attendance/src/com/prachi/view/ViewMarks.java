package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prachi.dao.MarksDAO;

/**
 * Servlet implementation class ViewMarks
 */
@WebServlet("/ViewMarks")
public class ViewMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMarks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession ses=request.getSession();
		
		String sid=ses.getValue("SID").toString();
		PrintWriter out=response.getWriter();
		
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		out.println("<head><link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'></head>");
		try {
			out.println("<html>");
		
		ResultSet rs=MarksDAO.displayAllRecord(sid);
		out.println("<input class='input-text required-entry' type=readonly name=sid   value="+sid+" >");
		if (rs.next())
		{
		out.println("<center><table class='table table-bordered'>");
		out.println("<caption><b><i>Marks Register </i></b></caption>");
		int i=1;
		out.println("<tr><th>subject Code  </th><th>Subject Name</th><th>Midterm1</th><th>Midterm2</th><th>Assignment1</th><th>Assignment2</th><th>quiz1</th><th>quiz2</th><th>Lab Quiz</th><th>Class Attendance </th> <th>Lab Attendance </th><th>Internal Viva </th> <th>Lab Performance </th><th>Total </th>");
		 out.println("</tr>");
		 
		do
		 {
			String sbid=rs.getString(15);
			String sbn=rs.getString(2);
			System.out.println("hi me");
			out.println("<tr><td><input class='input-text required-entry' type=readonly name=sbid value="+sbid+"  readonly=true size=10></td><td><input type=text name=sbn readonly value="+sbn+"  size=10><br></td>");
		out.println("<td><input class='input-text required-entry' type=text name=md1  id=\"md1"+i+"\"  value="+rs.getString(3)+" size=10 readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=md2 id=\"md2"+i+"\"   value="+rs.getString(4)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=ass1    id=\"ass1"+i+"\" value="+rs.getString(5)+"  readonly=true ></td>");	
		 out.println("<td><input class='input-text required-entry' type=text name=ass2    id=\"ass2"+i+"\" value="+rs.getString(6)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=q1    id=\"q1"+i+"\" value="+rs.getString(7)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=q2    id=\"q2"+i+"\" value="+rs.getString(8)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=lq    id=\"lq"+i+"\" value="+rs.getString(9)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=ca  id=\"ca"+i+"\"  value="+rs.getString(10)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=la   id=\"la"+i+"\"  value="+rs.getString(11)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=iv    id=\"iv"+i+"\" value="+rs.getString(12)+"  readonly=true ></td>");
		 out.println("<td><input class='input-text required-entry' type=text name=lp   id=\"lp"+i+"\" value="+rs.getString(13)+"  readonly=true ></td>");
		 int tt=Integer.parseInt(rs.getString(3))+Integer.parseInt(rs.getString(4))+Integer.parseInt(rs.getString(5))+Integer.parseInt(rs.getString(6))+Integer.parseInt(rs.getString(7))+Integer.parseInt(rs.getString(8))+Integer.parseInt(rs.getString(9))+Integer.parseInt(rs.getString(10))+Integer.parseInt(rs.getString(11))+Integer.parseInt(rs.getString(12))+Integer.parseInt(rs.getString(13));
		out.println("<td><input type=text id=\"total"+i+"\"   value="+tt+" size=10 readonly=true ></td>");
		 out.println("</tr>");
		 	i++;
		 }
		while(rs.next());
		
		out.println("</table></center>");
		}
		else 
		{out.println("<b><i>Record not found </i></b>");
		}
		out.println("</form></html>");
		out.flush();
		}catch(Exception e){}
		}
	
	}


