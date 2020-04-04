package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauAttente extends JPanel {
	
	private Fenetre fenetre;
	private JLabel lab;
	private int nbInterrupt=0;

	public PanneauAttente(Fenetre f) {
		this.fenetre = f;
		Font font = new Font("Arial", Font.BOLD, 50);
		this.lab = new JLabel("");
		lab.setFont(font);
		lab.setForeground(Color.BLUE);
		lab.setLocation((this.getWidth()-lab.getWidth())/2, 
										(this.getHeight()-lab.getHeight())/2);
		this.add(lab);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		if (nbInterrupt >= 80) {
			lab.setText("GO!!!");
		} else {
			lab.setText(""+this.nbInterrupt/20);
		}
		
		lab.setFont(new Font("Arial", Font.BOLD, 50 +(this.nbInterrupt%20)*3));
		lab.setLocation((this.getWidth()-lab.getWidth())/2, 
										(this.getHeight()-lab.getHeight())/2);
	}
	
	public void incremente() {
		this.nbInterrupt++;
	}

}
