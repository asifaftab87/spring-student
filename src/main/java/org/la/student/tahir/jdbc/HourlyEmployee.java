package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HourlyEmployee {

	public static void main(String[] args) {
		
		HourlyEmployee hEmployee = new HourlyEmployee();
		
		Connection con = null;
		
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone = UTC", "root", "root");
			
			if(con != null) {
				System.out.println("Connected Successfully");
				
				hEmployee.create(con, 4, 50000, 6001);
				hEmployee.update(con, 1, 20000, 6001);
				hEmployee.delete(con, 2);
				hEmployee.read(con);
				
			}
			
			else {
				System.out.println("Failed to connect");
			}
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			try {
				con.close();
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void create(Connection con, int id, int hourly_rate, int employee_id) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query ="INSERT INTO hourly_employee  (id, hourly_rate, employee_id ) VALUES (?,?,?)";
			
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1, id);
			pStatement.setInt(2, hourly_rate);
			pStatement.setInt(3, employee_id);
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate >0) {
				
				System.out.println("Data Created Successfully");
			}
			
			else {
				
				System.out.println("Failed to create Data");
			}
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			try {
				
				if(pStatement != null) {
					pStatement.close();
				}
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
public void read(Connection con) {
		
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		try {
			
			String query ="SELECT * FROM hourly_employee ";
			
			pStatement = con.prepareStatement(query);
			
			rs = pStatement.executeQuery();
			
			while(rs.next()){
				
				System.out.println(rs.getInt(1) +" "+ rs.getInt(2)+" "+ rs.getInt(3));
				
			}
			
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			try {
				
				if(pStatement != null) {
					pStatement.close();
				}
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
			try {
				if(rs != null) {
					rs.close();
				}
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}


public void update(Connection con, int id, int hourly_rate, int employee_id) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query ="UPDATE  hourly_employee SET id=?, hourly_rate=?, employee_id=? WHERE id=?";
			
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1, id);
			pStatement.setInt(2, hourly_rate);
			pStatement.setInt(3, employee_id);
			pStatement.setInt(4, id);
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate >0) {
				
				System.out.println("Data updated Successfully");
			}
			
			else {
				
				System.out.println("Failed to update Data");
			}
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			try {
				
				if(pStatement != null) {
					pStatement.close();
				}
			}
			
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

public void delete(Connection con, int id) {
	
	PreparedStatement pStatement = null;
	
	try {
		
		String query ="DELETE FROM  hourly_employee WHERE id=?";
		
		pStatement = con.prepareStatement(query);
		
		pStatement.setInt(1, id);
		
		
		int executeUpdate = pStatement.executeUpdate();
		
		if(executeUpdate >0) {
			
			System.out.println("Data deleted Successfully");
		}
		
		else {
			
			System.out.println("Failed to delete Data");
		}
		
	}
	
	catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	finally {
		
		try {
			
			if(pStatement != null) {
				pStatement.close();
			}
		}
		
		catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
}

}
