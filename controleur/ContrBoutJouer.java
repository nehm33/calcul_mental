package controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vue.Fenetre;
import vue.PanneauAttente;

public class ContrBoutJouer implements MouseListener {
	
	private Fenetre f;
	
	public ContrBoutJouer(Fenetre f) {
		this.f = f;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		ContrPanAtt cpa = new ContrPanAtt(this.f);
		cpa.start();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
