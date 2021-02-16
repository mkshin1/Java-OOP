public class Bat extends Mammal{
	public Bat() {
		setEnergy(100);
	}
	public void eatHumans() {
		setEnergy(getEnergy() + 15);
		System.out.println("The Bat ate the human and its energy increased by 15!");
		displayEnergy();
	}
	public void attackTown() {
		setEnergy(getEnergy() - 5);
		System.out.println("The Bat is flying, energy decreased by 5!");
		displayEnergy();
	}
    public void fly() {
		setEnergy(getEnergy() - 10);
		System.out.println("flying bat watch out! its energy decreased by 10!");
		displayEnergy();
	}

}