package src.vue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class PanneauScores extends AbstractPanneauImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String[] modes = {"CLM", "Infini", "Arcade"};
	private JSpinner spinTempsCLM;
	private JPanel panelCLM;
	private JSpinner spinNiveau;
	private JPanel panelInfini;
	private JPanel panelArcade;
	private JTable tableCLM;
	private JSpinner spinTempsArcade;
	private JTable tableArcade;
	private JTable tableInfini;

	/**
	 * Create the panel.
	 */
	public PanneauScores(Fenetre f) {
		super("images/fond.jpg", f);
		setLayout(null);
		
		JLabel lblBestScores = new JLabel("Meilleurs Scores");
		lblBestScores.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestScores.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		lblBestScores.setBounds(100, 11, 600, 88);
		add(lblBestScores);
		
		JLabel lblNiveau = new JLabel("Niveau");
		lblNiveau.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNiveau.setBounds(125, 119, 59, 19);
		add(lblNiveau);
		
		spinNiveau = new JSpinner();
		spinNiveau.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spinNiveau.setBounds(307, 120, 147, 20);
		spinNiveau.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(spinNiveau);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRetour.setBounds(628, 624, 108, 37);
		btnRetour.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.setMenuPrincipal();
			}
			
		});
		add(btnRetour);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 170, 715, 443);
		tabbedPane.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(tabbedPane);
		
		panelCLM = new JPanel();
		tabbedPane.addTab("Mode CLM", null, panelCLM, null);
		panelCLM.setLayout(null);
		
		JLabel lblTemps = new JLabel("Temps");
		lblTemps.setBounds(106, 11, 48, 19);
		lblTemps.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelCLM.add(lblTemps);
		
		spinTempsCLM = new JSpinner();
		spinTempsCLM.setModel(new SpinnerNumberModel(30, 30, 150, 30));
		spinTempsCLM.setBounds(286, 12, 147, 20);
		spinTempsCLM.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		panelCLM.add(spinTempsCLM);
		
		JScrollPane scrollPaneCLM = new JScrollPane();
		scrollPaneCLM.setBounds(10, 82, 690, 289);
		panelCLM.add(scrollPaneCLM);
		
		tableCLM = new JTable();
		tableCLM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		tableCLM.setEnabled(false);
		tableCLM.setRowSelectionAllowed(false);
		tableCLM.setRowHeight(25);
		tableCLM.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"", "pseudo", "score", "date"
			}
		));
		tableCLM.getColumnModel().getColumn(0).setPreferredWidth(15);
		tableCLM.getColumnModel().getColumn(0).setMinWidth(1);
		tableCLM.getColumnModel().getColumn(2).setPreferredWidth(41);
		scrollPaneCLM.setViewportView(tableCLM);
		
		panelInfini = new JPanel();
		tabbedPane.addTab("Mode Infini", null, panelInfini, null);
		panelInfini.setLayout(null);
		
		JScrollPane scrollPaneInfini = new JScrollPane();
		scrollPaneInfini.setBounds(10, 82, 690, 289);
		panelInfini.add(scrollPaneInfini);
		
		tableInfini = new JTable();
		tableInfini.setFont(new Font("Times New Roman", Font.BOLD, 16));
		tableInfini.setEnabled(false);
		tableInfini.setRowSelectionAllowed(false);
		tableInfini.setRowHeight(25);
		tableInfini.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"", "pseudo", "score", "temps", "date"
			}
		));
		tableInfini.getColumnModel().getColumn(0).setPreferredWidth(15);
		tableInfini.getColumnModel().getColumn(0).setMinWidth(1);
		tableInfini.getColumnModel().getColumn(2).setPreferredWidth(41);
		scrollPaneInfini.setViewportView(tableInfini);
		
		panelArcade = new JPanel();
		tabbedPane.addTab("Mode Arcade", null, panelArcade, null);
		panelArcade.setLayout(null);
		
		JLabel lblTemps2 = new JLabel("Temps");
		lblTemps2.setBounds(106, 11, 48, 19);
		lblTemps2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelArcade.add(lblTemps2);
		
		spinTempsArcade = new JSpinner();
		spinTempsArcade.setModel(new SpinnerNumberModel(30, 30, 150, 30));
		spinTempsArcade.setBounds(286, 12, 147, 20);
		spinTempsArcade.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		panelArcade.add(spinTempsArcade);
		
		JScrollPane scrollPaneArcade = new JScrollPane();
		scrollPaneArcade.setBounds(10, 82, 690, 289);
		panelArcade.add(scrollPaneArcade);
		
		tableArcade = new JTable();
		tableArcade.setFont(new Font("Times New Roman", Font.BOLD, 16));
		tableArcade.setEnabled(false);
		tableArcade.setRowSelectionAllowed(false);
		tableArcade.setRowHeight(25);
		tableArcade.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"", "pseudo", "score", "date"
			}
		));
		tableArcade.getColumnModel().getColumn(0).setPreferredWidth(15);
		tableArcade.getColumnModel().getColumn(0).setMinWidth(1);
		tableArcade.getColumnModel().getColumn(2).setPreferredWidth(41);
		scrollPaneArcade.setViewportView(tableArcade);
	}
}
