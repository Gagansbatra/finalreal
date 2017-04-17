package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.AttendanceDAO;
import com.prachi.dao.ReportDAO;
import com.prachi.model.Report;

/**
 * Servlet implementation class ReportByDateSubmit
 */
@WebServlet("/ReportByDateSubmit")
public class ReportByDateSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportByDateSubmit() {
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
	    R.setPreviousdate(request.getParameter("pd"));
	    R.setNextdate(request.getParameter("nd"));


		
		ResultSet rs=AttendanceDAO.summarybydate(request.getParameter("sid"), request.getParameter("bid"), request.getParameter("sm"), request.getParameter("pd"), request.getParameter("nd"));
		try {
			if(rs.next())
			{
				
			}	
			else
				out.println("Record not found..");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
