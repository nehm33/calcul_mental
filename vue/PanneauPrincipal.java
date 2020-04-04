package vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauPrincipal extends JPanel {
	
	private Image img;
	
	public PanneauPrincipal() {
		Bouton jouer;
		try {
			img = ImageIO.read(new File("fond.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setLayout(null);
		this.add(new Bouton("JOUER", 200, 50, 400, 100));
		this.add(new Bouton("OPTIONS", 200, 200, 400, 100));
		this.add(new Bouton("MEILLEURS SCORES", 200, 350, 400, 100));
		this.add(new Bouton("QUITTER", 200, 500, 400, 100));
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
