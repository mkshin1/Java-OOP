public class HumanTester {

	public static void main(String[] args) {
		Human h = new Human("human");
		h.attack(h);
		h.displayHealth();
		Wizard wizard1 = new Wizard("Wizard1");
		Samurai samurai1 = new Samurai("Samurai1");
		Ninja ninja1 = new Ninja("Ninja1");
	
		wizard1.fireball(ninja1);
		wizard1.heal(ninja1);
		
		ninja1.runAway();
		ninja1.steal(wizard1);
		
		
		samurai1.meditate();
		samurai1.deathBlow(wizard1);
		samurai1.deathBlow(ninja1);
	
		
		wizard1.heal(ninja1);
		wizard1.heal(wizard1);
		
		System.out.println(Samurai.howmany());
		
	}
}