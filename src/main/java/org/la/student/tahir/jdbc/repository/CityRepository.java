package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.asif.jdbc.model.Employee;
import org.la.student.tahir.jdbc.model.City;

public class CityRepository {


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
	
	
	
	public static List<City> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<City> empList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM city");
			while(rs.next()) {
				
				City city = new City();
				
				city.setId(rs.getInt(1));
				city.setCity(rs.getString(2));
				
				
				empList.add(city);
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
		return empList;
	}
	
	
	public static City findById(int id){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		City city = null;

		try {
			String query = "SELECT * FROM city WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				city = new City();
				city.setId(rs.getInt(1));
				city.setCity(rs.getString(2));
				
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
		return city;
	}
	
public static List<City> findByCity(String city){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		List<City> city1 = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM city WHERE city=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, city);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				
				City cit = new City();
				
				cit.setId(rs.getInt(1));
				cit.setCity(rs.getString(2));
				
				city1.add(cit);
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
		return city1;
	}

public static void create(City city) {
	
	PreparedStatement pStmt = null;
	
	try {
		
		String sql = "INSERT INTO city VALUES(?,?)";
		
		pStmt = con.prepareStatement(sql);
		
		pStmt.setInt(1, (int)Math.random());
		pStmt.setString(2, city.getCity());
		
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
		String query = "UPDATE city SET city='Yerwa' WHERE id=1";
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
