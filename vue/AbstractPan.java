package vue;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class AbstractPan extends JPanel {
	
	protected Fenetre f;

	public AbstractPan(Fenetre f) {
		super();
		this.f = f;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

}
