package com.prachi.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.prachi.dao.StudentDAO;
import com.prachi.model.Student;

/**
 * Servlet implementation class StudentFinalEditDelete
 */
@WebServlet("/StudentFinalEditDelete")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class StudentFinalEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFinalEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String btn=request.getParameter("btn");
		  if(btn.equals("Update"))
		  { Student S=new Student();  
		  S.setEnrollmentno(request.getParameter("sid"));
			S.setName(request.getParameter("sn"));
			S.setFathername(request.getParameter("sfn"));
			S.setGender(request.getParameter("sg"));
			S.setBirthdate(request.getParameter("sbd"));
			S.setAddress(request.getParameter("sa"));
			S.setCountry(request.getParameter("sc"));
			S.setState(request.getParameter("ss"));
			S.setCity(request.getParameter("sci"));
			S.setContactno(request.getParameter("scno"));
			S.setMobileno(request.getParameter("smob"));
			S.setStdemailid(request.getParameter("sem"));
			S.setFatheremailid(request.getParameter("fem"));
			S.setBranch(request.getParameter("sb"));
			S.setSem(request.getParameter("sm"));
			S.setYear(request.getParameter("sy"));
			
			Part part=request.getPart("sp"); 
			  String savepath="D:/workspace/Attendance/WebContent/pic";
			 FileUpload F=new FileUpload(part,savepath);
			 S.setPhotograph(F.filename);
			//S.setPhotograph(request.getParameter("sp"));
			//S.setPassword(request.getParameter("spass"));
		  boolean st=StudentDAO.EditRecord(S);
			  
		  }
		  else if(btn.equals("Delete"))
		  { String sid=request.getParameter("sid");
		  boolean st=StudentDAO.DeleteById(sid);
		   }
		  response.sendRedirect("StudentDisplayAll");
	}

}
