package src.vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import src.Main;

public abstract class AbstractPanneauImage extends AbstractPanneau {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Image img;
	
	public AbstractPanneauImage(String image, Fenetre f) {
		super(f);
		try {
			img = ImageIO.read(new File(Main.chemin+"images/"+image));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(img, 0, 0, Fenetre.longueur, Fenetre.largeur, this);
	}

}
