package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Presentation {

	public static void main(String[] args) {
		
		Presentation presentation = new Presentation();
		
		Connection con = null;
		

		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
			
			if(con != null) {
				
				System.out.println("Connection Successful");
				presentation.read(con);
				//presentation.create(con, 5, 22, 33, "12:00am", "06:00am");
				presentation.update(con, 1, 28, 39, "09:00am", " 12:00pm");
				presentation.delete(con, 5);
				
			}
			
			else
			{
				System.out.println("Connection Failed");
			}
		}
		
		 catch(Exception e) {
			 
		System.out.println(e.getMessage());
		 }
		
		finally
		{
			try {
				
				con.close();
			}
			
			catch(Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void create(Connection con, int presentation_id, int booked_company_id, int booked_room_id, String  start_time, String end_time) {
		
		PreparedStatement pstatement = null;
		
		//PreparedStatement pStatement = null;
		
		try {
			
			String query = "INSERT INTO presentation (presentation_id, booked_company_id, booked_room_id,start_time,  end_time) VALUES ( ?,?,?, ?,?)";
			pstatement = con.prepareStatement(query);
			
			pstatement.setInt(1, presentation_id );
			pstatement.setInt(2, booked_company_id);
			pstatement.setInt(3, booked_room_id);
			pstatement.setString(4,  start_time);
			pstatement.setString(5, end_time);
			
			int executeUpdate = pstatement.executeUpdate();
			
			if(executeUpdate >0) {
				
				System.out.println("Data Created Successfully");
			}
			
			else
				
			{
				System.out.println("Failed to create data");
			}
			
					
					
		}
		
		catch(Exception se) {
			
			se.printStackTrace();
		}
		
		finally 
		{
			try {
			if(pstatement != null)
			{
				pstatement.close();
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
	
	public void read(Connection con) {
		
		PreparedStatement  pStatement = null;
		
		ResultSet rs = null;
		
		try {
			
			String query = "Select * from  presentation";
			pStatement = con.prepareStatement(query);
			
			rs = pStatement.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3) + " " + rs.getString(4) +" " + rs.getString(5));
			}
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		finally
		{
			try{
				
				if(pStatement != null)
					pStatement.close();
				
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
			
			try {
				
				if(rs != null)
					rs.close();
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
public void update(Connection con, int presentation_id, int booked_company_id, int booked_room_id, String  start_time, String end_time) {
		
		PreparedStatement pstatement = null;
		
		//PreparedStatement pStatement = null;
		
		try {
			
			String query = "UPDATE presentation SET presentation_id=?, booked_company_id=?, booked_room_id=?,start_time=?,  end_time=? WHERE presentation_id=?";
			pstatement = con.prepareStatement(query);
			
			pstatement.setInt(1, presentation_id );
			pstatement.setInt(2, booked_company_id);
			pstatement.setInt(3, booked_room_id);
			pstatement.setString(4,  start_time);
			pstatement.setString(5, end_time);
			pstatement.setInt(6, presentation_id );
			
			int executeUpdate = pstatement.executeUpdate();
			
			if(executeUpdate >0) {
				
				System.out.println("Data Updated Successfully");
			}
			
			else
				
			{
				System.out.println("Failed to Update data");
			}
			
					
					
		}
		
		catch(Exception se) {
			
			se.printStackTrace();
		}
		
		finally 
		{
			try {
			if(pstatement != null)
			{
				pstatement.close();
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}

public void delete(Connection con, int presentation_id) {
	
	PreparedStatement pStatement = null;
	
	try {
		
	String query = "DELETE from presentation WHERE  presentation_id =?";
	
	pStatement = con.prepareStatement(query);
	pStatement.setInt(1, presentation_id);
	
	
	

	int executeUpdate = pStatement.executeUpdate();
	if (executeUpdate > 0) {
		System.out.println("data deleted successfully: " + executeUpdate);
	} else {
		System.out.println("failed to delete data: " + executeUpdate);
	}
} catch (SQLException se) {
	se.printStackTrace();
} catch (Exception e) {
	System.out.println(e);
} finally {
	try {
		if (pStatement != null) {
			pStatement.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
	
	
}
	

