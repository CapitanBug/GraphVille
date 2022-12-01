package hierarchieVehicules;

public class GreyHoundG4500 extends AbstractAutobus {
	
	private static final int NBPASSAGERS = 55 ;
	private static final String NOMMODELE = "GreyHoundG4500";
	


		public GreyHoundG4500() {
			
			super(NBPASSAGERS);
			
		}
		
		
		public  int getNbPassagersMax() {
			return NBPASSAGERS;
		}
		
		

		public static String getNommodele() {
			return NOMMODELE;
		}


		public String toString() {
			
			return " Modele : " + NOMMODELE;
		}
	
	

}
