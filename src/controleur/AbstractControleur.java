package src.controleur;

import src.equation.Modele;
import src.vue.Fenetre;

public abstract class AbstractControleur {
	
	protected Fenetre vue;
	protected Modele modele;
	
	public AbstractControleur(Fenetre vue, Modele modele) {
		super();
		this.vue = vue;
		this.modele = modele;
	}

	public Fenetre getVue() {
		return vue;
	}

	public Modele getModele() {
		return modele;
	}
	

}
