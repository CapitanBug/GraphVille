package vueGraphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class PanneauVilles extends JPanel  {
	
	JScrollBar barH = new JScrollBar(JScrollBar.HORIZONTAL, 100,100, 0, 500);
	JScrollBar barV = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
	
	
	
	PanneauVilles(){
		
		initPanneauVilles();
	}
	
	private void initPanneauVilles(){
		
		this.setPreferredSize(new Dimension(50,50));
		this.setBackground(Color.GRAY);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
		
		this.add(barH,BorderLayout.PAGE_END);
		this.add(barV,BorderLayout.LINE_END);
		
		// comme on 
		
		
		
	}

}
