package com.prachi.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.prachi.dao.DBHelper;
import com.prachi.model.Branch;


public class BranchDAO {
	static String provider="jdbc:mysql://localhost:3306/attendance";
	public static boolean addNewRecord(Branch B)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="insert into branchdata values('"+B.getBranchID()+"','"+B.getBranchName()+"')";
			
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
	
	String query="select * from branchdata";
	ResultSet rs=DBHelper.executeQuery(cn,query);
	System.out.println(query);
	//ResultSet rs=DBHelper.executeUpdate(cn,query);
	return rs;
	}catch(Exception e)
	{ System.out.println(e);
	return null;
}

}
	public static ResultSet DisplayById(String bid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select * from branchdata where BranchID='"+bid+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query); 

	return rs;

	}catch(Exception e)
	{ System.out.println(e);
	return null;
	}}

	public static boolean EditRecord(Branch B)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="update branchdata set BranchName='"+B.getBranchName()+"' where BranchID='"+B.getBranchID()+"'";
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn, query);
	return st;

	}catch(Exception e)
	{ System.out.println(e);
		return false;
		}
	}

	public static ResultSet FetchBranchbyfaculty(String fid)
	{ try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
	 String query="SELECT fs.*,b.BranchName FROM facultysubject fs,branchdata b where fs.BranchID=b.BranchID and FacultyID='"+fid+"'";
	  
	 ResultSet rs=DBHelper.executeQuery(cn,query);
	 return rs;
	}catch(Exception e)
	{System.out.println(e);
		 return null;
	}}
	
	public static boolean DeleteById(String bid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="delete from branchdata where BranchID='"+bid+"'";
	 boolean st=DBHelper.executeUpdate(cn, query);
	 return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}}


	
}
