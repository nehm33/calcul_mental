package src.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	private static final String url = "jdbc:postgresql://localhost:5432/Jeu";
	private static final String user = "postgres";
	private static final String passwd = "ornithorynque";
	
	private static Connection conn = null;
	
	public static Connection getInstance() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
