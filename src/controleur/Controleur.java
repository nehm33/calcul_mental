package src.controleur;

import javax.swing.JOptionPane;

import src.equation.Modele;
import src.vue.Fenetre;

public class Controleur extends AbstractControleur {

	public Controleur(Fenetre vue, Modele modele) {
		super(vue, modele);
	}
	
	public void quitter() {   	
		int option = JOptionPane.showConfirmDialog(null, 
				"Voulez-vous vraiment quitter l'application ?", "Quitter", 
			    		 	JOptionPane.YES_NO_OPTION, 
			    		 		JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.OK_OPTION) {
			    	System.exit(0);
		}
	}

}
