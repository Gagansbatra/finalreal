package com.prachi.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.prachi.model.Report;

public class ReportDAO {static String provider="jdbc:mysql://localhost:3306/attendance";
	public static boolean AddNewRecord(Report R)

	{
		try
		{
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="insert into report values('"+R.getBranchid()+"','"+R.getSemester()+"','"+R.getStudentid()+"')";
			boolean st=DBHelper.executeUpdate(cn, query);
			System.out.println(query);
			return st;
		}
		catch(Exception e)
		{System.out.println(e);
			return false;
		}
	}





	public static ResultSet DisplayAll()
	{ 	
	try{
	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select * from report";
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
	String query="select * from studentdata where branch='"+bid+"'and sem='"+sm+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query);



	return rs;
	}catch(Exception e)
	{System.out.println(e);
	 return null;
	}
	}
	public static boolean AddNewRecordByDate(Report R)

	{
		try
		{
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="insert into reportbydate values('"+R.getBranchid()+"','"+R.getSemester()+"','"+R.getStudentid()+"','"+R.getPreviousdate()+"','"+R.getNextdate()+"')";
			boolean st=DBHelper.executeUpdate(cn, query);
			System.out.println(query);
			return st;
		}
		catch(Exception e)
		{System.out.println(e);
			return false;
		}
	}

	}





