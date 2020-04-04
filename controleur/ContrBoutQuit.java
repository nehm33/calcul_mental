package controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ContrBoutQuit implements MouseListener {
	
	public ContrBoutQuit() {
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		JOptionPane jop = new JOptionPane();    	
	    int option = jop.showConfirmDialog(null, 
	    		 "Voulez-vous vraiment quitter l'application ?", "Quitter", 
	    		 	JOptionPane.YES_NO_OPTION, 
	    		 		JOptionPane.QUESTION_MESSAGE);
	    if (option == JOptionPane.OK_OPTION) {
	    	System.exit(0);
	    }
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
