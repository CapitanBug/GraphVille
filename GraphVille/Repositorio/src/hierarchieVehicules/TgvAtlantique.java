package hierarchieVehicules;

public class TgvAtlantique extends AbstractTrain {
	
public static final int NBPASSAGERS = 485 ;
public static final String NOMMODELE = "Tgv Atlantique ";


		public TgvAtlantique() {
			
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
