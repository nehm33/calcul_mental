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
	
	public Controleur(Fenetre fenetre, Modele modele) {
		this.fenetre = fenetre;
		this.modele = modele;
		this.controleBoutQuit = new ContrBoutQuit();
		this.controleBoutJouer = new ContrBoutJouer(this.fenetre);
	}

	public ContrBoutQuit getControleBoutQuit() {
		return controleBoutQuit;
	}

	public ContrBoutJouer getControleBoutJouer() {
		return controleBoutJouer;
	}

}
