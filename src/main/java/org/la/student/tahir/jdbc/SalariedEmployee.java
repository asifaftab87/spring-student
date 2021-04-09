package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalariedEmployee {

	public static void main(String[] args) {
		
		SalariedEmployee sEmployee = new SalariedEmployee();
		
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone= UTC", "root", "root");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone= UTC", "root", "root");
			if(con != null) {
				
				System.out.println("Connection  Successfull");
				
				sEmployee.create(con, 5, 12, 21);
				sEmployee.update(con, 2, 1300, 22);
				sEmployee.delete(con, 4);
				sEmployee.read(con);
				
			}
			
			else {
				System.out.println("Failed to Connect");
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
			
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	public void read(Connection con) {

		PreparedStatement pStatement = null;
		ResultSet rs = null;

		try {
			String query = " select * from salaried_employee ";
			pStatement = con.prepareStatement(query);
		
			
			rs = pStatement.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) );
			}
		} 
		
		catch (Exception e) {
			System.out.println(e);
		} 
		
		finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


public void create( Connection con, int id, int annual_salary, int employee_id) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query = "INSERT INTO salaried_employee (id, annual_salary, employee_id) VALUES (?,?,?)";
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1,id );
			pStatement.setInt(2,annual_salary );
			pStatement.setInt(3, employee_id);
			
			
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
		
	
	public void update(Connection con, int id, int annual_salary, int employee_id) {
		
		PreparedStatement pStatement = null;
		
		try {
		
		String query = " UPDATE salaried_employee SET id=?, annual_salary=?, employee_id=? WHERE id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, id);
		pStatement.setInt(2, annual_salary);
		pStatement.setInt(3, employee_id);
		pStatement.setInt(4, id);
		
		int executeUpdate = pStatement.executeUpdate();
		
		if(executeUpdate>0) {
			System.out.println("Data updated Successfully");
		}
		
		else {
			System.out.println("Failed to update Data");
		}
		
		
		
	}
	
		catch(Exception e) {
			//e.printStackTrace();
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
			
			String query = "DELETE from  salaried_employee WHERE id=?";
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


