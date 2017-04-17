package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.SMSDAO;
import com.insidecodes.SendSMS;

/**
 * Servlet implementation class SMS
 */
@WebServlet("/SMS")
public class SMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SMS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mob=request.getParameter("mob");
		String msg=request.getParameter("msg");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		SMSDAO.init();
		SendSMS.sendSMS("127.0.0.1", "8800", "prachi", "prachi", mob, msg);
		
		
		
		out.println("<font color=green><center>Message Sent</center></font>");}

}
