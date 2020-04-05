package vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class AbstractPanImg extends AbstractPan {
	
	protected Image img;

	public AbstractPanImg(Fenetre f) {
		super(f);
		try {
			img = ImageIO.read(new File("fond.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
