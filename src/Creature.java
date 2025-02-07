//In java, a class is a template that we create to make use of or manipulate
//In this case, I'm defining a "Creature" for a game. There's two ways I could go with this
//using the creature itself or further defining other more in depth creatures, using this as a base template

public class Creature {
	
	//Here, these variables make up the properties of the creature, or whatever class I'm creating. These are meant to be manipulated or give information about the object created from this class
	//We make these private so they can be protected from direct manipulation outside of this class/object
	private boolean playable;
	private int level;
	private String race;
	
	//This is our constructor. We use this to let some other file or section of code create an object using this template
	//We provide arguments to its creating to determine the necessary properties to be defined at creation
	public Creature(String race, int level, boolean playable) {
		this.race = race;
		this.level = level;
		this.playable = playable;
	}
	
	
	//Here, we setup methods to have access to the protected internal properties of the class
	public String get_race() {
		return race;
	}
	
	public int get_level() {
		return level;
	}
	
	public boolean get_playable() {
		return playable;
	}
	
	//This method allows the level property to be manipulated from the outside, without directly interacting with the variable
	public void set_level(int level) {
		this.level = level;
	}
	
    @Override
    public String toString() {
        return "Level " + level + " " + race;
    }

}
