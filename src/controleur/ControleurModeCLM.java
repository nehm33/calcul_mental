package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public class ControleurModeCLM extends AbstractControleurModeJeuChrono {

	public ControleurModeCLM(Fenetre vue, Modele modele) {
		super(vue, modele);
	}

	@Override
	protected void bonneReponse() {
		modele.augmenteScore(1);
		nouvelleEquation();
	}

	@Override
	protected void mauvaiseReponse() {
		
	}

}
