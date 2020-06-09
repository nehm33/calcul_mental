package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public class ControleurModeZen extends AbstractControleurModeJeu {
	
	private int nbTentatives = 20;

	public ControleurModeZen(Fenetre vue, Modele modele) {
		super(vue, modele);
	}
	
	@Override
	public void start() {
		super.start();
		vue.jeuSansTemps();
	}
	
	@Override
	public void reprendre() {
		super.reprendre();
		vue.jeuSansTemps();
	}

	@Override
	protected void bonneReponse() {
		modele.augmenteScore(1);
		nbTentatives--;
		if (nbTentatives == 0) {
			stop();
		} else {
			nouvelleEquation();
		}
	}

	@Override
	protected void mauvaiseReponse() {
		nbTentatives--;
		if (nbTentatives == 0) {
			stop();
		}
	}

}
