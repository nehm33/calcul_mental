package vue;

import java.awt.Font;

import javax.swing.JButton;

public class Bouton extends JButton {
	
	private Fenetre fenetre;

	public Bouton(Fenetre f, String text, int x, int y, int longueur,
																int largeur) {
		super(text);
		this.fenetre = f;
		this.setFont(new Font("Times New Roman", Font.BOLD, 30));
		this.setBounds(x, y, longueur, largeur);
		this.addMouseListener(this.fenetre.getControle());
	}

}
