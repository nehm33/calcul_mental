package src;

import src.controleur.Controleur;
import src.equation.Modele;
import src.vue.Fenetre;

public class Main {

	public static void main(String[] args) {
		Fenetre f = new Fenetre();
		Modele m = new Modele(f);
		Controleur c = new Controleur(f,m);
		f.setControle(c);
		f.setModele(m);
	}

}
