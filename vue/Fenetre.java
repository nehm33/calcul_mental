package vue;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controleur.Controleur;
import equation.Modele;
import equation.Operation;

public class Fenetre extends JFrame {
	
	public static final int longueur = 800;
	public static final int largeur =700;
	private Controleur controle;
	private Modele modele;

	public Fenetre() {
		
		this.modele = new Modele(this);
		this.controle = new Controleur(this, this.modele);

		// Parametre de la fenetre
		this.setTitle("Calcul Mental");
		this.setSize(longueur, largeur);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(new PanneauPrincipal(this));
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

	public void update(boolean verif, Operation new_o) {
		
	}

}
