package com.prachi.view;

import java.io.IOException;
import java.lang.*;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prachi.dao.AdminDAO;

/**
 * Servlet implementation class AdminCheckPwd
 */
@WebServlet("/AdminCheckPwd")
public class AdminCheckPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCheckPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		boolean st=AdminDAO.CheckPassword(request.getParameter("aid"), request.getParameter("pwd"));
    if(st)
    { HttpSession ses=request.getSession();
    ses.putValue("SAID",request.getParameter("aid"));
    ses.putValue("LDATE", new java.util.Date());
    
    	
    	response.sendRedirect("AdminHome");
    }
    else
    {
	out.println("<html><font color=red size=5>Invalid UserID/Password</font> </html><br><br><a href=AdminLogin>Click Here To Try Login Again  </a>");
	/* try {
		
		 out.println("<html><font color=red size=5>Invalid UserID/Password</font> </html>").sleep(10000);
 	}
 	catch(InterruptedException e)
 	{
 		System.out.println(e);
 	}
     */
   //  response.sendRedirect("AdminReLogin");
    	//response.sendRedirect("AdminLogin");
    	
    }
    
	
	out.flush();
	
	}

}

 

