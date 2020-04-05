package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PanneauOptions extends AbstractPanImg {
	
	private JSpinner spinNiv;
	private JSpinner spinTemp;
	private ButtonGroup bg;
	private JRadioButton[] mode;

	public PanneauOptions(Fenetre f) {
		super(f);
		bg = new ButtonGroup();
		mode = new JRadioButton[4];
		spinNiv = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
		spinNiv.setBounds(500, 30, 100, 30);
		spinNiv.setFont(new Font("Arial", 0, 20));
		spinNiv.setName("niveau");
		this.add(spinNiv);
		spinTemp = new JSpinner(new SpinnerNumberModel(30, 30, 180, 30));
		spinTemp.setBounds(500, 330, 100, 30);
		spinTemp.setFont(new Font("Arial", 0, 20));
		spinTemp.setName("temps");
		this.add(spinTemp);
		mode[0] = new JRadioButton("Zen");
		mode[1] = new JRadioButton("CLM");
		mode[2] = new JRadioButton("Infini");
		mode[3] = new JRadioButton("Burger");
		for (int i=0; i<4; i++) {
			if (i == 0) {
				mode[i].setBounds(500, 160, 75, 50);
			} else {
				mode[i].setBounds(500+i*75, 160, 75, 50);
			}
			bg.add(mode[i]);
			this.add(mode[i]);
		}
		this.add(new Bouton(this.f, "Valider", 100, 600, 200, 50, null));
		this.add(new Bouton(this.f, "Annuler", 500, 600, 200, 50, null));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Times New Roman", Font.BOLD, 60));
		g.drawString("Niveau", 100, 60);
		g.drawString("Mode", 100, 210);
		g.drawString("Temps", 100, 360);
	}

}
