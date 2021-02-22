public class Wizard extends Human{
	public Wizard(String name) {
		super(name);
		this.setHuman(name, 3, 3, 50,8);
	}
	public void heal(Human target) {
		System.out.println(this.name + " heals " + target.name);
		target.setHealth(target.getHealth(target) + this.getIntel());
		target.displayHealth();
	}
	public void fireball(Human target) {
		System.out.println(this.name + " threw fireball" + target.name);
		target.setHealth(target.getHealth(target) - this.getIntel()*3);
		target.displayHealth();

	}
}