package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.la.student.tahir.jdbc.model.Room;

public class RoomRepository {


	static Connection con = null;

	public static void connectionOpen() {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC","root","root");
			if(con!=null) {
				System.out.println("connection to mysql successful");
			}
			else
				System.out.println("failed to connect to mysql");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static List<Room> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Room> roomlist = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM room");
			while(rs.next()) {
				
				Room room = new Room();
				
				//room = new Room();
				room.setRoomId(rs.getInt(1));
				room.setFloorNum(rs.getInt(2));
				room.setSeatCapacity(rs.getInt(3));
				
				
				roomlist.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
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
		return roomlist;
	}
	
public static Room findByRoomId(int roomId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Room room = null;

		try {
			String query = "SELECT * FROM room WHERE room_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, roomId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				room = new Room();
				room.setRoomId(rs.getInt(1));
				room.setFloorNum(rs.getInt(2));
				room.setSeatCapacity(rs.getInt(3));
				
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return room;
	}

public static List<Room> findByfloorNum(int room){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Room> roomlist = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM room WHERE room_id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, room);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			
			Room rom = new Room();
			rom.setRoomId(rs.getInt(1));
			rom.setFloorNum(rs.getInt(2));
			rom.setSeatCapacity(rs.getInt(3));
			
			roomlist.add(rom);
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
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
	return roomlist;
}


public static List<Room> findByseatCapacity(int room){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Room> roomlist = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM room WHERE seat_capacity=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, room);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			
			Room rom = new Room();
			rom.setRoomId(rs.getInt(1));
			rom.setFloorNum(rs.getInt(2));
			rom.setSeatCapacity(rs.getInt(3));
			
			roomlist.add(rom);
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
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
	return roomlist;
}

public static void create(Room room) {
	
	PreparedStatement pStmt = null;
	
	try {
		
		String sql = "INSERT INTO room VALUES(?,?,?)";
		
		pStmt = con.prepareStatement(sql);
		
		pStmt.setInt(1, (int)Math.random());
		pStmt.setInt(2, room.getFloorNum());
		pStmt.setInt(3, room.getSeatCapacity());
		
		int executeUpdate = pStmt.executeUpdate();
		
		if(executeUpdate > 0) {
			System.out.println(executeUpdate + "data added successfully");
		}
		else {
			System.out.println("failed to add data");
		}
	}
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
	}
	finally {
			try {
				if (pStmt != null) {
					pStmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
	}
}


public static void update() {
	Statement stmt = null;
	try {
		stmt = con.createStatement();
		String query = "UPDATE room SET seat_capacity=10 WHERE roomId=1";
		int executeUpdate = stmt.executeUpdate(query);

		if (executeUpdate > 0) {
			System.out.println(executeUpdate + " updating data successful");
		} else {
			System.out.println("failed to update data");
		}
	} catch (SQLException se) {
		se.printStackTrace();
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

}
