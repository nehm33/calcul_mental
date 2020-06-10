package src.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Chronometre extends Minuteur {

	public Chronometre(AbstractControleurModeJeuChrono c) {
		super(c);
	}
	
	@Override
	protected void init() {
		secondes = 0;
		minutes = 0;
		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				incremente();
			}
			
		});
	}
	
	@Override
	public void stop() {
		timer.stop();
	}
	
	private void incremente() {
		secondes++;
		if (secondes == 60) {
			minutes++;
			secondes = 0;
		}
		c.afficheTemps(toString());
	}

}
