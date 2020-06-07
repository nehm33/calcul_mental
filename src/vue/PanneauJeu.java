package src.vue;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;



public class PanneauJeu extends AbstractPanneauImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblEquation;
	private JLabel lblScore;
	private JFormattedTextField fieldReponse;
	private JLabel lblTemps;

	/**
	 * Create the panel.
	 */
	public PanneauJeu(Fenetre f) {
		super("images/fond.jpg", f);
		setLayout(null);
		
		lblEquation = new JLabel("45 x 15  =");
		lblEquation.setFont(new Font("Calibri", Font.BOLD, 70));
		lblEquation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquation.setBounds(86, 293, 329, 65);
		add(lblEquation);
		
		fieldReponse = new JFormattedTextField();
		fieldReponse.setFont(new Font("Calibri", Font.BOLD, 70));
		fieldReponse.setHorizontalAlignment(SwingConstants.CENTER);
		fieldReponse.setBounds(425, 293, 168, 65);
		add(fieldReponse);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBackground(Color.LIGHT_GRAY);
		btnValider.setBounds(676, 316, 89, 23);
		add(btnValider);
		
		lblScore = new JLabel("Score :  80");
		lblScore.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(10, 23, 177, 41);
		add(lblScore);
		
		lblTemps = new JLabel("00 : 00");
		lblTemps.setFont(new Font("Segoe UI", Font.BOLD, 32));
		lblTemps.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTemps.setBounds(554, 22, 144, 33);
		add(lblTemps);
		
		JButton btnPause = new JButton("");
		btnPause.setIcon(new ImageIcon("images/pause.png"));
		btnPause.setBounds(724, 23, 41, 41);
		add(btnPause);
		btnPause.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setPause();
			}
			
		});
		
		
	}
}
