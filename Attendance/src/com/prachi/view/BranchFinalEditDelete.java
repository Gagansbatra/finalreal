package com.prachi.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.BranchDAO;
import com.prachi.model.Branch;

/**
 * Servlet implementation class BranchFinalEditDelete
 */
@WebServlet("/BranchFinalEditDelete")
public class BranchFinalEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchFinalEditDelete() {
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
		  { Branch B=new Branch();  
		  B.setBranchID(request.getParameter("bid"));
		  B.setBranchName(request.getParameter("bn")); 
		  boolean st=BranchDAO.EditRecord(B);
		  
	  }
	  else if(btn.equals("Delete"))
	  { String bid=request.getParameter("bid");
	  boolean st=BranchDAO.DeleteById(bid);
	   }
	  response.sendRedirect("BranchDisplayAll");
	

}
}
