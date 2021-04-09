package org.la.student.aqsa.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCtwo {
	public static void main(String[] args) {
		
		JDBCtwo jdbc = new JDBCtwo();
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC","root","root");
			if(con!=null) {
				System.out.println("Connection Succesfull");
				
				//jdbc.read(con);
				//jdbc.create(con, 0, null, 0);
				//jdbc.update(con,"hini", 21,4);
				//jdbc.read(con);
				//jdbc.delete(con, 1);
				//jdbc.read(con);
				//jdbc.create(con, 1, "amit", 12);
				//jdbc.read(con);
				jdbc.update(con, "mukesh",15 , 4);
				jdbc.read(con);
			}
			else {
				System.out.println("Connection Unsuccesfull");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
					con.close();
				}
			catch(SQLException e ) {
				e.printStackTrace();
			}
			}
		}
	
	
	//read operation
	public void read(Connection con) {
	
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from student";
			  ps = con.prepareStatement(query);
			  rs = ps.executeQuery();
			  while(rs.next()) {
				  System.out.println(rs.getInt(1) +"  "+rs.getString(2)+"  "+rs.getInt(3));
			  }
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
		
			try {
				if(ps!=null) {
					ps.close();
				}
			}
			catch(SQLException e ) {
				e.getStackTrace();
			}
			
			try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch(SQLException e) {
				e.getStackTrace();
			}
		}
	
	}
	
	//  create operation
	public void create(Connection con,int id , String name, int age ) {
		
		PreparedStatement ps = null;
		try {
			String query = "INSERT INTO student(idstudent,name, age) VALUES (?, ?, ?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setInt(3, age);
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("Data Created Succesfully");
			}
			else {
				System.out.println("Not Created Succesfully");
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try{
				if(ps!=null) {
			
				ps.close();
			}
			}
			catch(SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		
		
	}
	
	
	//update operation
	public void update(Connection con, String name,int age,int id) {
		
		PreparedStatement ps = null;
		try {
			String query = "UPDATE student SET  name=?, age=? WHERE idstudent=?";
		     ps = con.prepareStatement(query);
		     ps.setString(1, name);
		     ps.setInt(2,age);
		     ps.setInt(3, id);
		     
		    int executeUpdate = ps.executeUpdate();
		     if(executeUpdate>0) {
		    	 System.out.println("Updated"+executeUpdate);
		     }
		     else
		    	 System.out.println("not updated"+executeUpdate);
		    
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}
			catch(SQLException e) {
				e.getStackTrace();
			}
		}
	}
	
	// delete operation
	public void delete(Connection con,int id) {
		PreparedStatement ps = null;
		try {
			String query = "Delete from student where idstudent = ?";
			ps= con.prepareStatement(query);
			ps.setInt(1, id);
			
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Deleted");
			}
			else {
				System.out.println("Not deleted");
			}
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
				}
				
			}
			catch(SQLException e) {
				e.getStackTrace();
			}
		}
		
		
		
	}
	
	}

