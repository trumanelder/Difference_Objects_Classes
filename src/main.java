
public class main {

	public static void main(String[] args) {
		//If the class itself is a blueprint, this is like following that blueprint to create the physical object
		//We create a new creature object called "rat" and give it the properties of its race being "Rat", its level being 1, and it being playable set to false
		Creature rat = new Creature("Rat", 1, false);
		
		//Now that we have an object created from the creature class, we can use the methods created to view the properties
		System.out.println(rat.get_race());
		System.out.println(rat.get_level());
		System.out.println(rat.get_playable());
		
		//With setter methods, we can alter the level property
		System.out.println("Rat has leveled up!");
		rat.set_level(2);
		System.out.println(rat.get_level());
		
		System.out.println(rat);
	}

}
