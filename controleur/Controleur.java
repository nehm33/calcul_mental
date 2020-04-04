package controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import equation.Modele;
import vue.Bouton;
import vue.Fenetre;

public class Controleur implements MouseListener {
	
	private Fenetre fenetre;
	private Modele modele;
	private ContrBoutQuit cbq;
	private ContrBoutJouer cbj;
	
	public Controleur(Fenetre fenetre, Modele modele) {
		this.fenetre = fenetre;
		this.modele = modele;
		this.cbq = new ContrBoutQuit();
		this.cbj = new ContrBoutJouer(this.fenetre);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

		Bouton clic = (Bouton) arg0.getSource();
		
		switch (clic.getText()) {
		
			case "QUITTER":
				cbq.mouseClicked(arg0);
				break;
				
			case "JOUER":
				cbj.mouseClicked(arg0);
				break;
				
			default:
				break;
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
