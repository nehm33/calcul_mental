package vue;

import java.awt.Font;

import javax.swing.JButton;

import controleur.AbstractContr;

public class Bouton extends JButton {
	
	private Fenetre fenetre;

	public Bouton(Fenetre f, String text, int x, int y, int longueur,
											int largeur, AbstractContr controle) {
		super(text);
		this.fenetre = f;
		this.setFont(new Font("Times New Roman", Font.BOLD, 30));
		this.setBounds(x, y, longueur, largeur);
		this.addActionListener(controle);
	}

}
