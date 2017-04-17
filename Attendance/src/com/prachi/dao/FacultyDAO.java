package com.prachi.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.prachi.dao.DBHelper;
import com.prachi.model.Faculty;

public class FacultyDAO {
	static String provider="jdbc:mysql://localhost:3306/attendance";
	public static boolean addNewRecord(Faculty Z)
	{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="insert into facultydata values('"+Z.getFacultyID()+"','"+Z.getFacultyName()+"','"+Z.getFacultyBirthDate()+"','"+Z.getFacultyGender()+"','"+Z.getFacultyCNO()+"','"+Z.getFacultyEmailID()+"','"+Z.getFacultyBranch()+"','"+Z.getFacultyDesignation()+"','"+Z.getFacultyPhotograph()+"','"+Z.getFacultyPassword()+"','"+Z.getFacultyAddress()+"','"+Z.getCountry()+"','"+Z.getState()+"','"+Z.getCity()+"')";
	
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
		
	
	//String query="select * from facultydata";
		String query="SELECT f.*, b.branchname,c.countryname,s.statename,ct.cityname FROM facultydata f,branchdata b,country c,state s,city ct where b.branchid=f.FacultyBranch and f.country=c.countryid and f.state=s.stateid and f.city=ct.cityid";
	ResultSet rs=DBHelper.executeQuery(cn,query);
	System.out.println(query);
	//ResultSet rs=DBHelper.executeUpdate(cn,query);
	return rs;
	}catch(Exception e)
	{ System.out.println(e);
	return null;
}

}
	public static ResultSet DisplayById(String fid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select * from facultydata where FacultyID='"+fid+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query); 

	return rs;

	}catch(Exception e)
	{ System.out.println(e);
	return null;
	}}

	public static boolean EditRecord(Faculty Z)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="update facultydata set FacultyName='"+Z.getFacultyName()+"',FacultyBirthDate='"+Z.getFacultyBirthDate()+"',FacultyGender='"+Z.getFacultyGender()+"',FacultyAddress='"+Z.getFacultyAddress()+"',country='"+Z.getCountry()+"',state='"+Z.getState()+"',city='"+Z.getCity()+"',FacultyCNO='"+Z.getFacultyCNO()+"',FacultyEmailID='"+Z.getFacultyEmailID()+"',FacultyBranch='"+Z.getFacultyBranch()+"',FacultyDesignation='"+Z.getFacultyDesignation()+"',FacultyPhotograph='"+Z.getFacultyPhotograph()+"' where FacultyID='"+Z.getFacultyID()+"'";
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn, query);
	return st;

	}catch(Exception e)
	{ System.out.println(e);
		return false;
		}
	}


	public static boolean DeleteById(String fid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="delete from facultydata where Facultyid='"+fid+"'";
	 boolean st=DBHelper.executeUpdate(cn, query);
	 return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}}

	public static Faculty CheckPassword(String fid,String fpass)
	 { 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
	  String query="select * from facultydata where FacultyID='"+fid+"' and FacultyPassword='"+fpass+"'";
	   ResultSet rs=DBHelper.executeQuery(cn, query);
	   if(rs.next())
	   {
		   Faculty F=new Faculty();
		   F.setFacultyID(rs.getString(1));
		   F.setFacultyName(rs.getString(2));
		   F.setFacultyPhotograph(rs.getString(9));
		   return(F);
		   
	   }
	   
	    return null;
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;


	}

}
}
