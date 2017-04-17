package com.prachi.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Calendar;

import com.prachi.model.Attendance;
	
	public class AttendanceDAO {
		static String provider="jdbc:mysql://localhost:3306/attendance";
		/* public static ResultSet FetchStudents(String bid,String sm,String sid)
		 { try{
			 Class.forName("com.mysql.jdbc.Driver").newInstance();   
			 Connection cn=DriverManager.getConnection(provider,"root","123");
		  String query="select b.bid,b.bn,s.sid,s.sn from studentdata s  where s.sid="+sid +" and b.bid="+bid;
		  ResultSet rs=DBHelper.executeQuery(cn, query);
		    return(rs);
		 }catch(Exception e)
		 {System.out.println(e);
			 return null;
		 }}*/
		public static boolean AddNewRecord(Attendance A)

		{
			try
			{
				
				Connection cn=DriverManager.getConnection(provider,"root","123");
				String query="insert into attendancedetails(facultyid,enrollmentno,branchid,semester,subject,currentdate,status) values('"+A.getFacultyid()+"','"+A.getEnrollmentno()+"','" +A.getBranchid()+"','"+A.getSemester()+"','"+A.getSubject()+"','"+A.getCurrentdate()+"','Present')";
				boolean st=DBHelper.executeUpdate(cn, query);
				System.out.println(query);
				return st;
			}
			catch(Exception e)
			{System.out.println(e);
				return false;
			}
		}
		
		public static ResultSet FetchStudents(String bid,String sm,String subjectid) {
			// TODO Auto-generated method stub
			{ try{
				 Class.forName("com.mysql.jdbc.Driver").newInstance();   
				 
				 Connection cn=DriverManager.getConnection(provider,"root","123");
				 Calendar C=Calendar.getInstance();
				 String cd=C.get(Calendar.YEAR)+"-"+(C.get(Calendar.MONTH)+1)+"-"+C.get(Calendar.DATE);
				 
			String query="select * from studentdata   where branch='"+bid+"' and sem='"+sm+"' and enrollmentno not in(select enrollmentno from attendancedetails where branchid='"+bid+"' and semester='"+sm+"' and subject='"+subjectid+"' and currentdate='"+cd+"')";
				   System.out.println(query);
			  ResultSet rs=DBHelper.executeQuery(cn, query);
			    return(rs);
			 }catch(Exception e)
			 {System.out.println(e);
			 return null;
			 }
		}
		}
		public static ResultSet DisplayMarksheet(String bid, String sm)
		{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="select * from subjectdata where BranchID='"+bid+"' and Semester='"+sm+"'";
		ResultSet rs=DBHelper.executeQuery(cn, query); 

		return rs;

		}catch(Exception e)
		{ System.out.println(e);
		return null;
		}}
		
		


public static ResultSet DisplayAllSubjectBYSemester(String sem)
{ 	
try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();   
 Connection cn=DriverManager.getConnection(provider,"root","123");
String query="select * from subjectdata where Semester='"+sem+"'";
ResultSet rs=DBHelper.executeQuery(cn, query);



return rs;
}catch(Exception e)
{System.out.println(e);
 return null;
}
}

public static ResultSet DisplaySemesterBYBranch(String bid)
{ 	
try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();   
 Connection cn=DriverManager.getConnection(provider,"root","123");
String query="select * from subjectdata where BranchID='"+bid+"'";
ResultSet rs=DBHelper.executeQuery(cn, query);



return rs;
}catch(Exception e)
{System.out.println(e);
 return null;
}
}
public static ResultSet DisplayAllStudentBYBranchandSemester(String bid, String sm)
{ 	
try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();   
 Connection cn=DriverManager.getConnection(provider,"root","123");
String query="select * from attendancedetails where branchid='"+bid+"'and semester='"+sm+"'";
ResultSet rs=DBHelper.executeQuery(cn, query);



return rs;
}catch(Exception e)
{System.out.println(e);
 return null;
}
}
public static ResultSet summary(String bid, String sm, String sid)
{try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select s.SubjectName, a.subject , count(subject) as total from attendancedetails a ,subjectdata s where a.branchid='"+bid+"' and a.semester='"+sm+"' and a.enrollmentno='"+sid+"' and a.subject=s.SubjectID group by a.subject";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	System.out.println(query);
	return rs;
	}catch(Exception e)
	{System.out.println(e);
	 return null;
	}
}
public static ResultSet viewAttendance(String sid)
{try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select * from attendancedetails where enrollmentno='"+sid+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	System.out.println(query);
	return rs;
	}catch(Exception e)
	{System.out.println(e);
	 return null;
	}
}

public static ResultSet summaryByFaculty(String bid, String sm, String fid)
{try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select s.SubjectName, a.subject , count(subject) as total from attendance a ,subjectdata s where a.branchid='"+bid+"' and a.semester='"+sm+"' and a.enrollmentno='"+fid+"'  and a.subject=s.SubjectID group by a.subject";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	return rs;
	}catch(Exception e)
	{System.out.println(e);
	 return null;
	}
}




public static ResultSet summarybydate( String sid,String bid, String sm ,String pd,String nd)
{try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","123");
	
	 String query="select s.SubjectName, a.subject , count(subject) as total from attendancedetails a ,subjectdata s where a.branchid='"+bid+"' and a.semester='"+sm+"' and a.enrollmentno='"+sid+"' and a.subject=s.SubjectID and  A.currentdate between '"+pd+"' and '"+nd+"' group by a.subject";
	// String query="SELECT A.* ,S.StudentName ,count(enrollmentno) as total  FROM attendance A ,Student S  where A.facultyid='"+fid+"' and A.branchid='"+bid+"' and S.studentid=A.enrollmentno and A.semester='"+sm+"' and A.subject='"+sub+"'and  A.date between '"+pd+"' and '"+nd+"' group by A.enrollmentno";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	return rs;
	}catch(Exception e)
	{System.out.println(e);
	 return null;
	}
}






}




