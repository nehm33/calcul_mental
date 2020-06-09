package src.vue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



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
		
		lblEquation = new JLabel("450 x 150  = ");
		lblEquation.setFont(new Font("Calibri", Font.BOLD, 70));
		lblEquation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEquation.setBounds(52, 293, 363, 65);
		add(lblEquation);
		
		fieldReponse = new JFormattedTextField(NumberFormat.getIntegerInstance());
		fieldReponse.setFont(new Font("Calibri", Font.BOLD, 70));
		fieldReponse.setHorizontalAlignment(SwingConstants.CENTER);
		fieldReponse.setBounds(425, 293, 168, 65);
		add(fieldReponse);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBackground(Color.LIGHT_GRAY);
		btnValider.setBounds(676, 316, 89, 23);
		add(btnValider);
		btnValider.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.getControle().verifier(fieldReponse.getText());
				fieldReponse.setText("");
			}
			
		});
		
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
				f.getControle().pause();
			}
			
		});
		
		
		fieldReponse.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				char c = arg0.getKeyChar();
				if (c == '\n') {
					f.getControle().verifier(fieldReponse.getText());
					fieldReponse.setText("");
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
		});
	}
	
	public void changeEquation(String equation) {
		lblEquation.setText(equation);
	}
	
	public void changeScore(String score) {
		lblScore.setText("Score :  "+score);
	}
	
	public void changeTemps(String temps) {
		lblTemps.setText(temps);
	}
	
	public void setDisabled() {
		fieldReponse.setEnabled(false);
	}
	
	public void setSansTemps() {
		lblTemps.setText("");
	}
}
