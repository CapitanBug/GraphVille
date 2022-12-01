package vueGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class PanneauPrincipal extends JPanel {
	
	PanneauVilles panelMileu = new PanneauVilles();
	JPanel panelN = new PanneauNiveau();
	PanneauVehicule panelV = new PanneauVehicule();
	PanneauConfig panelC = new PanneauConfig();
	PanneauControl panelCtrl = new PanneauControl();
	
	

	PanneauPrincipal(){

		initPanneau();
		
	}
	
	public void initPanneau() {
		
		// Dimension couleur et position du PanneauPrincipal
		this.setPreferredSize(new Dimension(50, 100));
		this.setBackground(Color.WHITE);
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


