package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.prachi.dao.AttendanceDAO;
import com.prachi.dao.DBHelper;

/**
 * Servlet implementation class SummaryByDate
 */
@WebServlet("/SummaryByDate")
public class SummaryByDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryByDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			
			ResultSet rs=AttendanceDAO.summarybydate(request.getParameter("sid"),request.getParameter("bid"), request.getParameter("sm"), request.getParameter("pd"),request.getParameter("nd"));
			ArrayList <JSONObject>list=DBHelper.getFormattedResult(rs);
			System.out.println(list);
			out.println(list);
		}catch(Exception e){
			System.out.println(e);
			
			
		}}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
