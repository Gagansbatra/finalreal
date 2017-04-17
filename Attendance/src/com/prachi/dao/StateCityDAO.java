package com.prachi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StateCityDAO {
	static String provider="jdbc:mysql://localhost:3306/attendance";

    public static ResultSet FetchCountry()
    {try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	
    String query="Select * from country";
    ResultSet rs=DBHelper.executeQuery(cn, query);
    return(rs);
    
    }catch(Exception e)
    {
     System.out.println(e);	
     return null;
    }}

    public static ResultSet FetchState(String cntid)
    {try{ Class.forName("com.mysql.jdbc.Driver").newInstance();   
	Connection cn=DriverManager.getConnection(provider,"root","123");
	
    String query="Select * from state where countryid='"+cntid+"'";
    ResultSet rs=DBHelper.executeQuery(cn, query);
    return(rs);
   }catch(Exception e)
    {
     System.out.println(e);	
     return null;
    }} 
    
    public static ResultSet FetchCity(String stid)
    {
    	try{ 
    		Class.forName("com.mysql.jdbc.Driver").newInstance();   
    		Connection cn=DriverManager.getConnection(provider,"root","123");
	
    		String query="Select * from city where stateid='"+stid+"'";
    		ResultSet rs=DBHelper.executeQuery(cn, query);
    		return(rs);
    		
    		
    		}catch(Exception e)
    		{
    				System.out.println(e);	
    				return null;
    		}
    	}   
}
