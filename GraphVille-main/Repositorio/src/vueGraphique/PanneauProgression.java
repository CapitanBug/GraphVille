package vueGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class PanneauProgression extends JPanel{
	
	JProgressBar bar;
	
	PanneauProgression(Dimension tailleProgression){
		
		initPanneau(tailleProgression);
	}
	
	private void initPanneau(Dimension tailleProgression) {
		
		this.setPreferredSize(new Dimension(tailleProgression));
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		
		// Ajout de la Bar de progression
		
		bar = new JProgressBar(0,100);
		bar.setValue(0);
		bar.setStringPainted(true);
		this.add(bar);
		
		
		
		
	}
	
	
	
	

}
