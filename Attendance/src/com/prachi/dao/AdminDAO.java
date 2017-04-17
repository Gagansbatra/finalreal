package com.prachi.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

//import com.prachi.model.Faculty;

public class AdminDAO {
static String provider="jdbc:mysql://localhost:3306/attendance";
	
	public static boolean CheckPassword(String aid,String pwd)
	 { 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
	  String query="select * from admin where adminid='"+aid+"' and adminpwd='"+pwd+"'";
	   ResultSet rs=DBHelper.executeQuery(cn, query);
	   if(rs.next())
	   {
		   return true;
	   }
	   
	    return false;
	 }catch(Exception e)
	 {System.out.println(e);
		 return false;
	 }}
}
