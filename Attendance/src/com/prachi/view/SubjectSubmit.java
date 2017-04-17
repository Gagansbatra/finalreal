package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.prachi.dao.SubjectDAO;
import com.prachi.model.Subject;

/**
 * Servlet implementation class SubjectSubmit
 */
@WebServlet("/SubjectSubmit")

public class SubjectSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();

		out.println("<a href=SubjectInterface >Add more Subject....</a>");

		out.println("<a href=SubjectDisplayAll >List Subjects....</a>");
		Subject SB=new Subject();  
		
		SB.setSubjectID(request.getParameter("sbid"));
		SB.setBranchID(request.getParameter("bid"));
		SB.setSubjectName(request.getParameter("sbn"));
		SB.setSemester(request.getParameter("sm"));
	//String ss= request.getParameter("ss");
		
        SB.setStatus(request.getParameter("ss"));
	//	System.out.println(ss);
		boolean st=SubjectDAO.addNewRecord(SB);
		if (st)
		{
			out.println(" <font color=green size=20>Record Submitted.....</font><br><a href=SubjectInterface>Click Here To  Add More Subjects </a>");
		}
		else 
		{ out.println("fail to submit Record....");
	}
		
	out.flush();
	}
	}


