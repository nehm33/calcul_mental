package src.vue;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;


public class PanneauPause extends AbstractPanneauImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanneauPause(Fenetre f) {
		super("images/fond.jpg", f);
		
		JLabel lblPause = new JLabel("Pause");
		lblPause.setHorizontalAlignment(SwingConstants.CENTER);
		lblPause.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		
		JButton btnReprendre = new JButton("Reprendre");
		btnReprendre.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JButton btnRecommencer = new JButton("Recommencer");
		btnRecommencer.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnRecommencer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int option = JOptionPane.showConfirmDialog(null, 
						"Voulez-vous vraiment recommencer la partie?", "Recommencer", 
					    		 	JOptionPane.YES_NO_OPTION, 
					    		 		JOptionPane.QUESTION_MESSAGE);
				if (option == JOptionPane.YES_OPTION) {
					f.setAttente();
				}
			}
			
		});
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnQuitter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int option = JOptionPane.showConfirmDialog(null, 
						"Voulez-vous vraiment arrêter la partie en cours?", "Quitter la partie", 
					    		 	JOptionPane.YES_NO_OPTION, 
					    		 		JOptionPane.QUESTION_MESSAGE);
				if (option == JOptionPane.YES_OPTION) {
					f.setMenuPrincipal();
				}
			}
			
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(288)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPause, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
							.addGap(291))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnQuitter, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnReprendre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnRecommencer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(lblPause, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(btnReprendre, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(btnRecommencer, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(265, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
	}

}
