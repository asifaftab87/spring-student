package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.tahir.jdbc.model.Attendee;

	


public class AttendeeRepository {

	

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
	
	

	public static List<Attendee> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Attendee> attlist = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM attendee");
			while(rs.next()) {
				Attendee attendee = new Attendee();
				
				attendee.setAttendeeId(rs.getInt(1));
				attendee.setFirstName(rs.getString(2));
				attendee.setLastName(rs.getString(3));
				attendee.setPhone(rs.getString(4));
				attendee.setEmail(rs.getString(5));
				attendee.setVip(rs.getString(6));
				
				attlist.add(attendee);
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
		return attlist;
	}
	
	
public static Attendee findByAttendeeId(int attendeeId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Attendee attendee  = null;

		try {
			String query = "SELECT * FROM attendee WHERE attendee_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, attendeeId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				 attendee = new Attendee();
				
				attendee.setAttendeeId(rs.getInt(1));
				attendee.setFirstName(rs.getString(2));
				attendee.setLastName(rs.getString(3));
				attendee.setPhone(rs.getString(4));
				attendee.setEmail(rs.getString(5));
				attendee.setVip(rs.getString(6));
				
				
				
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
		return  attendee ;
	}

public static List<Attendee> findByFirstName(String firstname){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Attendee> attList = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM attendee WHERE firstname=?";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, firstname);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			Attendee attendee = new Attendee();
			attendee.setAttendeeId(rs.getInt(1));
			attendee.setFirstName(rs.getString(2));
			attendee.setLastName(rs.getString(3));
			attendee.setPhone(rs.getString(4));
			attendee.setEmail(rs.getString(5));
			attendee.setVip(rs.getString(6));
			
			attList.add(attendee);
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
	return attList;
	
}


public static List<Attendee> findByLastName(String lastname){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Attendee> attList = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM attendee WHERE lastname=?";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, lastname);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			Attendee attendee = new Attendee();
			attendee.setAttendeeId(rs.getInt(1));
			attendee.setFirstName(rs.getString(2));
			attendee.setLastName(rs.getString(3));
			attendee.setPhone(rs.getString(4));
			attendee.setEmail(rs.getString(5));
			attendee.setVip(rs.getString(6));
			
			attList.add(attendee);
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
	return attList;
	
}

public static Attendee findByPhone(String phone){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	Attendee attendee  = null;

	try {
		String query = "SELECT * FROM attendee WHERE phone=?";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, phone);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			 attendee = new Attendee();
			
			attendee.setAttendeeId(rs.getInt(1));
			attendee.setFirstName(rs.getString(2));
			attendee.setLastName(rs.getString(3));
			attendee.setPhone(rs.getString(4));
			attendee.setEmail(rs.getString(5));
			attendee.setVip(rs.getString(6));
			
			
			
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
	return  attendee ;
}

public static Attendee findByEmail(String email){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	Attendee attendee  = null;

	try {
		String query = "SELECT * FROM attendee WHERE email=?";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, email);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			 attendee = new Attendee();
			
			attendee.setAttendeeId(rs.getInt(1));
			attendee.setFirstName(rs.getString(2));
			attendee.setLastName(rs.getString(3));
			attendee.setPhone(rs.getString(4));
			attendee.setEmail(rs.getString(5));
			attendee.setVip(rs.getString(6));
			
			
			
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
	return  attendee ;
}

public static Attendee findVip(String vip){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	Attendee attendee  = null;

	try {
		String query = "SELECT * FROM attendee WHERE vip=?";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, vip);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			 attendee = new Attendee();
			
			attendee.setAttendeeId(rs.getInt(1));
			attendee.setFirstName(rs.getString(2));
			attendee.setLastName(rs.getString(3));
			attendee.setPhone(rs.getString(4));
			attendee.setEmail(rs.getString(5));
			attendee.setVip(rs.getString(6));
			
			
			
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
	return  attendee ;
}


public static void create(Attendee attendee) {
	
	PreparedStatement pStmt = null;
	
	try {
		
		String sql = "INSERT INTO attendee VALUES(?,?,?,?,?,?)";
		
		pStmt = con.prepareStatement(sql);
		
		pStmt.setInt(1, (int)Math.random());
		
		pStmt.setString(2,attendee.getFirstName());
		pStmt.setString(3,attendee.getLastName());
		pStmt.setString(4,attendee.getPhone());
		pStmt.setString(5,attendee.getEmail());
		pStmt.setString(6,attendee.getVip());
		
		
		
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
		String query = "UPDATE attendee SET first_name='Farhan' WHERE attendee_id=1";
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
