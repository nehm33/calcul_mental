package src.vue;

import javax.swing.JFrame;

import src.controleur.Controleur;
import src.equation.Modele;

public class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int longueur = 800;
	public static final int largeur = 700;
	private Controleur controle;
	private Modele modele;


	public Fenetre() {
		// TODO Auto-generated constructor stub
		// Parametre de la fenetre
		  this.setTitle("Calcul Mental");
		  this.setSize(longueur, largeur);
		  this.setLocationRelativeTo(null);
		  this.setResizable(false);
		  //this.setContentPane(null);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

		  // Fenetre Visible
		  this.setVisible(true);
	}


	public Controleur getControle() {
		return controle;
	}


	public Modele getModele() {
		return modele;
	}


	public void setControle(Controleur controle) {
		this.controle = controle;
	}


	public void setModele(Modele modele) {
		this.modele = modele;
	}

}