package vueGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import enginCartes.Configuration;
import enginCartes.MoteurCartes;
import problemeVilles.PopulationVilles;

public class PanneauPrincipal extends JPanel {

	Cadre cadre = new Cadre();

	private Dimension tailleVehicule;
	private Dimension tailleConfig;
	private Dimension tailleCentre;
	private Dimension tailleProgression;
	private Dimension tailleControl;
	private Dimension tailleMenu;
	private Configuration config;
	private Dimension taille;
	private PopulationVilles pop;

	public PanneauPrincipal(Configuration config, Dimension taille, PopulationVilles pop, JFrame myFrame) {

		this.config = config;
		this.taille = taille;
		this.pop = pop;
		initPanneau(config, taille, pop, myFrame);

	}

	public void initPanneau(Configuration config, Dimension taille, PopulationVilles pop, JFrame myFrame) {

		tailleVehicule = new Dimension((int) (taille.width * 0.2), (int) (taille.height * 0.3));
		tailleConfig = new Dimension((int) (taille.width * 0.2), (int) (taille.height * 0.5));
		tailleCentre = new Dimension((int) (taille.width * 0.7), (int) (taille.height * 0.4));
		tailleProgression = new Dimension((int) (taille.width * 0.2), (int) (taille.height * 0.10));
		tailleControl = new Dimension((int) (taille.width * 0.2), (int) (taille.height * 0.10));
		tailleMenu = new Dimension((int) (taille.width * 1), (int) (taille.height * 0.02));

		MoteurCartes moteur = new MoteurCartes(pop, config);

		MenuBar menuBar = new MenuBar(tailleMenu, cadre, pop);
		PanneauCentral panelMilieu = new PanneauCentral(pop, config, tailleCentre);
		PanneauProgression panelN = new PanneauProgression(tailleProgression, menuBar);
		PanneauVehicule panelV = new PanneauVehicule(tailleVehicule);
		PanneauConfig panelC = new PanneauConfig(tailleConfig);
		PanneauGestion panelCtrl = new PanneauGestion(moteur, config, panelN, panelMilieu, tailleControl);

		// Dimension couleur et position du PanneauPrincipal
		this.setPreferredSize(new Dimension(taille));

		this.setLayout(new BorderLayout());

		// ajout des quatres panels
		this.add(panelV, BorderLayout.LINE_START);
		this.add(panelN, BorderLayout.PAGE_START);
		this.add(panelC, BorderLayout.LINE_END);
		this.add(panelCtrl, BorderLayout.PAGE_END);
		this.add(panelMilieu, BorderLayout.CENTER);

	}
}
