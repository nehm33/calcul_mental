package src.vue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
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
	private JLabel lblBonusScore;
	private JLabel lblBonusTemps;

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
		
		lblBonusScore = new JLabel("+10");
		lblBonusScore.setForeground(Color.GREEN);
		lblBonusScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonusScore.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 30));
		lblBonusScore.setBounds(173, 122, 63, 41);
		lblBonusScore.setVisible(false);
		add(lblBonusScore);
		
		lblBonusTemps = new JLabel("+10");
		lblBonusTemps.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonusTemps.setForeground(Color.GREEN);
		lblBonusTemps.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 30));
		lblBonusTemps.setBounds(517, 122, 63, 41);
		lblBonusTemps.setVisible(false);
		add(lblBonusTemps);
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
	
	public void lanceAnimationScore(int points) {
		new Thread(new Animation(lblBonusScore, points)).start();
	}
	
	public void lanceAnimationTemps(int points) {
		new Thread(new Animation(lblBonusTemps, points)).start();
	}
	
	private class Animation implements Runnable {
		
		private JLabel label;
		private Point initialPosition;
		
		public Animation(JLabel label, int points) {
			this.label = label;
			this.label.setText("");
			if (points < 0) {
				this.label.setForeground(Color.RED);
			} else {
				this.label.setForeground(Color.GREEN);
				this.label.setText("+");
			}
			this.label.setText(this.label.getText()+points);
			initialPosition = this.label.getLocation();
		}

		@Override
		public void run() {
			label.setVisible(true);
			for (int i = 0; i < 10; i++) {
				label.setLocation(label.getX(), label.getY()-10);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			label.setVisible(false);
			label.setLocation(initialPosition);
		}
	}
}
