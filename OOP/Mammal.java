
public class Mammal {
	private int energyLevel;
	
	public Mammal(int energyLevel) {
		setEnergy(energyLevel);
		
	}
	public Mammal() {
		setEnergy(100);
	}

	public void setEnergy(int energyLevel){
	    this.energyLevel = energyLevel;
	}

	public int getEnergy(){
	    return energyLevel;
	}

	 public int displayEnergy(){
	     System.out.println("Enegry level is" + energyLevel);

	     return energyLevel;
	    }
}