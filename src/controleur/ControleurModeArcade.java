package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public class ControleurModeArcade extends AbstractControleurModeJeuChrono {
	
	private int nbTentatives = 0;

	public ControleurModeArcade(Fenetre vue, Modele modele) {
		super(vue, modele);
	}

	@Override
	protected void bonneReponse() {
		modele.augmenteScore(5*modele.getCurrOp().getOp().getDifficulte());
		minuteur.ajouteTemps(2*modele.getCurrOp().getOp().getDifficulte());
		nouvelleEquation();
	}

	@Override
	protected void mauvaiseReponse() {
		nbTentatives++;
		modele.diminueScore(nbTentatives);
		if (nbTentatives == 3) {
			nouvelleEquation();
			nbTentatives = 0;
		}
	}

}
