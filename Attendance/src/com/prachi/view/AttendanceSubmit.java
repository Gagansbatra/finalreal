package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.AttendanceDAO;
import com.prachi.model.Attendance;

/**
 * Servlet implementation class AttendanceSubmit
 */
@WebServlet("/AttendanceSubmit")
public class AttendanceSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendanceSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	PrintWriter out=response.getWriter();
	Attendance A=new Attendance();
	A.setFacultyid(request.getParameter("fid"));
	A.setEnrollmentno(request.getParameter("sid"));
    A.setBranchid(request.getParameter("bid"));
    A.setSemester(request.getParameter("sm"));
    A.setSubject(request.getParameter("sbid"));
    A.setCurrentdate(request.getParameter("cd"));
    	
	boolean st=AttendanceDAO.AddNewRecord(A);
	/* out.println("<html>");
	if(st)
	{
		out.println("<h3><font color=green>ATTENDANCE SUBMITTED...<br><a href=AttendanceInterface>Click Here To Add More Attendance...</a></font></h3>");
	}
	else
	{
		out.println("<h3><font color=red>FAILED TO SUBMIT ATTENDANCE...<br><a href=AttendanceInterface>Click Here To Add More Attendance...</a></font></h3>");
	}
out.println("</html>"); */
out.flush();}

}


