package vue;

import javax.swing.JButton;

public class Bouton extends JButton {

	public Bouton(String text, int x, int y, int longueur, int largeur) {
		super(text);
		this.setBounds(x, y, longueur, largeur);
	}

}
