package vueGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import enginCartes.Configuration;
import problemeVilles.PopulationVilles;

public class PanneauPrincipal extends JPanel {
	
	Cadre cadre = new Cadre();
	
	Dimension tailleVehicule;
	Dimension tailleConfig;
	Dimension tailleCentre;
	Dimension tailleProgression;
	Dimension tailleControl;// = new Dimension();
	
	public PanneauPrincipal(Configuration config, Dimension taille, PopulationVilles pop){
		
		initPanneau(config, taille, pop);
		
		
		
	}
	
	public void initPanneau(Configuration config, Dimension taille, PopulationVilles pop) {
		
		tailleVehicule = new Dimension((int)(taille.width * 0.2), (int)(taille.height*0.3));
		tailleConfig = new Dimension((int)(taille.width * 0.2), (int)(taille.height*0.5));
		tailleCentre = new Dimension((int)(taille.width * 0.7), (int)(taille.height*0.4));
		tailleProgression = new Dimension((int)(taille.width * 0.2), (int)(taille.height*0.10));
		tailleControl =new Dimension((int)(taille.width * 0.2), (int)(taille.height*0.10));
		
		PanneauCentral panelMileu = new PanneauCentral(config,tailleCentre,pop);
		PanneauProgression panelN = new PanneauProgression(tailleProgression);
		PanneauVehicule panelV = new PanneauVehicule(tailleVehicule);
		PanneauConfig panelC = new PanneauConfig(tailleConfig);
		PanneauGestion panelCtrl = new PanneauGestion(tailleControl);
		
		
		// Dimension couleur et position du PanneauPrincipal
		this.setPreferredSize(new Dimension(taille));
		//this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		
		// ajout des quatres panels
		this.add(panelV,BorderLayout.LINE_START);
		this.add(panelN,BorderLayout.PAGE_START);
		this.add(panelC,BorderLayout.LINE_END);
		this.add(panelCtrl,BorderLayout.PAGE_END);
		this.add(panelMileu,BorderLayout.CENTER);
		
		// ajout des deux barres scrolls
		
		
		
		
		
		
		

	}
}


