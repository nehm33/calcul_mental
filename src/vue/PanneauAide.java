package src.vue;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanneauAide extends AbstractPanneauImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanneauAide(Fenetre f) {
		super("data/images/fond.jpg", f);
		setLayout(null);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.setMenuPrincipal();
			}
		});
		btnRetour.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRetour.setBounds(600, 626, 115, 34);
		add(btnRetour);
		
		JLabel lblAide = new JLabel("Aide");
		lblAide.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblAide.setHorizontalAlignment(SwingConstants.CENTER);
		lblAide.setBounds(306, 30, 191, 56);
		add(lblAide);
		
		JTextArea txtrBonjourEtBienvenue = new JTextArea();
		txtrBonjourEtBienvenue.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrBonjourEtBienvenue.setText("Bonjour et bienvenue dans ce jeu de calcul mental.\r\nPour commencer \u00E0 jouer, appuyez sur le bouton jouer du menu principal.\r\nIl y a vingt niveaux diff\u00E9rents. Vous pouvez en choisir un dans le menu \r\ndes options. Du niveau 1 au niveau 5, vous n'avez que des additions. A \r\npartir du niveau 6, vous avez des soustractions. A partir du niveau 11, \r\nvous avez des multiplications et \u00E0 partir du niveau 16, vous avez des \r\ndivisions. Bien s\u00FBr, au fur et \u00E0 mesure, la difficult\u00E9 est de plus en plus \r\ngrande.\r\nChoisissez un mode de jeu dans le menu des options. Il en existe \r\nquatre :\r\n- Mode Zen : \r\nDans ce mode, vous avez vingt tentatives. A chaque calcul r\u00E9ussi, \r\nvous obtenez un point. Mais lorsque vous ratez un calcul, vous \r\navez toujours le m\u00EAme calcul jusqu'\u00E0 ce que vous r\u00E9ussissiez.\r\n- Mode CLM :\r\nComme son nom l'indique, le mode CLM ( Contre La Montre ) est \r\nchronom\u00E9tr\u00E9. Vous avez un certain temps que vous pouvez choisir \r\ndans le menu des options pour r\u00E9aliser le meilleur score possible. \r\nComme dans le mode Zen, vous gagnez un point par bon calcul et \r\nsi vous en fa\u00EEtes un mauvais, vous avez toujours le m\u00EAme calcul \r\njusqu'\u00E0 ce que vous le trouviez.\r\n- Mode Infini :\r\nDans ce mode, vous n'avez pas droit \u00E0 l'erreur. A votre premi\u00E8re \r\nerreur, le jeu se termine et \u00E0 chaque calcul r\u00E9ussi, vous gagnez un \r\npoint.\r\n- Mode Arcade :\r\nIci, vous \u00EAtes chronom\u00E9tr\u00E9s. Vous avez au maximum trois tentatives \r\npar calcul. Pour une premi\u00E8re mauvaise r\u00E9ponse, vous perdez un \r\npoint. A la deuxi\u00E8me, vous perdez deux points et \u00E0 la troisi\u00E8me, \r\nvous perdez trois points. A chaque bonne r\u00E9ponse, vous gagnez du \r\ntemps suppl\u00E9mentaire; cinq secondes pour une addition, dix pour \r\nune soustraction, quinze pour une multiplicationet vingt pour une \r\ndivision. De m\u00EAme, pour une addition, vous gagnez deux points, \r\npour une soustraction, quatre, pour une multiplication, six et pour \r\nune division, huit.");
		JScrollPane scrollPane = new JScrollPane(txtrBonjourEtBienvenue);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(100, 150, 600, 430);
		txtrBonjourEtBienvenue.setEditable(false);
		add(scrollPane);
		
		
	}
}
