package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.prachi.dao.FacultyDAO;
import com.prachi.model.Faculty;
import org.softech.FileUpload;
/**
 * Servlet implementation class FacultySubmit
 */
@WebServlet("/FacultySubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class FacultySubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultySubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		Faculty Z=new Faculty();  
		
		Z.setFacultyID(request.getParameter("fid"));
		Z.setFacultyName(request.getParameter("fn"));
		Z.setFacultyBirthDate(request.getParameter("fbd"));
		Z.setFacultyGender(request.getParameter("fg"));
		
		Z.setFacultyCNO(request.getParameter("fc"));
		Z.setFacultyEmailID(request.getParameter("fm"));
		Z.setFacultyBranch(request.getParameter("bid"));
		Z.setFacultyDesignation(request.getParameter("fd"));
		Z.setFacultyPhotograph(request.getParameter("fp"));
		Z.setFacultyPassword(request.getParameter("fpass"));
		 Part part=request.getPart("fp"); 
		  String savepath="D:/workspace/Attendance/WebContent/pic";
		 FileUpload F=new FileUpload(part,savepath);
		 Z.setFacultyPhotograph(F.filename);
		 Z.setFacultyAddress(request.getParameter("fa"));
			Z.setCountry(request.getParameter("cnt"));
			Z.setState(request.getParameter("st"));
			Z.setCity(request.getParameter("ct"));
		boolean st=FacultyDAO.addNewRecord(Z);
		if (st)
		{
			out.println(" <font color=green size=20>Record Submitted.....</font><br><a href=FacultyInterface>Click Here To  Add More Faculties </a><br><br><a href=FacultyDisplayAll>Click Here To see list of all Faculties </a>");
		}
		else 
		{ out.println("fail to submit Record....");
	}
	out.flush();
	}
	}


