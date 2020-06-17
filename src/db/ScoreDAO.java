package src.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import src.equation.Score;

public class ScoreDAO {
	
	private Connection connect;
	
	public ScoreDAO() {
		connect = Connect.getInstance();
	}
	
	public boolean create(Score s) {
		String query = "INSERT INTO scores VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connect.prepareStatement(query);
			stmt.setString(1, s.getPseudo());
			stmt.setInt(2, s.getScore());
			stmt.setInt(3, s.getNiveau());
			stmt.setInt(4, s.getTemps());
			stmt.setString(5, s.getMode());
			stmt.setTimestamp(6, new Timestamp(s.getDate().getTime()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
