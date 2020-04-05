package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauAttente extends AbstractPan {
	
	private JLabel lab;
	private int nbInterrupt=0;

	public PanneauAttente(Fenetre f) {
		super(f);
		this.lab = new JLabel("");
		lab.setFont(new Font("Arial", Font.BOLD, 50));
		lab.setForeground(Color.BLUE);
		lab.setLocation((this.getWidth()-lab.getWidth())/2, 
										(this.getHeight()-lab.getHeight())/2);
		this.add(lab);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
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
