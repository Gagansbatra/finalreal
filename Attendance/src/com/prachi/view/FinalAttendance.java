package com.prachi.view;

import java.io.IOException
;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.AttendanceDAO;
//import com.prachi.dao.StudentDAO;
import com.prachi.model.Attendance;

/**
 * Servlet implementation class FinalAttendance
 */
@WebServlet("/FinalAttendance")
public class FinalAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		Attendance A=new Attendance();
		try{
    A.setFacultyid(request.getParameter("fid"));
   
	A.setEnrollmentno(request.getParameter("sid"));
	A.setBranchid(request.getParameter("bid"));
	A.setSemester(request.getParameter("sm"));
	A.setSubject(request.getParameter("sbid"));
	A.setCurrentdate(request.getParameter("cd"));
		boolean st=AttendanceDAO.AddNewRecord(A);
	//	response.sendRedirect("AttendanceInterface");	 
	  out.print("Final");
		out.flush();
	}catch(Exception e)
	 {
	System.out.println(e);	 
		 
	 }
	}
}


