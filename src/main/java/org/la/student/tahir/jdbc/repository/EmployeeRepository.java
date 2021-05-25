package org.la.student.tahir.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.tahir.jdbc.model.Employee;
import org.la.student.tahir.jdbc.model.Employee1;

public class EmployeeRepository {
	


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
	

	public static List<Employee> findAll(){
		if(con==null) {
			return null;
		}
		
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employee1");
			while(rs.next()) {
				
				Employee emp = new Employee();
			
				emp.setId(rs.getInt(1));
				emp.setCityId(rs.getInt(2));
				emp.setEmployeeName(rs.getString(3));
				emp.setEmployeeNum(rs.getInt(4));
				emp.setDateHired(rs.getString(5));
				
				
				empList.add(emp);
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
	

	
	public static Employee findById(int id){
	
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Employee emp = null;

		try {
			String query = "SELECT * FROM employee WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setCityId(rs.getInt(2));
				emp.setEmployeeName(rs.getString(3));
				emp.setEmployeeNum(rs.getInt(4));
				emp.setDateHired(rs.getString(5));
				
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
		return emp;
	}
	
	public static List<Employee> findByCityId(int cityId){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		List<Employee> empList = new ArrayList<>();

		try {
			String query = "SELECT * FROM employee WHERE city_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, cityId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setCityId(rs.getInt(2));
				emp.setEmployeeName(rs.getString(3));
				emp.setEmployeeNum(rs.getInt(4));
				emp.setDateHired(rs.getString(5));
				
				empList.add(emp);
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
		return empList;
	}
	
	public static List<Employee> findByEmployeeNum(int employeeNum){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		List<Employee> emplist = new ArrayList<>();

		try {
			String query = "SELECT * FROM employee WHERE employee_num=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, employeeNum);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setCityId(rs.getInt(2));
				emp.setEmployeeName(rs.getString(3));
				emp.setEmployeeNum(rs.getInt(4));
				emp.setDateHired(rs.getString(5));
				
				emplist.add(emp);
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
		return emplist;
	}
	
	public static void create(Employee employee) {
		
		PreparedStatement pStmt = null;
		
		try {
			
			String sql = "INSERT INTO employee VALUES(?,?,?,?,?)";
			
			pStmt = con.prepareStatement(sql);
			
			
			
			pStmt.setInt(1, (int)Math.random());
			pStmt.setInt(2, employee.getCityId());
			pStmt.setInt(3, employee.getEmployeeNum());
			pStmt.setString(4, employee.getEmployeeName());
			pStmt.setString(5, employee.getDateHired());
			
			
			
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
			String query = "UPDATE employee SET employee_name='Farhan' WHERE id= 1";
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
