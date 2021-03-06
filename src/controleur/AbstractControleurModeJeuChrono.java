package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public abstract class AbstractControleurModeJeuChrono extends AbstractControleurModeJeu {
	
	protected Minuteur minuteur;

	public AbstractControleurModeJeuChrono(Fenetre vue, Modele modele) {
		super(vue, modele);
		initMinuteur();
	}
	
	@Override
	public void start() {
		super.start();
		minuteur.start();
	}
	
	@Override
	public void pause() {
		super.pause();
		minuteur.pause();
	}
	
	@Override 
	public void reprendre() {
		super.reprendre();
		minuteur.reprendre();
	}
	
	public void afficheTemps(String temps) {
		vue.changeMinuteur(temps);
	}
	
	protected void initMinuteur() {
		minuteur = new Minuteur(this);
	}

	@Override
	protected abstract void bonneReponse();

	@Override
	protected abstract void mauvaiseReponse();

}
