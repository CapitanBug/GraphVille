package vueGraphique;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JProgressBar;
import javax.swing.JPanel;

public class PanneauProgression extends JPanel {

	private JProgressBar bar;

	PanneauProgression(Dimension tailleProgression, MenuBar menuBar) {

		initPanneau(tailleProgression, menuBar);
	}

	private void initPanneau(Dimension tailleProgression, MenuBar menuBar) {

		this.setPreferredSize(new Dimension(tailleProgression));
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		this.add(menuBar);

		bar = new JProgressBar(0, 100);
		bar.setValue(0);
		bar.setStringPainted(true);
		this.add(bar);

	}

	public void setProgressBar(int v) {
		bar.setValue(v);
	}

}
