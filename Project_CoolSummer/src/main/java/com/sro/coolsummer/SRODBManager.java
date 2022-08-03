package com.sro.coolsummer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SRODBManager {
	public static Connection connect() throws SQLException {
		String addr = "jdbc:oracle:thin:@192.168.0.135:1521:xe";
		return DriverManager.getConnection(addr, "sro", "1");
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
//			e.printStackTrace();
		}
		
		try {
			pstmt.close();
		} catch (SQLException e) {
		}
		
		try {
			con.close();
		} catch (SQLException e) {
		}
	}
}
