package hierarchieVehicules;

public class CS100 extends AbstractAvion {

public static final int NBPASSAGERS = 110;
public static final String NOMMODELE = "CS100";
	
	public CS100() {
		
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
