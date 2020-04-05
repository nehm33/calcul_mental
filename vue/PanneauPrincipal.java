package vue;

public class PanneauPrincipal extends AbstractPanImg {
	
	public PanneauPrincipal(Fenetre f) {
		super(f);
		this.add(new Bouton(this.f,"JOUER", 200, 50, 400, 100, 
								this.f.getControle().getControleBoutJouer()));
		this.add(new Bouton(this.f,"OPTIONS", 200, 200, 400, 100, null));
		this.add(new Bouton(this.f,"MEILLEURS SCORES", 200, 350, 400, 100, null));
		this.add(new Bouton(this.f,"QUITTER", 200, 500, 400, 100, 
								this.f.getControle().getControleBoutQuit()));
	}

}
