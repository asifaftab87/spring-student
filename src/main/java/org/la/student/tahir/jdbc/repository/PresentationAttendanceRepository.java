package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.tahir.jdbc.model.PresentationAttendance;


public class PresentationAttendanceRepository {

	


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
	

	public static List<PresentationAttendance> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<PresentationAttendance> plist = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM presentation_attendance");
			while(rs.next()) {
				
				PresentationAttendance pt = new PresentationAttendance();
				
				pt.setPresentationId(rs.getInt(1));
				pt.setTicketId(rs.getInt(2));
				pt.setAttendeeId(rs.getInt(3));
				
				plist.add(pt);
				
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
		return plist;
	}
	
public static PresentationAttendance findByTicketId(int ticketId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		
		PresentationAttendance pt = null;
		try {
			String query = "SELECT * FROM presentation_attendance WHERE ticke_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, ticketId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				pt = new PresentationAttendance();
			
				pt.setPresentationId(rs.getInt(1));
				pt.setTicketId(rs.getInt(2));
				pt.setAttendeeId(rs.getInt(3));
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
		return pt;
	}

	public static PresentationAttendance findByPresentationId(int presentationId){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	
	PresentationAttendance pt = null;
	try {
		String query = "SELECT * FROM presentation_attendance WHERE presentation_id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, presentationId);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			pt = new PresentationAttendance();
		
			pt.setPresentationId(rs.getInt(1));
			pt.setTicketId(rs.getInt(2));
			pt.setAttendeeId(rs.getInt(3));
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
	return pt;
}

	public static PresentationAttendance findByAttendeeId(int attendeeId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		
		PresentationAttendance pt = null;
		try {
			String query = "SELECT * FROM presentation_attendance WHERE attendee_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendeeId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				pt = new PresentationAttendance();
			
				pt.setPresentationId(rs.getInt(1));
				pt.setTicketId(rs.getInt(2));
				pt.setAttendeeId(rs.getInt(3));
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
		return pt;
	}



public static void create(PresentationAttendance pt) {
	
	PreparedStatement pStmt = null;
	
	try {
		
		String sql = "INSERT INTO presentation_attendance VALUES(?,?,?)";
		
		pStmt = con.prepareStatement(sql);
		
		pStmt.setInt(1, (int)Math.random());
		pStmt.setInt(2, pt.getPresentationId());
		pStmt.setInt(3, pt.getAttendeeId());
		
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
		String query = "UPDATE presentation_attendance SET attendee_id=10 WHERE ticket_id=1";
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
