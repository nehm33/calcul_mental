package src.vue;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;



public class PanneauFinJeu extends AbstractPanneauImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanneauFinJeu(Fenetre f) {
		super("images/fond.jpg", f);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fin de partie");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(288, 39, 230, 95);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Votre score  : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(136, 198, 194, 35);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BIEN JOUE");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 70));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(198, 297, 403, 128);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(600, 624, 110, 43);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setMenuPrincipal();
			}
			
		});
		
		JLabel lblScore = new JLabel("");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(426, 198, 154, 30);
		add(lblScore);
		
		
	}

}
