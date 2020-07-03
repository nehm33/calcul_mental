package src;

import src.controleur.Controleur;
import src.equation.Modele;
import src.vue.Fenetre;

public class Main {
	
	public static String chemin;

	public static void main(String[] args) {
		String path = Main.class.getResource("").getPath();
		chemin = new String(path.toCharArray(), 0, path.length()-4);
		Fenetre f = new Fenetre();
		Modele m = new Modele(f);
		Controleur c = new Controleur(f,m);
		f.setControle(c);
		f.setModele(m);
	}

}
