package com.prachi.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.SubjectDAO;
import com.prachi.model.Subject;

/**
 * Servlet implementation class SubjectFinalEditDelete
 */
@WebServlet("/SubjectFinalEditDelete")
public class SubjectFinalEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectFinalEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String btn=request.getParameter("btn");
		  if(btn.equals("Update"))
		  { Subject  SB=new Subject();  
		  SB.setSubjectID(request.getParameter("sbid"));
		  SB.setBranchID(request.getParameter("bid"));
		  SB.setSubjectName(request.getParameter("sbn")); 
		  SB.setSemester(request.getParameter("sm"));
		  SB.setStatus(request.getParameter("ss"));
		  boolean st=SubjectDAO.EditRecord(SB);
		  
	  }
	  else if(btn.equals("Delete"))
	  { String sbid=request.getParameter("sbid");
	  boolean st=SubjectDAO.DeleteById(sbid);
	   }
	  response.sendRedirect("SubjectDisplayAll");
	

}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}


