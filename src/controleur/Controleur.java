package src.controleur;

import javax.swing.JOptionPane;

import src.db.Connect;
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
					Connect.close();
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
				controleurJeu = new ControleurModeInfini(vue, modele);
				break;
			case Arcade:
				controleurJeu = new ControleurModeArcade(vue, modele);
				break;
		}
		controleurJeu.start();
	}
	
	public void verifier(String resultat) {
		if (resultat.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Vous n'avez donn� aucune r�ponse", "Erreur",
																	JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				controleurJeu.verifier(Integer.parseInt(resultat));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Votre r�ponse n'est pas un nombre", 
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void pause() {
		controleurJeu.pause();
	}
	
	public void reprendre() {
		controleurJeu.reprendre();
	}
	
	public void ajouteScore() {
		if (Connect.existe() && !modele.getMode().getNom().equalsIgnoreCase("Zen") 
															&& modele.nouveauMeilleurScore()) {
			String pseudo = JOptionPane.showInputDialog(null, 
								"Enregistrez votre score. Entrez votre pseudo.", "Scores", 
																JOptionPane.QUESTION_MESSAGE);
			while (pseudo.isEmpty() || pseudo.length() < 5) {
				if (pseudo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Vous n'avez donn� aucun pseudo", 
							"Erreur", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Le pseudo doit avoir au moins 5 caract�res", 
							"Erreur", JOptionPane.ERROR_MESSAGE);
				}
				pseudo = JOptionPane.showInputDialog(null, 
						"Enregistrez votre score. Entrez votre pseudo.", "Scores", 
														JOptionPane.QUESTION_MESSAGE);
			}
			if (modele.ajouteScoreDB(pseudo)) {
				JOptionPane.showMessageDialog(null, "Enregistrement r�ussi!", "Succ�s",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Echec de l'enregistrement", "Erreur",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void afficheScores() {
		if (Connect.existe()) {
			vue.setMenuScores();
		} else {
			JOptionPane.showMessageDialog(null, "Probl�me de connexion � la base de donn�es",
					"Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}

}
