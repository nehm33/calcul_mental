package src.equation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Score {
	
	private String pseudo;
	private int score;
	private int niveau;
	private int temps;
	private String mode;
	private Date date;
	
	public Score() {
		
	}

	public Score(String pseudo, int score, int niveau, int temps, String mode) {
		this.pseudo = pseudo;
		this.score = score;
		this.niveau = niveau;
		this.temps = temps;
		this.mode = mode;
		this.date = new Date();
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getTempsString() {
		return temps/60  + " : " + temps%60;
	}
	
	public String getDateString() {
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" 
					+ c.get(Calendar.YEAR) + " " + c.get(Calendar.HOUR_OF_DAY) + ":" 
						+ c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND); 
	}

}
