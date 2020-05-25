package src.vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public abstract class AbstractPanneauImage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Image img;
	protected Fenetre f;
	
	public AbstractPanneauImage(String image, Fenetre f) {
		try {
			img = ImageIO.read(new File(image));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.f = f;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(img, 0, 0, Fenetre.longueur, Fenetre.largeur, this);
	}

}
