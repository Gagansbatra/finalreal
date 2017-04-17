package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.softech.FileUpload;
import com.prachi.dao.StudentDAO;
import com.prachi.model.Student;

/**
 * Servlet implementation class StudentSubmit
 */
@WebServlet("/StudentSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class StudentSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Student S=new Student();  
		
		S.setEnrollmentno(request.getParameter("sid"));
		S.setName(request.getParameter("sn"));
		S.setFathername(request.getParameter("sfn"));
		S.setGender(request.getParameter("sg"));
		S.setBirthdate(request.getParameter("sbd"));
		S.setAddress(request.getParameter("sa"));
		S.setCountry(request.getParameter("cnt"));
		S.setState(request.getParameter("st"));
		S.setCity(request.getParameter("ct"));
		S.setContactno(request.getParameter("scno"));
		S.setMobileno(request.getParameter("smob"));
		S.setStdemailid(request.getParameter("sem"));
		S.setFatheremailid(request.getParameter("fem"));
		S.setBranch(request.getParameter("bid"));
		S.setSem(request.getParameter("sm"));
		S.setYear(request.getParameter("yr"));
		//S.setPhotograph(request.getParameter("sp"));
		S.setPassword(request.getParameter("spass"));
		 Part part=request.getPart("sp"); 
		  String savepath="D:/workspace/Attendance/WebContent/pic";
		 FileUpload F=new FileUpload(part,savepath);
		 S.setPhotograph(F.filename);
		boolean st=StudentDAO.addNewRecord(S);
		if (st)
		{
			out.println(" <font color=green size=20>Record Submitted.....</font><br><a href=StudentInterface>Click Here To  Add More Students </a><br><a href=StudentDiaplayAll>Click Here To See List Of All Students </a>");
		}
		else 
		{ out.println("fail to submit Record....");
	}
	out.flush();
	}
	}

