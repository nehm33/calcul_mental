package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ContrBoutQuit extends AbstractContrBout {
	
	public ContrBoutQuit() {
		super();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane jop = new JOptionPane();    	
	    int option = jop.showConfirmDialog(null, 
	    		 "Voulez-vous vraiment quitter l'application ?", "Quitter", 
	    		 	JOptionPane.YES_NO_OPTION, 
	    		 		JOptionPane.QUESTION_MESSAGE);
	    if (option == JOptionPane.OK_OPTION) {
	    	System.exit(0);
	    }
		
	}

}
