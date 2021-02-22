public class Ninja extends Human{
	public int stealth = 10;
	public Ninja(String name) {	
		super(name);
		this.setHuman(name, 3, 3, 100, 10);
	}
	public void steal(Human target) {
		System.out.println(this.name + "stole from" + target.name );
		target.setHealth(getHealth(target) - stealth );
		this.setHealth(getHealth(this) + stealth);
		this.displayHealth();
		target.displayHealth();
	}
	public void runAway(){
		System.out.println(this.name + " ran away");
        this.setHealth(getHealth(this) - 10);
        this.displayHealth();
    }
}