package programmePrincipal;

import javax.swing.SwingUtilities;

import vueGraphique.Cadre;

public class ProgrammePrincipal {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Cadre f = new Cadre();
				f.createAndShowGui();
			}
		});
	}

}
