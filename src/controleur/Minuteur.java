package src.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Minuteur {
	
	private Timer timer;
	private int secondes;
	private int minutes;
	private AbstractControleurModeJeuChrono c;
	
	public Minuteur(AbstractControleurModeJeuChrono c) {
		this.c = c;
		secondes = c.getModele().getTemps()%60;
		minutes = c.getModele().getTemps()/60;
		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				decremente();
			}
			
		});
	}
	
	public void start() {
		timer.start();
		c.afficheTemps(toString());
	}
	
	private void decremente() {
		if (secondes == 0 && minutes == 0) {
			timer.stop();
			c.stop();
		} else if (secondes != 0) {
			secondes--;
			c.afficheTemps(toString());
		} else {
			minutes--;
			secondes = 59;
			c.afficheTemps(toString());
		}
	}

	@Override
	public String toString() {
		return "" + minutes + " : " + secondes;
	}
	
	public void pause() {
		timer.stop();
	}
	
	public void reprendre() {
		timer.start();
	}
	
	public void ajouteTemps(int sec) {
		minutes += sec/60;
		secondes += sec%60;
		if (secondes >= 60) {
			minutes++;
			secondes -= 60;
		}
		c.afficheTemps(toString());
	}
}
