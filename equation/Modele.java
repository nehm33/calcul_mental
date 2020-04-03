package equation;

import vue.Fenetre;

// Zen(nb fixe), Infini(erreur fatale), CLM(1min), Burger(1min+bonus et malus)
public class Modele {
	
	private Operation currOp;
	private int currNiveau;
	private Fenetre f;
	
	public Modele(Fenetre f) {
		this.f = f;
	}

	public void reinit(int niveau) {
		this.currNiveau = niveau;
		this.currOp = GenAleatoireOperation.nouvelleOperation(niveau);
	}

	public void notifierFenetre(boolean reinit, int niveau) {
		if (reinit) {
			this.reinit(niveau);
		}
		currOp = GenAleatoireOperation.nouvelleOperation(currNiveau);
		
	}

}
