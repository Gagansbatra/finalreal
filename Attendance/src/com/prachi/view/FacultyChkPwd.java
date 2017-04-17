package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prachi.dao.FacultyDAO;
import com.prachi.model.Faculty;

/**
 * Servlet implementation class FacultyChkPwd
 */
@WebServlet("/FacultyChkPwd")
public class FacultyChkPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyChkPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Faculty F=FacultyDAO.CheckPassword(request.getParameter("fid"), request.getParameter("fpass"));
    if(F!=null)
    { HttpSession ses=request.getSession();
    ses.putValue("SFID",request.getParameter("fid"));
    ses.putValue("LDATE", new java.util.Date());
    ses.putValue("SFN", F.getFacultyName());
    ses.putValue("SFPIC", F.getFacultyPhotograph());
    	
    	response.sendRedirect("FacultyHome");
    }
    else
    {
     out.println("<html><font color=red size=5>Invalid UserID/Password</font> </html><br><br><a href=FacultyLogin>Click Here To Try Login Again  </a>");
     
    	
    }
	out.flush();

}
	}


