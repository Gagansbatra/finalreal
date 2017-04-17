package com.prachi.dao;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.DriverManager;

import com.prachi.model.Subject;

public class SubjectDAO {
	static String provider="jdbc:mysql://localhost:3306/attendance";
	public static boolean addNewRecord(Subject SB)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="insert into subjectdata values('"+SB.getSubjectID()+"','"+SB.getBranchID()+"','"+SB.getSubjectName()+"','"+SB.getSemester()+"','"+SB.getStatus()+"')";
			
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn,query);
	return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
}

}
	public static ResultSet displayAllRecord()
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="select * from subjectdata";
	ResultSet rs=DBHelper.executeQuery(cn,query);
	System.out.println(query);
	//ResultSet rs=DBHelper.executeUpdate(cn,query);
	return rs;
	}catch(Exception e)
	{ System.out.println(e);
	return null;
}

}
	public static ResultSet DisplayById(String sbid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select * from subjectdata where SubjectID='"+sbid+"'";
	System.out.println(query);
	ResultSet rs=DBHelper.executeQuery(cn, query); 

	return rs;

	}catch(Exception e)
	{ System.out.println(e);
	return null;
	}}

	public static boolean EditRecord(Subject SB)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="update subjectdata set SubjectName='"+SB.getSubjectName()+"',BranchID='"+SB.getBranchID()+"',Semester='"+SB.getSemester()+"',Status='"+SB.getStatus()+"' where SubjectID='"+SB.getSubjectID()+"'";
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn, query);
	return st;

	}catch(Exception e)
	{ System.out.println(e);
		return false;
		}
	}


	public static boolean DeleteById(String sbid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="delete from subjectdata where SubjectID='"+sbid+"'";
	 boolean st=DBHelper.executeUpdate(cn, query);
	 return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}}

	public static ResultSet DisplayByBranchAndSem(String bid,String sm)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select * from subjectdata where BranchID='"+bid+"' and Semester='"+sm+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query); 

	return rs;

	}catch(Exception e)
	{ System.out.println(e);
	return null;
	}}

	public static ResultSet DisplayAllSubjectBYSemester(String sm)
	{ 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
	 String query="select * from subjectdata where Semester='"+sm+"'";
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
	 String query="select * from subjectdata where BranchID='"+bid+"' Group by Semester ";
	 ResultSet rs=DBHelper.executeQuery(cn, query);
	 
	 System.out.println(query);
	  
	   return rs;
	}catch(Exception e)

	{System.out.println(e);
		 return null;
	}

	}
    }
