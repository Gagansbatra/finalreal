package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.prachi.dao.ReportDAO;
import com.prachi.model.Report;

/**
 * Servlet implementation class ReportSubmit
 */
@WebServlet("/ReportSubmit")
public class ReportSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Report R=new Report();
	    R.setBranchid(request.getParameter("bid"));
	    R.setSemester(request.getParameter("sm"));
	    R.setStudentid(request.getParameter("sid"));


		
		boolean st=ReportDAO.AddNewRecord(R);
		out.println("<html>");
		if(st)
		{
			out.println("<h3><font color=green>REPORT SUBMITTED...<br><a href=ReportInterface>Click Here To Add More Reports...</a></font></h3>");
		}
		else
		{
			out.println("<h3><font color=red>FAILED TO SUBMIT REPORT...<br><a href=ReportInterface>Click Here To Add More Reports...</a></font></h3>");
		}
	out.println("</html>");
	out.flush();}

	


}


