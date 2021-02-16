public class Gorilla extends Mammal {

	public void throwSomething() {
		
		setEnergy(getEnergy() - 20);
		System.out.println("gorilla threw something and their energy decreased by 5!");
		displayEnergy();
	}
	public void eatBananas() {
		setEnergy(getEnergy() + 10);
		System.out.println("gorilla ate bananas and their energy increased by 10!");
		displayEnergy();
	}
	public void climb() {
		setEnergy(getEnergy() - 10);
		System.out.println("gorilla climbed a tree and their energy decreased by 10!");
		displayEnergy();
	}

}