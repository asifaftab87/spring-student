package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.tahir.jdbc.model.Employee1;
import org.la.student.tahir.jdbc.model.Room;
import org.la.student.tahir.jdbc.model.SalariedEmployee;

public class SalariedEmployeeRepository {
	

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
	

	public static List<SalariedEmployee> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<SalariedEmployee> SEmpList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM salaried_employee");
			while(rs.next()) {
				
				SalariedEmployee SEmp = new SalariedEmployee();
				
				SEmp.setId(rs.getInt(1));
				SEmp.setAnnualSalary(rs.getInt(2));
				SEmp.setEmployeeId(rs.getInt(3));
				
				SEmpList.add(SEmp);
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
		return SEmpList;
	}
	
	
public static SalariedEmployee findById(int id){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		SalariedEmployee SEmp = null;

		try {
			String query = "SELECT * FROM salaried_employee WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, id);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				SEmp = new SalariedEmployee();
				SEmp.setId(rs.getInt(1));
				SEmp.setAnnualSalary(rs.getInt(2));
				SEmp.setEmployeeId(rs.getInt(3));
				
				
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
		return SEmp;
	}


public static SalariedEmployee findByAnnualSalary(int annualSalary){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	SalariedEmployee SEmp = null;

	try {
		String query = "SELECT * FROM salaried_employee WHERE annual_salary=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, annualSalary);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			SEmp = new SalariedEmployee();
			SEmp.setId(rs.getInt(1));
			SEmp.setAnnualSalary(rs.getInt(2));
			SEmp.setEmployeeId(rs.getInt(3));
			
			
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
	return SEmp;
}


public static SalariedEmployee findByEmployeeId(int employeeId){
	
	if(con==null) {
		return null;
	}
	
	ResultSet rs = null;
	PreparedStatement pStatement = null;
	SalariedEmployee SEmp = null;

	try {
		String query = "SELECT * FROM salaried_employee WHERE employee_id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, employeeId);
		
		rs = pStatement.executeQuery();
		
		if(rs.next()) {
			SEmp = new SalariedEmployee();
			SEmp.setId(rs.getInt(1));
			SEmp.setAnnualSalary(rs.getInt(2));
			SEmp.setEmployeeId(rs.getInt(3));
			
			
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
	return SEmp;
}

public static void create(SalariedEmployee sEmployee) {
	
	PreparedStatement pStmt = null;
	
	try {
		
		String sql = "INSERT INTO salaried_employee VALUES(?,?,?)";
		
		pStmt = con.prepareStatement(sql);
		
		pStmt.setInt(1, (int)Math.random());
		
		pStmt.setInt(2, sEmployee.getAnnualSalary());
		pStmt.setInt(3, sEmployee.getEmployeeId());
		
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
		String query = "UPDATE salaried_employee SET annual_salary=20000 WHERE id=1";
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
