package org.la.student.aqsa.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPresentation {

		public static void main(String[] args) {

			Connection con = null;
			JdbcPresentation jdbc = new JdbcPresentation();

			try {
				// here sys is database name, root is username and password
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "root");
				
				if (con != null) {
					System.out.println("connected successfully");
					
					jdbc.create(con, 1, 54, 87, "3pm", "5pm");
				//	jdbc.create(con, 2, 534, 715, "2pm", "4pm");
				//	jdbc.create(con, 3, 521, 711, "1pm", "6pm");
				//	jdbc.read(con);
				//	jdbc.update(con, 5422, 891, "2pm", "5pm", 2);
				//	jdbc.read(con);
				//	jdbc.delete(con, 3);
				//	jdbc.read(con);
					
				} else {
					System.out.println("failed to connect");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		public void create(Connection con,int presentation_id,int booked_company_id, int booked_room_id,String start_time, String end_time  ) {
			PreparedStatement ps = null;
			String query = "INSERT INTO presentation(presentation_id, booked_company_id, booked_room_id, start_time, end_time) VALUES(?, ?, ?, ?, ?)";
			
			try {
				ps = con.prepareStatement(query);
				
				ps.setInt(1, presentation_id );
				ps.setInt(2,booked_company_id);
				ps.setInt(3, booked_room_id);
				ps.setString(4, start_time);
				ps.setString(5, end_time);
				
				int executeUpdate = ps.executeUpdate();
				
				if(executeUpdate>0) {
					System.out.println("Data Created");
					
				}
				else {
					System.out.println("Data Not Created");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				}
					catch(SQLException e) {
						e.printStackTrace();
					}
			}
			
		}
		
		
		public void read(Connection con) {
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try {
				String query = "SELECT * from presentation";
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
				}
				
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				try {
					if(rs!=null) {
						rs.close();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			}
		
		public void update(Connection con,int booked_company_id, int booked_room_id,String start_time, String end_time,int presentation_id) {
			PreparedStatement ps = null;
			String query = "UPDATE presentation SET booked_company_id= ? ,booked_room_id=? ,start_time =? ,end_time =?   where presentation_id= ?";
		 try {
			 ps = con.prepareStatement(query);
		
				
				ps.setInt(1,booked_company_id);
				ps.setInt(2, booked_room_id);
				ps.setString(3, start_time);
				ps.setString(4, end_time);
				ps.setInt(5,presentation_id );
				
				int executeUpdate = ps.executeUpdate();
				if(executeUpdate>0) {
					System.out.println("updated");
				}
				else {
					System.out.println(" Not updated");
				}
		 }
		 catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
		 
		 
		}
		}
		
		public void delete(Connection con,int  presentation_id) {
			
			String query = "DELETE from presentation WHERE  presentation_id= ?";
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(query);
				ps.setInt(1,  presentation_id);
				int executeUpdate = ps.executeUpdate();
				if(executeUpdate>0) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("Deletion Fail");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
}