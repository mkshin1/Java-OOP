public class Samurai extends Human {
	private static int count = 0;
	public Samurai(String name) {
		super(name);
		this.setHuman(name, 3, 3, 200, 3);
		count++;
	}
	public void deathBlow(Human target) {
		System.out.println(this.name + " death blow " + target.name);
		this.setHealth(getHealth(this) / 2);
		target.setHealth(0);
		this.displayHealth();
		target.displayHealth();
		this.displayHealth();
	}
	public void meditate() {
		System.out.println(this.name + " meditate ");
		int currentHealth = this.getHealth(this);
		this.setHealth(currentHealth + currentHealth / 2);
		this.displayHealth();
	}
	public static int howmany() {
		System.out.println("There are in total " + count + " samurais");
		return count;
	}
}