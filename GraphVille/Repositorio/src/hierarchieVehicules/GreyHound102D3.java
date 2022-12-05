package hierarchieVehicules;

public class GreyHound102D3 extends AbstractAutobus {
	
	public static final int NBPASSAGERS = 46 ;
	public static final String NOMMODELE = "GreyHound102D3";
	

		public GreyHound102D3() {
			
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
