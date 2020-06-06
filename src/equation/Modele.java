package src.equation;

import src.vue.Fenetre;

// Zen(nb fixe), Infini(erreur fatale), CLM(1min), Burger(1min+bonus et malus)
public class Modele {
	
	private Operation currOp;
	private int currNiveau = 1;
	private int temps = 90;
	private Mode mode = Mode.Zen;
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

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

}
