package src.equation;

import src.vue.Fenetre;

// Zen(nb fixe), Infini(erreur fatale), CLM(1min), Burger(1min+bonus et malus)
public class Modele {
	
	private Operation currOp;
	private int currNiveau = 1;
	private Fenetre f;
	
	public Modele(Fenetre f) {
		this.f = f;
	}

	public int getCurrNiveau() {
		return currNiveau;
	}

	public void setCurrNiveau(int currNiveau) {
		this.currNiveau = currNiveau;
	}

}
