package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {

	public static void main(String[] args) {

		Employee employee = new Employee();
		
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone= UTC", "root", "root");
			
			if(con != null) {
				
				System.out.println("Connected successfully");
				employee.create(con, 3, "Tahir", 11, "01-01-2021", 31);
				employee.update(con, 1, "Asif", 12, "01-02-2021", 32);
				employee.delete(con, 2);
				employee.read(con);
				
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
	
	
public void read(Connection con) {
		
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		try {
			
			String query ="SELECT * FROM employee ";
			
			pStatement = con.prepareStatement(query);
			
			rs = pStatement.executeQuery();
			
			while(rs.next()){
				
				System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+ rs.getInt(3)+" "+ rs.getString(4)+" "+ rs.getInt(5));
				
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

	
	
	
	public void create( Connection con, int id, String employee_name, int employee_num, String date_hired, int city_id) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query = "INSERT INTO employee ( id, employee_name, employee_num, date_hired, city_id) VALUES (?,?,?,?,?)";
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1,id );
			pStatement.setString(2,employee_name );
			pStatement.setInt(3, employee_num);
			pStatement.setString(4, date_hired);
			pStatement.setInt(5, city_id);
			
			int excuteUpdatable = pStatement.executeUpdate();
			
			if(excuteUpdatable >0) {
				
				System.out.println("Data created Successfully");
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
	

	public void update( Connection con, int id, String employee_name, int employee_num, String date_hired, int city_id) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query = "UPDATE employee SET id=?, employee_name=?, employee_num=?, date_hired=?, city_id=? WHERE id=?";
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1,id );
			pStatement.setString(2,employee_name );
			pStatement.setInt(3, employee_num);
			pStatement.setString(4, date_hired);
			pStatement.setInt(5, city_id);
			pStatement.setInt(6,id );
			
			int excuteUpdatable = pStatement.executeUpdate();
			
			if(excuteUpdatable >0) {
				
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
	
public void delete( Connection con, int id) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query = "DELETE from employee WHERE id=?";
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1,id );
			
			
			int excuteUpdatable = pStatement.executeUpdate();
			
			if(excuteUpdatable >0) {
				
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
