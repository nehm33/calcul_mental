package controleur;

import java.awt.event.ActionEvent;

import vue.Fenetre;

public abstract class AbstractContrBoutPan extends AbstractContrBout {
	
	protected Fenetre f;

	public AbstractContrBoutPan(Fenetre f) {
		this.f = f;
	}

	@Override
	public abstract void actionPerformed(ActionEvent arg0);

}
