package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Attendee {

	public static void main(String[] args) {
		 Attendee attendee = new Attendee();
		 
		 PreparedStatement pStatement = null;
		 
		 Connection con = null;
			
			try { 
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
				
				if(con != null) {
					
					System.out.println("Connection successful");
					
					//attendee.create(con, 1, "Tahir", "DAlori", "+2348039588134", "tahirdalori12gmail.com", "Vip");
					attendee.update(con, 1," Tahir"," Dalori", "+2348039588134", "tahirdalori1@gmail", "vip");
					attendee.delete(con, 2);
					
				
					
				} else {
					System.out.println("failed to connect");
				}
		}
			

			catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	public void create(Connection con,int attendee_id, String first_name, String last_name, String phone, String email, String vip) {

		PreparedStatement pStatement = null;

		try {

			String query = "INSERT INTO attendee(attendee_id, first_name, last_name, phone, email, vip ) VALUES ( ?,?, ?,?,?,?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1,attendee_id );
			pStatement.setString(2, first_name);
			pStatement.setString(3, last_name);
			pStatement.setString(4, phone);
			pStatement.setString(5, email);

			pStatement.setString(6, vip);
			
			
			
			int executeUpdate = pStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data created successfully: " + executeUpdate);
			} else {
				System.out.println("failed to insert data: " + executeUpdate);
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
		
	public void update(Connection con,int attendee_id, String first_name, String last_name, String phone, String email, String vip) {

		PreparedStatement pStatement = null;

		try {

			String query = "UPDATE attendee SET attendee_id=?, first_name=?, last_name=?, phone=?, email=?, vip=?  WHERE attendee_id =?  ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1,attendee_id );
			pStatement.setString(2, first_name);
			pStatement.setString(3, last_name);
			pStatement.setString(4, phone);
			pStatement.setString(5, email);
			pStatement.setString(6, vip);
			pStatement.setInt(7,attendee_id );
			
			
			
			int executeUpdate = pStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data Updated successfully: " + executeUpdate);
			} else {
				System.out.println("failed to update data: " + executeUpdate);
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
		
	public void delete(Connection con, int attendee_id) {

		PreparedStatement pStatement = null;

		try {

			String query = "DELETE from attendee WHERE attendee_id =?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee_id);
			
			
			
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

		

		

	}}

