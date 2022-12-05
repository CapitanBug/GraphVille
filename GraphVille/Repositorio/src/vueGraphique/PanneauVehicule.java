package vueGraphique;
import javax.swing.JPanel;
import hierarchieVehicules.AbstractVehicule;
import hierarchieVehicules.FabriqueVehicule;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class PanneauVehicule extends JPanel {
	
	JComboBox<String> box;
	String tab[] ={ "CS100","CS300,"};
	JLabel labelVide;
	JLabel labelInfo;
	
	PanneauVehicule(){
		
		initPanneauV();
		
	}
	
	public void initPanneauV() {
		
		// Panneau Vehicule
		this.setPreferredSize(new Dimension(250,100));
		this.setBackground(Color.GRAY);
		this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
		this.setVisible(true);
		
		// Combo Box de nom des Vehicules
		box = new JComboBox <String> (tab);
		box.setPreferredSize(new Dimension(100,20));
		this.add(box);
		
		// Label vide pour faire de la place 
		
		insererLabel("",this);
		insererLabel("Carburant : Kerosene 144",this);
		
	}
	
	
	private void insererLabel(String texte,Container container) {
		
		JLabel label = new JLabel(texte);
		label.setPreferredSize(new Dimension(200,100));
		container.add(label);
	
	}
	
	
	
	// methode qui creait un tableau de vehicule
	/*
	public void tableauV() {
		
		
		
		for(int pos = 0; pos < FabriqueVehicule.getNbTypesVehicule() - 1; pos++ ) {
			
			this.vehicule = FabriqueVehicule.obtenirVehicule(pos);
			
		}*/
		
	
		
		
	
	

}
