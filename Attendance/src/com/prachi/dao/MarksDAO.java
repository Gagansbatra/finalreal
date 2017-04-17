package com.prachi.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.prachi.model.Marks;

public class MarksDAO {
	static String provider="jdbc:mysql://localhost:3306/attendance";
	/*public static boolean addNewRecord(Marks M)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="insert into marks values('"+M.getEnrollmentno()+"','"+M.getSubjectname()+"','"+M.getMidterm1()+"','"+M.getMidterm2()+"','"+M.getAssignment1()+"','"+M.getAssignment2()+"','"+M.getQuiz1()+"','"+M.getQuiz2()+"','"+M.getLabquiz()+"','"+M.getClassattendance()+"','"+M.getLabattendance()+"','"+M.getInternalviva()+"','"+M.getLabperformance()+"','"+M.getTotal()+"','"+M.getSubjectid()+"')";
	System.out.println("Total is=="+M.getTotal());
	
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn,query);
	return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}

}*/
	public static boolean addNewRecord(Marks M)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String s=M.getEnrollmentno();
		int stu=Integer.parseInt(s);
		int c=0;
		String q="select studentid from marks";
		ResultSet rs=DBHelper.executeQuery(cn, q);
		if(rs.next())
		{
			do{
			int sid=Integer.parseInt(rs.getString(1));
			if(sid==stu)
			{
				c++;
			}
			}while(rs.next());
			
		}
		
	if(c>0)
	{
	
	String query="insert into marks values('"+M.getEnrollmentno()+"','"+M.getSubjectname()+"','"+M.getMidterm1()+"','"+M.getMidterm2()+"','"+M.getAssignment1()+"','"+M.getAssignment2()+"','"+M.getQuiz1()+"','"+M.getQuiz2()+"','"+M.getLabquiz()+"','"+M.getClassattendance()+"','"+M.getLabattendance()+"','"+M.getInternalviva()+"','"+M.getLabperformance()+"','"+M.getTotal()+"','"+M.getSubjectid()+"')";
	System.out.println("Total is=="+M.getTotal());
	
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn,query);
	return st;
	}
	else
	{
		
	}
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}
	return false;

}

	public static boolean UpdateRecord(Marks M)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="update marks set studentid='"+M.getEnrollmentno()+"',subjectname='"+M.getSubjectname()+"',midterm1='"+M.getMidterm1()+"',midterm2='"+M.getMidterm2()+"',assignment1='"+M.getAssignment1()+"',assignment2='"+M.getAssignment2()+"',quiz1='"+M.getQuiz1()+"',quiz2='"+M.getQuiz2()+"',labquiz='"+M.getLabquiz()+"',classattendance='"+M.getClassattendance()+"',Labattendance='"+M.getLabattendance()+"',internalviva='"+M.getInternalviva()+"',labperformance='"+M.getLabperformance()+"',total='"+M.getTotal()+"' where studentid='"+M.getEnrollmentno()+"' and subjectid='"+M.getSubjectid()+"'";
	System.out.println("Total is=="+M.getTotal());
	
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn,query);
	return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}

}
	
	public static ResultSet displayAllRecord( String sid)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		
	
	String query="select * from marks where studentid='"+sid+"'";
	ResultSet rs=DBHelper.executeQuery(cn,query);
	System.out.println(query);
	//ResultSet rs=DBHelper.executeUpdate(cn,query);
	return rs;
	}catch(Exception e)
	{ System.out.println(e);
	return null;
}

}

	public static ResultSet DisplayAllRecordAttendence()
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		
	
	String query="select * from marks ";
	ResultSet rs=DBHelper.executeQuery(cn,query);
	System.out.println(query);
	//ResultSet rs=DBHelper.executeUpdate(cn,query);
	return rs;
	}catch(Exception e)
	{ System.out.println(e);
	return null;
}

}

	
	
	}
