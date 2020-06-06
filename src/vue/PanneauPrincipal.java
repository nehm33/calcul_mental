package src.vue;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanneauPrincipal extends AbstractPanneauImage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanneauPrincipal(Fenetre fenetre) {
		
		super("images/fond.jpg", fenetre);
		
		JButton btnJouer = new JButton("Jouer");
		btnJouer.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JButton btnOptions = new JButton("Options");
		btnOptions.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnOptions.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.setMenuOptions();
			}
		});
		
		JButton btnAide = new JButton("Aide");
		btnAide.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.getControle().quitter();
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(288)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOptions, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
					.addGap(276))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(104)
					.addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(btnOptions, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(btnAide, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(144))
		);
		setLayout(groupLayout);
	}
}
