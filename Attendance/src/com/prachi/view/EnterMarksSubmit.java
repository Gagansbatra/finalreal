package com.prachi.view;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prachi.dao.MarksDAO;
import com.prachi.model.Marks;

/**
 * Servlet implementation class EnterMarksSubmit
 */
@WebServlet("/EnterMarksSubmit")
public class EnterMarksSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterMarksSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//Marks M=new Marks();  
	try{	
		String sid=request.getParameter("sid");
		String sbid[]=request.getParameterValues("sbid");
		String sbn[]=request.getParameterValues("sbn");
		String md1[]=request.getParameterValues("md1");
		String md2[]=request.getParameterValues("md2");
		String ass1[]=request.getParameterValues("ass1");
		String ass2[]=request.getParameterValues("ass2");
		String q1[]=request.getParameterValues("q1");
		String q2[]=request.getParameterValues("q2");
		String lq[]=request.getParameterValues("lq");
		String ca[]=request.getParameterValues("ca");
		String la[]=request.getParameterValues("la");
		String iv[]=request.getParameterValues("iv");
		String lp[]=request.getParameterValues("lp");
	//	String tt[]=request.getParameterValues("tt");
		/*M.setSubjectid(request.getParameter("sbid"));
		M.setSubjectname(request.getParameter("sbn"));
		M.setMidterm1(request.getParameter("md1"));
		M.setMidterm2(request.getParameter("md2"));
		M.setAssignment1(request.getParameter("ass1"));
		M.setAssignment2(request.getParameter("ass2"));
		M.setQuiz1(request.getParameter("q1"));
		M.setQuiz2(request.getParameter("q2"));
		M.setLabquiz(request.getParameter("lq"));
		M.setClassattendance(request.getParameter("ca"));
		M.setLabattendance(request.getParameter("la"));
		M.setInternalviva(request.getParameter("iv"));
		M.setLabperformance(request.getParameter("lp")); */
		System.out.println("============================"+sbid.length);
		int i=0,c=0;
		for (i=0;i<sbid.length;i++)
		{
			Marks M=new Marks();  
			M.setEnrollmentno(sid);
			M.setSubjectid(sbid[i]);
			M.setSubjectname(sbn[i]);
			M.setMidterm1(md1[i]);
			M.setMidterm2(md2[i]);
			M.setAssignment1(ass1[i]);
			M.setAssignment2(ass2[i]);
			M.setQuiz1(q1[i]);
			M.setQuiz2(q2[i]);
			M.setLabquiz(lq[i]);
			M.setClassattendance(ca[i]);
			M.setLabattendance(la[i]);
			M.setInternalviva(iv[i]);
			M.setLabperformance(lp[i]);
			int total=Integer.parseInt(md1[i])+Integer.parseInt(md2[i])+Integer.parseInt(ass1[i])+Integer.parseInt(ass2[i])+Integer.parseInt(q1[i])+Integer.parseInt(q2[i])+Integer.parseInt(la[i])+Integer.parseInt(ca[i])+Integer.parseInt(lq[i])+Integer.parseInt(iv[i])+Integer.parseInt(lp[i]);
			M.setTotal(Integer.toString(total));
			boolean st=MarksDAO.addNewRecord(M);
			
			boolean dt=false;
			if (st)
			{	c++;
			System.out.println("ccccccccccccccccccccccccc"+c);
				if(c==sbid.length){
				out.println(" <font color=green size=20>Record Submitted.....</font><br><a href=MarksDetails>Click Here To  Add More Record </a>");
				}
				}
			else if(st==false)
			{	out.println("Record Already submitted....");
	//			dt=MarksDAO.UpdateRecord(M);
			}
			else if(!dt && !st)
			{ out.println("fail to submit Record....");
		
		}
}
			
	}catch(Exception e){System.out.println("Error==="+e.toString());}
	out.flush();
	
	} 
	}

