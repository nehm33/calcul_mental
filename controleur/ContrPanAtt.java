package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import vue.Fenetre;
import vue.PanneauAttente;
import vue.PanneauPrincipal;



public class ContrPanAtt extends AbstractContrPan {
	
	private Timer timer;
	private int nbInterrupt = 0;

	public ContrPanAtt(Fenetre f) {
		super(f);
		this.timer = new Timer(50, this);
	}
	
	public void start() {
		this.f.setContentPane(new PanneauAttente(this.f));
		this.f.revalidate();
		this.timer.start();
	}
	
	public void end() {
		this.timer.stop();
		this.f.setContentPane(new PanneauPrincipal(this.f));
		this.f.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PanneauAttente pan = (PanneauAttente) this.f.getContentPane();
		this.nbInterrupt++;
		pan.incremente();
		if (nbInterrupt >= 100) {
			this.end();
		}
	}

}
