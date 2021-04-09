package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCompany {

	public static void main(String[] args) {
		
		JDBCCompany jdbc = new JDBCCompany();
		
		Connection con = null;
		
		try { 
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
			
			if(con != null) {
				
				System.out.println("Connection successful");
				
				jdbc.read(con,2);
				//jdbc.create(con, "Spp","Agency" , 25);
				//jdbc.update(con, "Ibrahim", "Airways", 12, 2);
				jdbc.delete(con, 25);
			}
			
			else
			{
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
	
	public void read(Connection con, int company_id) {
		
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		
		
		try {
			
			String query = "Select * from company where company_id >= ? ";
			pstatement = con.prepareStatement(query);
			pstatement.setInt(1, company_id);
			
			rs = pstatement.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
			}
		}
		
		 catch (Exception e) {
				System.out.println(e);
			} 
		
		finally {
				try {
					if (pstatement != null) {
						pstatement.close();
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
	
	public void create( Connection con, String name, String description, int primary_contact_attendee_id ) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query = " INSERT INTO company(name, description, primary_contact_attendee_id) VALUES (?,?,?)";
			
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
			pStatement.setString(2, description);
			pStatement.setInt(3, primary_contact_attendee_id);
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate >0) {
				
				System.out.println("Data Created Succesfully"+ executeUpdate);
			}
			
			else {
				
				System.out.println("Failed to insert data"+ executeUpdate);
			}
		}
		
		catch(Exception es) {
			
			es.printStackTrace();
		}
		
		finally {
			try {
			if(pStatement != null) {
				
				pStatement.close();
			}
			}
			
			catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
	}
	
public void update( Connection con, String name, String description, int primary_contact_attendee_id, int company_id ) {
		
		PreparedStatement pStatement = null;
		
		try {
			
			String query = " Update company SET name=?, description=?, primary_contact_attendee_id=? WHERE company_id =?";
			
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
			pStatement.setString(2, description);
			pStatement.setInt(3, primary_contact_attendee_id);
			pStatement.setInt(4, company_id);
			
			
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate >0) {
				
				System.out.println("Data Updated Succesfully"+ executeUpdate);
			}
			
			else {
				
				System.out.println("Failed to Update data"+ executeUpdate);
			}
		}
		
		catch(Exception es) {
			
			es.printStackTrace();
		}
		
		finally {
			try {
			if(pStatement != null) {
				
				pStatement.close();
			}
			}
			
			catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
	}


public void delete(Connection con, int primary_contact_attendee_id) {

	PreparedStatement pStatement = null;

	try {
		String query = "DELETE FROM company WHERE primary_contact_attendee_id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, primary_contact_attendee_id);
		int executeUpdate = pStatement.executeUpdate();
		if (executeUpdate > 0) {
			System.out.println("data deleted successfully: " + executeUpdate);
		} else {
			System.out.println("failed to delete: " + executeUpdate);
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


