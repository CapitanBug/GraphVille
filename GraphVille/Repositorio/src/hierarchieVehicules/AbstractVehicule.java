package hierarchieVehicules;

public abstract class AbstractVehicule implements InterfaceVehicules {
	
	int typeCarburant;
	int nbPassagers;
	
	
	public AbstractVehicule(int typeCarburant, int nbPassagers) {
		
		this.typeCarburant = typeCarburant;
		this.nbPassagers = nbPassagers;
		
	}
	
	public int getTypeCarburant() {
		
		return typeCarburant ;
	}
	
	public void setCarburant(int typeCarburant) {
		
		this.typeCarburant = typeCarburant;
			
	}

	public abstract int getNbPassagersMax();

	
	
}
