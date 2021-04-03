package org.la.student.aqsa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCcompany {
	
	public static void main(String[] args) {
	
	        JDBCcompany jdbc = new JDBCcompany(); 
			String url = "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC";
			Connection con = null;
			
			try {
			con = DriverManager.getConnection(url,"root","root");
				
			    if(con!=null) {
				   System.out.println("Connected");
				
				  // jdbc.create(con, 2, "TCS", "Mass Recruiter", 5491);
				  // jdbc.create(con, 3, "Wipro","Service", 5461);
				 //  jdbc.update(con, "cognizant", "Mass Recruiter", 5481, 1);
				     jdbc.read(con);
				     jdbc.delete(con, 3);
				     jdbc.read(con);
			                   }
			    else {
				   System.out.println("Not Connected"); }
			}
			catch(Exception e) {
				e.getMessage();
			}
			
			finally{	
				try {
					if(con!=null) 
						con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
}
	
	/*
	 * crud
	 * create
	 * read
	 * update
	 * delete
	 */
	
	
	
	//CREATE/INSERT
	public void create(Connection con,int company_id,String name,String description,int primary_contact_attendee_id) {
		
		PreparedStatement ps = null;
		try {
		String query = "Insert INTO company(company_id,name,description,primary_contact_attendee_id) VALUES (?, ?, ?, ? )";
		
		ps = con.prepareStatement(query);
		ps.setInt(1, company_id);
		ps.setString(2, name);
		ps.setString(3, description);
		ps.setInt(4, primary_contact_attendee_id);
		
		int executeUpdate = ps.executeUpdate();
		
		if(executeUpdate>0) {
			System.out.println("Data created succesfully");
		}
		else {
			System.out.println("Data not created");
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}
				catch(SQLException e) {
					e.printStackTrace();
			}
		}
		
	}
	
	// READ
	
	public void read(Connection con) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT * from company";
		try {
			ps = con.prepareStatement(query);
			 rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//Update
	
	public void update(Connection con,String name,String description,int primary_contact_attendee_id,int company_id) {
	
	String query = "UPDATE company SET name =? ,description = ? ,primary_contact_attendee_id= ? WHERE company_id = ?";

	PreparedStatement ps = null;
	try {
		ps = con.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, description);
		ps.setInt(3,primary_contact_attendee_id );
		ps.setInt(4, company_id);
		int executeUpdate = ps.executeUpdate();
		
		if(executeUpdate>0) {
			System.out.println("Data Updated");
		}
		else {
			System.out.println("Data Not Updated");
		}
	
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	finally {
		try {
			if(ps!=null) {
				ps.close();
			}
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	}
	
	public void delete(Connection con,int company_id) {
		
		String query = "DELETE from company WHERE company_id= ?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, company_id);
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Deleted");
			}
			else {
				System.out.println("Deletion Fail");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
