package hierarchieVehicules;

public class FabriqueVehicule {
	
	private static int nbTypesVehicule = 6;
	
	
	
	public static int getNbTypesVehicule() {
		return nbTypesVehicule;
	}



	public void setNbTypesVehicule(int nbTypesVehicule) {
		this.nbTypesVehicule = nbTypesVehicule;
	}



	public static AbstractVehicule obtenirVehicule(int qVehicule) {
		
		AbstractVehicule unVehicule = null;
		switch(qVehicule) {
		
		case 0 :
			
			unVehicule = new CS300();
			
			break;
		
		case 1 :
			
			unVehicule = new CS100();
			
			break;
			
		case 2:
			
			unVehicule = new GreyHound102D3();
			
			break;
			
		case 3 :
			
			unVehicule = new GreyHoundG4500();
			
			break;
		
		case 4 :
			
			unVehicule = new TgvDuplex();
			
			break;
		
		case 5 :
			
			unVehicule = new TgvAtlantique();
			
			break;
		
		}
		return unVehicule;
		
		
		
		
		
		
	}

}
