package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.la.student.tahir.jdbc.model.Company;

public class CompanyRepository {


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
	
	public static List<Company> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Company> comlist = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM company");
			while(rs.next()) {
				
				Company company = new Company();
				
				company.setCompanyId(rs.getInt(1));
				company.setName(rs.getString(2));
				company.setDescription(rs.getString(3));
				company.setPrimaryContactAttendeeId(rs.getInt(4));
				
				
				comlist.add(company);
				
				
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
		return comlist;
	}
	
	public static Company findById(int companyId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Company company = null;

		try {
			String query = "SELECT * FROM company WHERE company_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, companyId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				
				company = new Company();
				company.setCompanyId(rs.getInt(1));
				company.setName(rs.getString(2));
				company.setDescription(rs.getString(3));
				company.setPrimaryContactAttendeeId(rs.getInt(4));
				
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
		return company;
	}
	
public static List<Company> findByName(String name){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		List<Company> comList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM employee1 WHERE name=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				
				
				Company company = new Company();
				company.setCompanyId(rs.getInt(1));
				company.setName(rs.getString(2));
				company.setDescription(rs.getString(3));
				company.setPrimaryContactAttendeeId(rs.getInt(4));
				comList.add(company);
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
		return comList;
	}


public static List<Company> findByDescription(String description){
	
	if(con==null) {
		return null;
	}
	PreparedStatement pStatement = null;
	ResultSet rs = null;
	
	List<Company> comList = new ArrayList<>();
	
	try {
		String query = "SELECT * FROM company WHERE description=?";
		pStatement = con.prepareStatement(query);
		pStatement.setString(1, description);
		
		rs = pStatement.executeQuery();
		while(rs.next()) {
			
			
			Company company = new Company();
			company.setCompanyId(rs.getInt(1));
			company.setName(rs.getString(2));
			company.setDescription(rs.getString(3));
			company.setPrimaryContactAttendeeId(rs.getInt(4));
			comList.add(company);
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
	return comList;
}

public static Company findByPrimaryContactAttendeeId(int primaryContactAttendeeId){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	Company company = null;

	try {
		String query = "SELECT * FROM company WHERE primary_contact_attendeeId=?";
		pStatement = con.prepareStatement(query);
		pStatement.setLong(1, primaryContactAttendeeId);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			
			company = new Company();
			company.setCompanyId(rs.getInt(1));
			company.setName(rs.getString(2));
			company.setDescription(rs.getString(3));
			company.setPrimaryContactAttendeeId(rs.getInt(4));
			
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
	return company;
}

public static void create(Company company) {
	
	PreparedStatement pStmt = null;
	
	try {
		
		String sql = "INSERT INTO company VALUES(?,?,?,?)";
		
		pStmt = con.prepareStatement(sql);
		
	
		
		pStmt.setInt(1, (int)Math.random());
		pStmt.setString(2, company.getName());
		pStmt.setString(3, company.getDescription());
		pStmt.setInt(4, company.getPrimaryContactAttendeeId());
		
		
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
			System.out.println(se.getMessage());
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
		String query = "UPDATE company SET name='Farhan' WHERE company_Id= 1 ";
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
