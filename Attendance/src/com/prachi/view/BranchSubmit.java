package com.prachi.view;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.BranchDAO;
import com.prachi.model.Branch;


/**
 * Servlet implementation class BranchSubmit
 */
@WebServlet("/BranchSubmit")
public class BranchSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=response.getWriter();
		Branch B=new Branch();  
		
		B.setBranchID(request.getParameter("bid"));
		B.setBranchName(request.getParameter("bn"));
		boolean st=BranchDAO.addNewRecord(B);
		if (st)
		{
			out.println(" <font color=green size=20>Record Submitted.....</font><br><a href=BranchInterface>Click Here To  Add More Branch </a>  <br><br><a href=BranchDisplayAll>Click Here To see all Branch </a>");	}
		else 
		{ out.println("fail to submit Record....");
	}
	out.flush();}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
