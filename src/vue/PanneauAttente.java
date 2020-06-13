package src.vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

import src.controleur.TacheSon;

public class PanneauAttente extends AbstractPanneau {

	private static final long serialVersionUID = 1L;
	private String motADessiner = "1";
	private int taillePolice = 100;
	private int nbPaint = 0;
	private int dureeSeconde = 15;
	private JLabel label;

	public PanneauAttente(Fenetre f) {
		super(f);
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		this.add(label);
	}

	@Override
	public void paintComponent(Graphics g) {
		String nomSon = "";
		
		if (nbPaint >= dureeSeconde*4) {
			nbPaint = -1;
			f.getControle().commenceJeu();
		}
		
		if (nbPaint/dureeSeconde == 3) {
			motADessiner = "GO !!!";
			nomSon = "GO";
		} else if (nbPaint != -1){
			motADessiner = "" + (nbPaint/dureeSeconde+1);
			nomSon = motADessiner;
		}
		
		if (nbPaint%dureeSeconde == 0) {
			resetTaillePolice();
			new Thread(new TacheSon(nomSon)).start();
		} else {
			taillePolice += 100/dureeSeconde;
		}
		
		try {
	        Thread.sleep(100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		nbPaint++;
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
