package src.vue;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class PanneauOptions extends AbstractPanneauImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanneauOptions(Fenetre fenetre) {
		super("images/fond.jpg", fenetre);
		
		JLabel lblNiveau = new JLabel("Niveau");
		lblNiveau.setHorizontalAlignment(SwingConstants.CENTER);
		lblNiveau.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblMode = new JLabel("Mode");
		lblMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblMode.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JRadioButton rdbtnZen = new JRadioButton("Zen");
		rdbtnZen.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnZen.setOpaque(false);
		rdbtnZen.setSelected(true);
		
		JRadioButton rdbtnClm = new JRadioButton("CLM");
		rdbtnClm.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnClm.setOpaque(false);
		
		JRadioButton rdbtnInfini = new JRadioButton("Infini");
		rdbtnInfini.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnInfini.setOpaque(false);
		
		JRadioButton rdbtnArcade = new JRadioButton("Arcade");
		rdbtnArcade.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnArcade.setForeground(Color.WHITE);
		rdbtnArcade.setOpaque(false);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnArcade);
		bg.add(rdbtnInfini);
		bg.add(rdbtnClm);
		bg.add(rdbtnZen);
		
		JLabel lblTemps = new JLabel("Temps");
		lblTemps.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemps.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JSpinner spinNiveau = new JSpinner();
		spinNiveau.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		
		JSlider sliderTemps = new JSlider();
		sliderTemps.setMajorTickSpacing(60);
		sliderTemps.setMaximum(150);
		sliderTemps.setPaintLabels(true);
		sliderTemps.setSnapToTicks(true);
		sliderTemps.setValue(90);
		sliderTemps.setPaintTicks(true);
		sliderTemps.setMinorTickSpacing(30);
		sliderTemps.setMinimum(30);
		
		JLabel lblSecondes = new JLabel("secondes");
		lblSecondes.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnValider.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAnnuler.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.setMenuPrincipal();	
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(211)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblMode, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNiveau, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
								.addComponent(lblTemps, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnZen)
									.addGap(36)
									.addComponent(rdbtnClm, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnInfini, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnArcade))
								.addComponent(spinNiveau, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(sliderTemps, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
									.addGap(44)
									.addComponent(lblSecondes))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(224)
							.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(145)
							.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(84)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNiveau)
						.addComponent(spinNiveau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(88)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMode)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnZen)
							.addComponent(rdbtnClm)
							.addComponent(rdbtnInfini)
							.addComponent(rdbtnArcade)))
					.addGap(95)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTemps, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(sliderTemps, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblSecondes)))
					.addPreferredGap(ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(40))
		);
		setLayout(groupLayout);
		
		
	}
}
