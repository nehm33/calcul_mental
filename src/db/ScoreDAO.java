package src.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

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
			stmt.setInt(6, s.getTemps());
			stmt.setString(4, s.getMode());
			stmt.setTimestamp(5, new Timestamp(s.getDate().getTime()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public Score[] getMeilleursScores(int niveau, int temps, String mode) {
		Score[] s = new Score[10];
		String query = "SELECT pseudo, score, temps, heure_jeu FROM scores WHERE niveau = ? AND ";
		query += "mode_jeu = ? ";
		if (!mode.equalsIgnoreCase("Infini")) {
			query += "AND temps = ? ";
		}
		query += "ORDER BY score DESC, temps ASC, heure_jeu ASC, pseudo DESC";
		query += " LIMIT 10";
		try {
			PreparedStatement stmt = connect.prepareStatement(query);
			stmt.setInt(1, niveau);
			stmt.setString(2, mode);
			if (!mode.equalsIgnoreCase("Infini")) {
				stmt.setInt(3, temps);
			}
			ResultSet result = stmt.executeQuery();
			int i = 0;
			while (result.next()) {
				s[i] = new Score();
				s[i].setPseudo(result.getString(1));
				s[i].setScore(result.getInt(2));
				s[i].setTemps(result.getInt(3));
				s[i].setDate(new Date(result.getTimestamp(4).getTime()));
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}

}
