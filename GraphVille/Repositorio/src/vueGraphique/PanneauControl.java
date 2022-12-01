package vueGraphique;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauControl extends JPanel {
	
	JButton start;
	JButton restart;
	
	PanneauControl(){
		
		initPanneauC();
	}
	
	private void initPanneauC() {
		
		this.setPreferredSize(new Dimension(100,100));
		this.setBackground(Color.GRAY);
		this.setVisible(true);
		this.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 1, Color.BLACK));
		
		addAButton("Demmarrer",this);
		addAButton("Redemmarrer",this);
		
	}
	
	private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setBackground(Color.lightGray);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
	
	

}
