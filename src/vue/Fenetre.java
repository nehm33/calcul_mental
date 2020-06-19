package src.vue;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import src.controleur.Controleur;
import src.db.Connect;
import src.equation.Modele;

public class Fenetre extends JFrame implements WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int longueur = 800;
	public static final int largeur = 700;
	private Controleur controle;
	private Modele modele;


	public Fenetre() {
		// Parametre de la fenetre
		  this.setTitle("Calcul Mental");
		  this.setSize(longueur, largeur);
		  this.setLocationRelativeTo(null);
		  this.setResizable(false);
		  this.setContentPane(new PanneauPrincipal(this));
		  this.addWindowListener(this);             

		  // Fenetre Visible
		  this.setVisible(true);
	}


	public Controleur getControle() {
		return controle;
	}


	public Modele getModele() {
		return modele;
	}


	public void setControle(Controleur controle) {
		this.controle = controle;
	}


	public void setModele(Modele modele) {
		this.modele = modele;
	}
	
	public void setMenuPrincipal() {
		this.setContentPane(new PanneauPrincipal(this));
		this.revalidate();
	}
	
	public void setMenuOptions() {
		this.setContentPane(new PanneauOptions(this));
		this.revalidate();
	}
	
	public void setMenuAide() {
		this.setContentPane(new PanneauAide(this));
		this.revalidate();
	}
	
	public void setAttente() {
		this.setContentPane(new PanneauAttente(this));
		this.revalidate();
	}
	
	public void commenceJeu() {
		this.setContentPane(new PanneauJeu(this));
		this.revalidate();
	}
	
	public void setPause() {
		this.setContentPane(new PanneauPause(this));
		this.revalidate();
	}
	
	public void termineJeu() {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.setDisabled();
		try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		this.setContentPane(new PanneauFinJeu(this));
		this.revalidate();
	}
	
	public void changeEquation(String equation) {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.changeEquation(equation);
	}
	
	public void changeScore(String score) {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.changeScore(score);
	}
	
	public void changeMinuteur(String temps) {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.changeTemps(temps);
	}
	
	public void jeuSansTemps() {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.setSansTemps();
	}
	
	public void ajoutTempsPanneauFinJeu(String temps) {
		PanneauFinJeu pan = (PanneauFinJeu) this.getContentPane();
		pan.setTemps(temps);
	}
	
	public void ajouteScore(int score) {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.lanceAnimationScore(score);
	}
	
	public void ajouteTemps(int temps) {
		PanneauJeu pan = (PanneauJeu) this.getContentPane();
		pan.lanceAnimationTemps(temps);
	}


	@Override
	public void windowActivated(WindowEvent e) {
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		Connect.close();
		System.exit(0);
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		
	}

}
