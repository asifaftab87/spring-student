package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class City {

	public static void main(String[] args) {

		City city = new City();
		

		Connection con = null;
		
		try { 
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
			
			if(con != null) {
				
				System.out.println("Connection successful");
				
				city.read(con);
				//city.create(con, "Selangor", 12);
				//city.update(con," KL", 12);
				//city.delete(con, 12);
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
			String query = " select * from city ";
			pStatement = con.prepareStatement(query);
		
			
			rs = pStatement.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) );
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
	
	public void create(Connection con, String city, int id) {

		PreparedStatement pStatement = null;

		try {

			String query = "INSERT INTO city(city, id) VALUES (?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, city);
			pStatement.setInt(2, id);
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

	public void update(Connection con, String city, int id) {

		PreparedStatement pStatement = null;

		try {

			String query = "UPDATE city SET city=?, id=? WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, city);
			pStatement.setInt(2, id);
			pStatement.setInt(3, id);
			int executeUpdate = pStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data Updated successfully: " + executeUpdate);
			} else {
				System.out.println("failed to Update data: " + executeUpdate);
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
	
	public void delete(Connection con, int id) {

		PreparedStatement pStatement = null;

		try {

			String query = "DELETE FROM city WHERE id=?";
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1, id);
			
			int executeUpdate = pStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("data Deleted successfully: " + executeUpdate);
			} else {
				System.out.println("failed to Delete data: " + executeUpdate);
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
	
			
			


