package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Room {

	public static void main(String[] args) {
		Room room = new Room();
		

		Connection con = null;
		
		try { 
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
			
			if(con != null) {
				
				System.out.println("Connection successful");
				
			
				room.read(con);
				//room.create(con, 1, "A", 2);
				//room.update(con, 1, "B10", 20);
				room.delete(con, 1);
			
				
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
		String query = " select * from room ";
		pStatement = con.prepareStatement(query);
	
		
		rs = pStatement.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
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

public void create(Connection con, int room_id, String floor_num, int seat_capacity) {

	PreparedStatement pStatement = null;

	try {

		String query = "INSERT INTO room(room_id,floor_num, seat_capacity ) VALUES (?, ?, ?)";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, room_id);
		pStatement.setString(2, floor_num);
		pStatement.setInt(3, seat_capacity);
		
		
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

public void update(Connection con, int room_id, String floor_num, int seat_capacity) {

	PreparedStatement pStatement = null;

	try {

		String query = "UPDATE room SET room_id=?, floor_num=?, seat_capacity=? WHERE room_id =?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, room_id);
		pStatement.setString(2, floor_num);
		pStatement.setInt(3, seat_capacity);
		pStatement.setInt(4, room_id);
		
		
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

public void delete(Connection con, int room_id) {

	PreparedStatement pStatement = null;

	try {

		String query = "DELETE from room  WHERE room_id =?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, room_id);
		
		
		
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