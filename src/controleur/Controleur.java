package src.controleur;

import javax.swing.JOptionPane;

import src.equation.Mode;
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
	
	public void setOptions(int niveau, String mode, int temps) {
		modele.setCurrNiveau(niveau);
		modele.setTemps(temps);
		switch (mode) {
			case "Zen":
				modele.setMode(Mode.Zen);
				break;
			case "CLM":
				modele.setMode(Mode.CLM);
				break;
			case "Infini":
				modele.setMode(Mode.Infini);
				break;
			case "Arcade":
				modele.setMode(Mode.Arcade);
				break;
		}
	}

}
