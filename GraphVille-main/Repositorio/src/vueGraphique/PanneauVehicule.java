package vueGraphique;

import javax.swing.JPanel;
import hierarchieVehicules.AbstractVehicule;
import hierarchieVehicules.FabriqueVehicule;
import hierarchieVehicules.InterfaceVehicules;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanneauVehicule extends JPanel implements ActionListener {

	JComboBox<String> box;
	String tab[] = { "CS100", "CS300", "GreyHound102D3", "GreyHoundG4500",
			"TgvAtlantique", "TgvDuplex" };

	protected JLabel labelVide;
	protected JLabel labelPassagers;
	protected String nomCar;
	protected JLabel labelCarburant;

	InterfaceVehicules vehicule;

	PanneauVehicule(Dimension tailleVehicule) {

		initPanneauV(tailleVehicule);

	}

	public void initPanneauV(Dimension tailleVehicule) {

		// Panneau Vehicule
		this.setPreferredSize(new Dimension(tailleVehicule));
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.WHITE));
		this.setVisible(true);

		// Combo Box de nom des Vehicules
		box = new JComboBox<String>(tab);
		box.setPreferredSize(new Dimension(200, 20));
		box.setSelectedIndex(5);
		box.addActionListener(this);
		this.add(box);

		// Label vide pour faire de la place
		labelVide = new JLabel("");
		labelVide.setPreferredSize(new Dimension(200, 300));
		this.add(labelVide);

		labelCarburant = new JLabel();
		labelCarburant.setForeground(Color.WHITE);
		labelCarburant.setPreferredSize(new Dimension(250, 100));
		this.add(labelCarburant);

		labelPassagers = new JLabel();
		labelPassagers.setForeground(Color.WHITE);
		labelPassagers.setPreferredSize(new Dimension(250, 50));
		this.add(labelPassagers);

		updateLabel(box.getSelectedIndex());

		/*
		 * JLabel label = new JLabel("Panamericano");
		 * label.setForeground(Color.WHITE);
		 * label.setPreferredSize(new Dimension(250, 100));
		 * this.add(label);
		 **/

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		box = (JComboBox) e.getSource();
		int index = box.getSelectedIndex();
		updateLabel(index);

	}

	private void updateLabel(int index) {

		vehicule = FabriqueVehicule.obtenirVehicule(index);
		refaireLesComposantsInfo(vehicule);

	}

	private void refaireLesComposantsInfo(InterfaceVehicules vehicule) {

		String nbPassagers = String.valueOf(vehicule.getNbPassagersMax());

		labelCarburant
				.setText("Type de Carburant : " + InterfaceVehicules.tabNomTypeCarburant[vehicule.getTypeCarburant()]);
		labelPassagers.setText("Nombre de Passagers : " + nbPassagers);

	}

}
