package vueGraphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import enginCartes.Configuration;
import problemeVilles.PopulationVilles;

public class PanneauCentral extends JPanel  {
	
	
	JScrollBar barH = new JScrollBar(JScrollBar.HORIZONTAL, 100,100, 0, 500);
	JScrollBar barV = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
	
	
	
	PanneauCentral(Configuration config, Dimension tailleCentre, PopulationVilles pop){
		
		initPanneauCentral(tailleCentre);
	}
	
	private void initPanneauCentral(Dimension tailleCentre){
		
		this.setPreferredSize(new Dimension(tailleCentre));
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.WHITE));
		
		this.add(barH,BorderLayout.PAGE_END);
		this.add(barV,BorderLayout.LINE_END);
		
		
	}

}
