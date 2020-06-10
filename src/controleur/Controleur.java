package src.controleur;

import javax.swing.JOptionPane;

import src.equation.Mode;
import src.equation.Modele;
import src.vue.Fenetre;

public class Controleur extends AbstractControleur {
	
	AbstractControleurModeJeu controleurJeu;

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
		int option = JOptionPane.showConfirmDialog(null, 
				"Voulez-vous vraiment valider ces nouvelles options?", "Enregistrer les options", 
			    		 	JOptionPane.YES_NO_OPTION, 
			    		 		JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.OK_OPTION) {
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
	
	public void commenceJeu() {
		switch (modele.getMode()) {
			case Zen:
				controleurJeu = new ControleurModeZen(vue, modele);
				break;
			case CLM:
				controleurJeu = new ControleurModeCLM(vue, modele);
				break;
			case Infini:
				// TODO
				break;
			case Arcade:
				controleurJeu = new ControleurModeArcade(vue, modele);
				break;
		}
		controleurJeu.start();
	}
	
	public void verifier(String resultat) {
		if (resultat.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Vous n'avez donné aucune réponse", "Erreur",
																	JOptionPane.ERROR_MESSAGE);
		} else {
			controleurJeu.verifier(Integer.parseInt(resultat));
		}
	}
	
	public void pause() {
		controleurJeu.pause();
	}
	
	public void reprendre() {
		controleurJeu.reprendre();
	}

}
