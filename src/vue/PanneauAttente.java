package src.vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class PanneauAttente extends AbstractPanneau {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String motADessiner = "1";
	private int taillePolice = 100;
	private static int nbPaint = 0;
	private JLabel label;

	public PanneauAttente(Fenetre f) {
		super(f);
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		this.add(label);
	}

	@Override
	public void paintComponent(Graphics g) {
		nbPaint++;
		if (nbPaint >= 40) {
			nbPaint = 0;
			f.setMenuPrincipal();
		}
		
		if (nbPaint/10 == 3) {
			motADessiner = "GO !!!";
		} else {
			motADessiner = "" + (nbPaint/10+1);
		}
		
		if (nbPaint%10 == 0) {
			resetTaillePolice();
		} else {
			taillePolice += 10;
		}
		
		try {
	        Thread.sleep(100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		label.setForeground(Color.BLUE);
		label.setFont(new Font("Arial", Font.BOLD, taillePolice));
		label.setText(motADessiner);
		label.setBounds((this.getWidth()-600)/2, (this.getHeight()-300)/2, 600, 300);

	}
	
	public void resetTaillePolice() {
		this.taillePolice = 100;
	}

}
