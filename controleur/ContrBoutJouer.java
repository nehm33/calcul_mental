package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vue.Fenetre;
import vue.PanneauAttente;

public class ContrBoutJouer extends AbstractContrBoutPan {
	
	public ContrBoutJouer(Fenetre f) {
		super(f);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ContrPanAtt cpa = new ContrPanAtt(this.f);
		cpa.start();
	}
}
