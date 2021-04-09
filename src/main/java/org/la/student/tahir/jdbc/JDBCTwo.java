package org.la.student.tahir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import org.la.student.asif.jdbc.JDBCTwo;

public class JDBCTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JDBCTwo jdbc = new JDBCTwo();

		Connection con = null;

		try {
			// here student is database name, root is username and password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");
			
			if (con != null) {
				System.out.println("connected successfully");
				//jdbc.read(con);
				//jdbc.read(con, 20);
				//jdbc.create(con, "amin khan", 11);
				//jdbc.update(con, "jamil fine", 9, 10);
				//jdbc.delete(con, 12);
			} else {
				System.out.println("failed to connect");
			}
			// jdbc.create(con, "jain", 60);
			// jdbc.update(con, "jain", 87, 13);
			// jdbc.delete(con, 16);
			// jdbc.read(con, 18);
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

	}


