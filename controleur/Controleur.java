package controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import equation.Modele;
import vue.Bouton;
import vue.Fenetre;

public class Controleur {
	
	private Fenetre fenetre;
	private Modele modele;
	private ContrBoutQuit controleBoutQuit;
	private ContrBoutJouer controleBoutJouer;
	private int niveau;
	private Mode mode;
	
	public Controleur(Fenetre fenetre, Modele modele) {
		this.fenetre = fenetre;
		this.modele = modele;
		this.controleBoutQuit = new ContrBoutQuit();
		this.controleBoutJouer = new ContrBoutJouer(this.fenetre);
		this.niveau = 1;
		this.mode = Mode.Zen;
	}

	public ContrBoutQuit getControleBoutQuit() {
		return controleBoutQuit;
	}

	public ContrBoutJouer getControleBoutJouer() {
		return controleBoutJouer;
	}

	public int getNiveau() {
		return niveau;
	}

	public Mode getMode() {
		return mode;
	}

}
