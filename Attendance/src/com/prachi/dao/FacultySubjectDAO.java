package com.prachi.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.prachi.model.FacultySubject;


public class FacultySubjectDAO {

	static String provider="jdbc:mysql://localhost:3306/attendance";
	public static boolean addNewRecord(FacultySubject FS)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="insert into facultysubject values('"+FS.getFacultyID()+"','"+FS.getBranchID()+"','"+FS.getSemester()+"','"+FS.getSubjectID()+"')";
	
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn,query);
	return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
}
	}
}
