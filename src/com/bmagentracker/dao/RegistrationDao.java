package com.bmagentracker.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bmagenttracker.database.DataStore;

public class RegistrationDao extends DataStore{
   
	public boolean isValidUser(){
		System.out.println("in RegistrationDao isValidUser....");
		
		try{
		dbConnect();
		String query = "select Username from Agent";
		System.out.println("Query is "+query);
		ResultSet rs = dbQuery(query);
		
		if(rs != null){
			while(rs.next()){
				System.out.println("Result: "+rs.getString(1));
			}
		}
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return true;
	}
	
}
