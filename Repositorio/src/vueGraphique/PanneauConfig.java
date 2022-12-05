package vueGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import enginCartes.Configuration;

public class PanneauConfig extends JPanel {

	private JLabel maxX;
	private JLabel maxY;
	private JLabel nbVilles;
	private JLabel pourcentageMute;
	private JLabel pourcentageRetrait;
	private JLabel penaltyDeco;
	private JLabel penaltyDist;
	private JLabel penaltyLong;
	private JLabel nbIter;
	private JLabel nbBaseCarte;
	private JLabel echelle;
	private JLabel nbCarteMax;
	
	private JTextField enterMaxX;
	private JTextField enterMaxY;
	private JTextField enterNbVilles;
	private JTextField enterPourcentageMute;
	private JTextField enterPourcentageRetrait;
	private JTextField enterPenaltyDeco;
	private JTextField enterPenaltyDist;
	private JTextField enterPenaltyLong;
	private JTextField enterNbIter;
	private JTextField enterNbBaseCarte;
	private JTextField enterEchelle;
	private JTextField enterNbCarteMax;
	GridBagLayout layout;
	private GridBagConstraints contrains;
	Configuration config = new Configuration();
	
	PanneauConfig(Dimension tailleConfig){

		initPanneau(tailleConfig);

	}

	private void initPanneau(Dimension tailleConfig) {



		this.setPreferredSize(new Dimension(tailleConfig));
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		this.setLayout(new GridLayout()); 
		this.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.WHITE));
		
		layout = new GridBagLayout();
		this.setLayout(layout);
		contrains = new GridBagConstraints();
		contrains.gridx = 0;
		contrains.gridy = 0;
		contrains.weightx = 1;
		contrains.weighty = 1;
		contrains.gridheight = 1;
		contrains.gridwidth = 1;
		
				
		
		
		
		
		// add les Labels 
		
		this.add(maxX = new JLabel(" PosX "),contrains);
		maxX.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 0;
		this.add(enterMaxX = new JTextField(5),contrains);
		
		
		contrains.gridx = 0;
		contrains.gridy = 1;
		this.add(maxY = new JLabel(" PosY "),contrains);
		maxY.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 1;
		this.add(enterMaxY = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 2;
		this.add(nbVilles = new JLabel("nbVilles"),contrains);
		nbVilles.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 2;
		this.add(enterNbVilles = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 3;
		this.add( pourcentageMute = new JLabel("%Mute "),contrains);
		pourcentageMute.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 3;
		this.add(enterPourcentageMute = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 4;
		this.add(pourcentageRetrait = new JLabel("%retrait"),contrains);
		pourcentageRetrait.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 4;
		this.add(enterPourcentageRetrait = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 5;
		this.add(penaltyDist = new JLabel("penaltyDistance"),contrains);
		penaltyDist.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 5;
		this.add(enterPenaltyDist = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 6;
		this.add(penaltyLong = new JLabel("penaltyLongeur"),contrains);
		penaltyLong.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 6;
		this.add(enterPenaltyLong = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 7;
		this.add(penaltyDeco = new JLabel("penalityDeconect"),contrains);
		penaltyDeco.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 7;
		this.add(enterPenaltyDeco = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 8;
		this.add(nbIter = new JLabel("nbIter"),contrains);
		nbIter.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 8;
		this.add(enterNbIter = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 9;
		this.add(nbBaseCarte = new JLabel("CartesBase"),contrains);
		nbBaseCarte.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 9;
		this.add(enterNbBaseCarte = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 10;
		this.add(nbCarteMax = new JLabel("nbCarteMax"),contrains);
		nbCarteMax.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 10;
		this.add(enterNbCarteMax = new JTextField(5),contrains);
		
		contrains.gridx = 0;
		contrains.gridy = 11;
		this.add(echelle = new JLabel("Echelle"),contrains);
		echelle.setForeground(Color.WHITE);
		contrains.gridx = 1;
		contrains.gridy = 11;
		this.add(enterEchelle = new JTextField(5),contrains);
	

	}




}




	
	


	



