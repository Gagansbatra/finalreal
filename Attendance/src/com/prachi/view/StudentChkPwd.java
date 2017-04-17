package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.prachi.dao.StudentDAO;
import com.prachi.model.Student;

/**
 * Servlet implementation class StudentChkPwd
 */
@WebServlet("/StudentChkPwd")
public class StudentChkPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentChkPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Student S=StudentDAO.CheckPassword(request.getParameter("sid"), request.getParameter("spass"));
    if(S!=null)
    { HttpSession ses=request.getSession();
    ses.putValue("SID",request.getParameter("sid"));
    ses.putValue("LDATE", new java.util.Date());
    ses.putValue("SN", S.getName());
    ses.putValue("SPIC", S.getPhotograph());
    	
    	response.sendRedirect("StudentHome");
    }
    else
    {
     out.println("<html><font color=red size=5>Invalid UserID/Password</font> </html> <br><br><a href=StudentLogin>Click Here To Try Login Again  </a>");
     
    	
    }
	out.flush();

}}


