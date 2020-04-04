package vue;

import javax.swing.JFrame;

import equation.Operation;

public class Fenetre extends JFrame {
	
	public static final int longueur = 800;
	public static final int largeur =700;

	public Fenetre() {

		  // Parametre de la fenetre
		  this.setTitle("Calcul Mental");
		  this.setSize(longueur, largeur);
		  this.setLocationRelativeTo(null);
		  this.setResizable(false);
		  this.setContentPane(new PanneauPrincipal());
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

		  // Fenetre Visible
		  this.setVisible(true);
	}
	
	public void update(boolean verif, Operation new_o) {
		
	}

}
