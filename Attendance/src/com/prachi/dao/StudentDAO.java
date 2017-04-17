package com.prachi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.prachi.model.Faculty;
import com.prachi.model.Student;

public class StudentDAO {
	static String provider="jdbc:mysql://localhost:3306/attendance";
	public static boolean addNewRecord(Student S)
	{	try {
	Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="insert into studentdata values('"+S.getEnrollmentno()+"','"+S.getName()+"','"+S.getFathername()+"','"+S.getGender()+"','"+S.getBirthdate()+"','"+S.getAddress()+"','"+S.getCountry()+"','"+S.getState()+"','"+S.getCity()+"','"+S.getContactno()+"','"+S.getMobileno()+"','"+S.getStdemailid()+"','"+S.getFatheremailid()+"','"+S.getBranch()+"','"+S.getSem()+"','"+S.getYear()+"','"+S.getPhotograph()+"','"+S.getPassword()+"')";
			
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
	
	//String query="select * from studentdata";
	String query="SELECT st.*, b.branchname,c.countryname,s.statename,ct.cityname FROM studentdata st,branchdata b,country c,state s,city ct where b.branchid=st.branch and st.country=c.countryid and st.state=s.stateid and st.city=ct.cityid";
	ResultSet rs=DBHelper.executeQuery(cn,query);
	System.out.println(query);
	//ResultSet rs=DBHelper.executeUpdate(cn,query);
	return rs;
	}catch(Exception e)
	{ System.out.println(e);
	return null;
}

}
	public static ResultSet DisplayById(String sid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	
	String query="select * from studentdata where enrollmentno='"+sid+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query); 
System.out.println(query);
	return rs;

	}catch(Exception e)
	{ System.out.println(e);
	return null;
	}}

	public static boolean EditRecord(Student S)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="update studentdata set name='"+S.getName()+"',fathername='"+S.getFathername()+"',gender='"+S.getGender()+"',birthdate='"+S.getBirthdate()+"',address='"+S.getAddress()+"',country='"+S.getCountry()+"',state='"+S.getState()+"',city='"+S.getCity()+"',contactno='"+S.getContactno()+"',mobileno='"+S.getMobileno()+"',stdemailid='"+S.getStdemailid()+"',fatheremailid='"+S.getFatheremailid()+"',branch='"+S.getBranch()+"',sem='"+S.getSem()+"',year='"+S.getYear()+"',photograph='"+S.getPhotograph()+"',password='"+S.getPassword()+"' where enrollmentno='"+S.getEnrollmentno()+"'";
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(cn, query);
	return st;

	}catch(Exception e)
	{ System.out.println(e);
		return false;
		}
	}


	public static boolean DeleteById(String sid)
	{try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="delete from studentdata where enrollmentno='"+sid+"'";
	 boolean st=DBHelper.executeUpdate(cn, query);
	 return st;
	}catch(Exception e)
	{ System.out.println(e);
	return false;
	}}

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

	public static Student CheckPassword(String sid,String spass)
	 { 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
	  String query="select * from studentdata where enrollmentno='"+sid+"' and password='"+spass+"'";
	   ResultSet rs=DBHelper.executeQuery(cn, query);
	   if(rs.next())
	   {
		   Student S=new Student();
		   S.setEnrollmentno(rs.getString(1));
		   S.setName(rs.getString(2));
		  S.setPhotograph(rs.getString(17));
		   return(S);
		   
	   }
	   
	    return null;
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;


	}

}
}
