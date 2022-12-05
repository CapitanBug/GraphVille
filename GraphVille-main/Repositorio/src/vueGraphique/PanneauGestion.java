package vueGraphique;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauGestion extends JPanel {
	
	JButton start;
	JButton restart;
	
	public PanneauGestion(Dimension tailleControl){
		
		initPanneauGestion(tailleControl);
	}
	
	private void initPanneauGestion(Dimension tailleControl) {
		
		this.setPreferredSize(new Dimension(tailleControl));
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		this.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.WHITE));
		
		addAButton("Demmarrer",this);
		addAButton("Redemmarrer",this);
		
	}
	
	private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
	
	

}
