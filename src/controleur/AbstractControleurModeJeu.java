package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public abstract class AbstractControleurModeJeu extends AbstractControleur {

	public AbstractControleurModeJeu(Fenetre vue, Modele modele) {
		super(vue, modele);
	}
	
	public void start() {
		vue.commenceJeu();
		modele.commenceJeu();
	}
	
	public void stop() {
		vue.termineJeu();
	}
	
	public void pause() {
		vue.setPause();
	}
	
	public void reprendre() {
		vue.commenceJeu();
		modele.reprendreJeu();
	}
	
	public void verifier(int proposition) {
		boolean b = modele.verifier(proposition);
		if (b) {
			bonneReponse();
		} else {
			mauvaiseReponse();
		}
	}
	
	public void resetModele() {
		modele.termineJeu();
	}
	
	protected void nouvelleEquation() {
		modele.nouvelleOperation();
	}
	
	protected abstract void bonneReponse();
	
	protected abstract void mauvaiseReponse();

}
