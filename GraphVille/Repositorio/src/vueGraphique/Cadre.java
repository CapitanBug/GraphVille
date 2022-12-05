package vueGraphique;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import enginCartes.Configuration;

public class Cadre extends JFrame implements Runnable {
	
	private Dimension tailleEcran;
	private Configuration config;
	private  JFrame myFrame;
	private  PanneauPrincipal pane;
	
	
	
	public Cadre() {
	
	super();

		
	}
	
	public  void createAndShowGui() {
		myFrame = new JFrame("GUI");
		pane = new PanneauPrincipal();

		
		Configuration config = new Configuration();
		Toolkit.getDefaultToolkit().getScreenSize();
		
		myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
                handleClosing();
            }
        });
		
		myFrame.setContentPane(pane);
		myFrame.setVisible(true);
		
	}
	
		public  void handleClosing() {
			
			int result = JOptionPane.showConfirmDialog(null,
		            "Etes vous sur de vouloir quitter ?", 
		            "Conformation de Sortie : ",
		            JOptionPane.YES_NO_CANCEL_OPTION);
		        if (result == JOptionPane.YES_OPTION)
		        	setDefaultCloseOperation(EXIT_ON_CLOSE);
		        if (result == JOptionPane.NO_OPTION)
		        	myFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		        else if (result == JOptionPane.CANCEL_OPTION)
		        	myFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		      
		}


		@Override
		public void run() {
			// TODO Auto-generated method stub
		
		}
	
}

	