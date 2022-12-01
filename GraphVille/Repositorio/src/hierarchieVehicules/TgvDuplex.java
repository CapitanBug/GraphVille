package hierarchieVehicules;

public class TgvDuplex extends AbstractTrain  {
	
	public static final int NBPASSAGERS = 455 ;
	public static final String NOMMODELE = "Tgv Duplex";


		public TgvDuplex() {
			
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
