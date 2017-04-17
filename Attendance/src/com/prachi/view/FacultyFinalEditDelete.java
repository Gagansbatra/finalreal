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

import com.prachi.dao.FacultyDAO;
import com.prachi.model.Faculty;

/**
 * Servlet implementation class FacultyFinalEditDelete
 */
@WebServlet("/FacultyFinalEditDelete")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)

public class FacultyFinalEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyFinalEditDelete() {
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
		  { Faculty Z=new Faculty();  
		  Z.setFacultyID(request.getParameter("fid"));
		  Z.setFacultyName(request.getParameter("fn")); 
		  Z.setFacultyBirthDate(request.getParameter("fbd"));
		  Z.setFacultyGender(request.getParameter("fg"));
		  Z.setFacultyAddress(request.getParameter("fa"));
			Z.setCountry(request.getParameter("fc"));
			Z.setState(request.getParameter("fs"));
			Z.setCity(request.getParameter("fci"));
		  //Z.setAddress(request.getParameter("ea"));
		  
		  Z.setFacultyCNO(request.getParameter("fc"));
		  Z.setFacultyEmailID(request.getParameter("fm"));
		  Z.setFacultyBranch(request.getParameter("bid"));
		  Z.setFacultyDesignation(request.getParameter("fd"));
		  Part part=request.getPart("fp"); 
		  String savepath="D:/workspace/Attendance/WebContent/pic";
		 FileUpload F=new FileUpload(part,savepath);
		 Z.setFacultyPhotograph(F.filename);
		 
		  boolean st=FacultyDAO.EditRecord(Z);
			  
		  }
		  else if(btn.equals("Delete"))
		  { String fid=request.getParameter("fid");
		  boolean st=FacultyDAO.DeleteById(fid);
		   }
		  response.sendRedirect("FacultyDisplayAll");
		
		}
}


