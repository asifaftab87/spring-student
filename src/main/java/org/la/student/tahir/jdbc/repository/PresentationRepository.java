package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.tahir.jdbc.model.Presentation;

public class PresentationRepository {
	


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
	
	public static List<Presentation> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Presentation> prenlist = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Presentation");
			while(rs.next()) {
				
				Presentation presentation = new Presentation();
				
				presentation.setPresentationId(rs.getInt(1));
				presentation.setBookedCompanyId(rs.getInt(2));
				presentation.setBookedRoomId(rs.getInt(3));
				presentation.setStartTime(rs.getString(4));
				presentation.setEndTime(rs.getString(5));
				
				prenlist.add(presentation);
				
				
				
				
				
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
		return prenlist;
	}
	
public static Presentation findByPresentationId(int presentationId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Presentation presentation = null;

		try {
			String query = "SELECT * FROM presentation WHERE presentation_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, presentationId);
			
	
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				presentation = new Presentation();
				
				presentation.setPresentationId(rs.getInt(1));
				presentation.setBookedCompanyId(rs.getInt(2));
				presentation.setBookedRoomId(rs.getInt(3));
				presentation.setStartTime(rs.getString(4));
				presentation.setEndTime(rs.getString(5));
				
				
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
		return presentation;
	}

public static List<Presentation> findByBookedCompanyId(int bookedCompanyId){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Presentation> pList = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM presentation WHERE booked_company_id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, bookedCompanyId);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			
			
			Presentation presentation = new Presentation();
			presentation.setPresentationId(rs.getInt(1));
			presentation.setBookedCompanyId(rs.getInt(2));
			presentation.setBookedRoomId(rs.getInt(3));
			presentation.setStartTime(rs.getString(4));
			presentation.setEndTime(rs.getString(5));
			
			pList.add(presentation);
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
	return pList;
}



public static List<Presentation> findByBookedRoomId(int bookedRoomId){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Presentation> pList = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM presentation WHERE booked_room_id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, bookedRoomId);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			
			
			Presentation presentation = new Presentation();
			presentation.setPresentationId(rs.getInt(1));
			presentation.setBookedCompanyId(rs.getInt(2));
			presentation.setBookedRoomId(rs.getInt(3));
			presentation.setStartTime(rs.getString(4));
			presentation.setEndTime(rs.getString(5));
			
			pList.add(presentation);
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
	return pList;
}


	
	
	public static void create(Presentation presentation) {
		
		PreparedStatement pStmt = null;
		
		try {
			
			String sql = "INSERT INTO presentation VALUES(?,?,?,?,?)";
			
			pStmt = con.prepareStatement(sql);
			
			pStmt.setInt(1, (int)Math.random());
		//	pStmt.setInt(2, presentation.getPresentationId());
			pStmt.setInt(2, presentation.getBookedCompanyId());
			pStmt.setInt(3, presentation.getBookedRoomId());
			pStmt.setString(4, presentation.getStartTime());
			pStmt.setString(5, presentation.getEndTime());
			
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
			String query = "UPDATE presentation SET presentationId=2 WHERE bookedCompanyId=1";
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
