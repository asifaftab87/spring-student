package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PresentationAttendance {

	public static void main(String[] args) {
		
		PresentationAttendance pAttendance = new PresentationAttendance();
		
		 
		 //PreparedStatement pStatement = null;
		 
		 Connection con = null;
			
			try { 
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
				
				if(con != null) {
					
					System.out.println("Connection successful");
					
					pAttendance.create(con, 3, 11, 21);
					pAttendance.update(con, 1, 14, 24);
					pAttendance.delete(con, 2);
					pAttendance.read(con);
					
					
					
				
					
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
	
public void read(Connection con) {
		
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		try {
			
			String query ="SELECT * FROM presentation_attendance ";
			
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

	
	public void create(Connection con, int ticket_id, int presentation_id, int attendee_id) {

		PreparedStatement pStatement = null;

		try {

			String query = "INSERT INTO presentation_attendance (ticket_id, presentation_id, attendee_id) VALUES ( ?,?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1,ticket_id );
			pStatement.setInt(2, presentation_id);
			pStatement.setInt(3, attendee_id);
			
			
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
		
	public void update(Connection con, int ticket_id, int presentation_id, int attendee_id) {

		PreparedStatement pStatement = null;

		try {

			String query = "UPDATE  presentation_attendance SET ticket_id=?, presentation_id=?, attendee_id=? WHERE ticket_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1,ticket_id );
			pStatement.setInt(2, presentation_id);
			pStatement.setInt(3, attendee_id);
			pStatement.setInt(4,ticket_id );
			
			
			int executeUpdate = pStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data updated successfully: " + executeUpdate);
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
		
	public void delete(Connection con, int ticket_id) {

		PreparedStatement pStatement = null;

		try {

			String query = "DELETE from Presentation_attendance WHERE ticket_id =?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, ticket_id);
			
			
			
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
