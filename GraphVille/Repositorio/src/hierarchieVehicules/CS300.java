package hierarchieVehicules;

public class CS300 extends AbstractAvion {
	
private static final int NBPASSAGERS = 130;
private static final String NOMMODELE = "CS300";


	public CS300() {
		
		super(NBPASSAGERS);
		
	}
	
	
	
	public int getNbPassagersMax() {
		return NBPASSAGERS;
	}

	public static String getNommodele() {
		return NOMMODELE;
	}



	public String toString() {
		
		return " Modele : " + NOMMODELE;
	}

}
