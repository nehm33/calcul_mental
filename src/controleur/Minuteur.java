package src.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Minuteur {
	
	private Timer timer;
	private int secondes;
	private int minutes;
	private AbstractControleurModeJeuChrono c;
	
	public Minuteur(int temps, AbstractControleurModeJeuChrono c) {
		this.c = c;
		secondes = temps%60;
		minutes = temps/60;
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
}
