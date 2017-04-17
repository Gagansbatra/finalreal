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

import com.prachi.dao.DBHelper;
import com.prachi.dao.StateCityDAO;

/**
 * Servlet implementation class FetchStateJSON
 */
@WebServlet("/FetchStateJSON")
public class FetchStateJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchStateJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		  ResultSet rs=StateCityDAO.FetchState(request.getParameter("cntid"));
		  ArrayList<JSONObject> list= DBHelper.getFormattedResult(rs);
		   out.println(list);
	
	
	}

}




