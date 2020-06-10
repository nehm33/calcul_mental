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
	private JLabel lblVotreTemps;
	private JLabel lblTemps;

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
		lblNewLabel_2.setBounds(198, 394, 403, 128);
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
		lblScore.setFont(new Font("Times New Roman", Font.BOLD, 75));
		lblScore.setHorizontalAlignment(SwingConstants.LEFT);
		lblScore.setBounds(340, 181, 240, 60);
		add(lblScore);
		lblScore.setText(""+f.getModele().getScore());
		
		lblVotreTemps = new JLabel("Votre temps  : ");
		lblVotreTemps.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblVotreTemps.setBounds(124, 312, 194, 35);
		add(lblVotreTemps);
		lblVotreTemps.setVisible(false);
		
		lblTemps = new JLabel("0");
		lblTemps.setHorizontalAlignment(SwingConstants.LEFT);
		lblTemps.setFont(new Font("Times New Roman", Font.BOLD, 75));
		lblTemps.setBounds(340, 297, 240, 60);
		add(lblTemps);
		lblTemps.setVisible(false);
		
	}
	
	public void setTemps(String temps) {
		lblVotreTemps.setVisible(true);
		lblTemps.setVisible(true);
		lblTemps.setText(temps);
	}
}
