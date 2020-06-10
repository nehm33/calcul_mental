package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public class ControleurModeInfini extends AbstractControleurModeJeuChrono {

	public ControleurModeInfini(Fenetre vue, Modele modele) {
		super(vue, modele);
	}
	
	@Override
	public void stop() {
		super.stop();
		vue.ajoutTempsPanneauFinJeu(minuteur.toString());
	}
	
	@Override
	protected void initMinuteur() {
		minuteur = new Chronometre(this);
	}

	@Override
	protected void bonneReponse() {
		modele.augmenteScore(1);
		nouvelleEquation();
	}

	@Override
	protected void mauvaiseReponse() {
		stop();
	}

}
