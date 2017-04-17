package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.prachi.dao.FacultySubjectDAO;
import com.prachi.model.FacultySubject;

/**
 * Servlet implementation class FacultySubjecSubmit
 */
@WebServlet("/FacultySubjecSubmit")
public class FacultySubjecSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultySubjecSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		FacultySubject FS=new FacultySubject();  
		
		FS.setFacultyID(request.getParameter("fid"));
	    FS.setBranchID(request.getParameter("bid"));
		FS.setSemester(request.getParameter("sm"));
		FS.setSubjectID(request.getParameter("sbid"));
		
		boolean st=FacultySubjectDAO.addNewRecord(FS);
		if (st)
		{
			out.println(" <font color=green size=20>Record Submitted.....</font><br><a href=FacultyStudentInterface>Click Here To  Add More Record </a>");
		}
		else 
		{ out.println("fail to submit Record....");
	}
	out.flush();

	}
 	}



