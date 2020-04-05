package controleur;

import java.awt.event.ActionEvent;

import vue.Fenetre;

public abstract class AbstractContrPan extends AbstractContr {
	
	protected Fenetre f;

	public AbstractContrPan(Fenetre f) {
		this.f = f;
	}

	@Override
	public abstract void actionPerformed(ActionEvent arg0);

}
