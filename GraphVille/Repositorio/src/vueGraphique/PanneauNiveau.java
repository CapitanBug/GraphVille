package vueGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class PanneauNiveau extends JPanel{
	JTextArea taskOutput;
	JProgressBar bar;
	PanneauNiveau(){
		
		initPanneau();
	}
	
	private void initPanneau() {
		
		this.setPreferredSize(new Dimension(100,100));
		this.setBackground(Color.GRAY);
		this.setVisible(true);
		
		// Ajout de la Bar de progression
		
		bar = new JProgressBar(0,100);
		bar.setValue(0);
		bar.setStringPainted(true);
		this.add(bar);
		
		 	/*taskOutput = new JTextArea(5, 20);
	        taskOutput.setMargin(new Insets(5,5,5,5));
	        taskOutput.setEditable(false);*/
		
		
		
	}
	
	
	
	

}
