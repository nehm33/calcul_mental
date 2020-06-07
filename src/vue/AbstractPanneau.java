package src.vue;

import javax.swing.JPanel;

public abstract class AbstractPanneau extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Fenetre f;

	public AbstractPanneau(Fenetre f) {
		super();
		this.f = f;
	}
	
	

}
