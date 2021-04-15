package org.la.student.aqsa.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.la.student.aqsa.jdbc.model.Car;

public class CarRepository {	
	static Connection con = null;
	
	public static void connectionOpen()  {
		try {
		con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
		if(con!=null) {
			System.out.println("Connected");
			
		}
		else {
			System.out.print("Not Connected");
		}
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	
	
	// Create operation
	
	public static void create(Car car) {
		
		PreparedStatement ps = null;
		

     try {
		String query = "INSERT INTO car(carId,model,company,engine,color,type) VALUES(?,?,?,?,?,?)";
	    ps = con.prepareStatement(query);
		ps.setInt(1,car.getCarId());
		ps.setString(2,car.getModel());
		ps.setString(3, car.getCompany());
		ps.setString(4, car.getEngine());
		ps.setString(5, car.getColor());
		ps.setString(6, car.getType());
		
		int executeUpdate = ps.executeUpdate();
		
		if(executeUpdate!=0) {
			System.out.println("Data Created");
		}
		else {
			System.out.print("Data not Created");
		}
     }
     catch(SQLException e) {
    	 e.getStackTrace();
     }
     catch(Exception e ){
    	 e.getMessage();
     }
     finally {
    	 try {
    	 if(ps!=null) {
    		 ps.close();
    	   }
    	 }
    	 catch(SQLException e){
    		 e.getStackTrace();
    	 }
       }
	}
	public static List<Car> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Car> carlist =new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM car");
			while(rs.next()) {
				Car car = new Car();
				car.setCarId(rs.getInt(1));
				car.setModel(rs.getString(2));
				car.setCompany(rs.getString(3));
				car.setEngine(rs.getString(4));
				car.setColor(rs.getString(5));
				car.setType(rs.getString(6));
				carlist.add(car);
			}
		}
		 catch (SQLException e) {
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
		return carlist;	
	}
	
	public static Car findById(int id){
		
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Car car = new Car();

		try {
			String query = "SELECT * FROM car WHERE carId=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				
				car.setCarId(rs.getInt(1));
				car.setModel(rs.getString(2));
				car.setCompany(rs.getString(3));
				car.setEngine(rs.getString(4));
				car.setColor(rs.getString(5));
				car.setType(rs.getString(6));
				
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
		return car;
	}



	public static Car findByModel(String model) {
		if(con==null) {
			return null;
		}
		ResultSet rs = null;
		PreparedStatement ps = null;
		Car car = new Car();
		String sql = " select * from car where model= ? ";
		
		try {
		 ps = con.prepareStatement(sql);
		
		ps.setString(1, model);
		
		rs =  ps.executeQuery();
		
		if(rs.next()) {
			car.setCarId(rs.getInt(1));
			car.setModel(rs.getString(2));
			car.setCompany(rs.getString(3));
			car.setEngine(rs.getString(4));
			car.setColor(rs.getString(5));
			car.setType(rs.getString(6));
		}
		}
	 catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if (ps != null) {
				ps.close();
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
		
		return car;
	}



	public static List<Car> findByColor(String color) {
		if(con==null) {
			return null;
		}
		List<Car> lss = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement st = null;
		
		String sql = "SELECT * from car where color =  ? ";
		try {
			st = con.prepareStatement(sql);
			st.setString(1, color);
			rs = st.executeQuery();
			
			if(rs.next()) {
				Car car = new Car();
				car.setCarId(rs.getInt(1));
				car.setModel(rs.getString(2));
				car.setCompany(rs.getString(3));
				car.setEngine(rs.getString(4));
				car.setColor(rs.getString(5));
				car.setType(rs.getString(6));
				lss.add(car);
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		finally {
			try {
				if(st!=null) {
					st.close();
				}
			}
			catch(SQLException e) {
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
		return lss;
	}
}
