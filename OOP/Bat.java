public class Bat extends Mammal{
	public Bat() {
		setEnergy(300);
	}
	public void eatHumans() {
		setEnergy(getEnergy() + 15);
		System.out.println("The Bat ate the human and its energy increased by 15!");
		displayEnergy();
	}
	public void attackTown() {
		setEnergy(getEnergy() - 80);
		System.out.println("The Bat is flying, energy decreased by 80!");
		displayEnergy();
	}
    public void fly() {
		setEnergy(getEnergy() - 35);
		System.out.println("flying bat watch out! its energy decreased by 35!");
		displayEnergy();
	}

}