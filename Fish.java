
public class Fish extends Animal {

	private static final int STAMINAMAX = 20;//max stamina for every fish
	private static final int HUNGERMAX = 25;//max hunger for every fish

	private boolean alive;
	private int staminaLvl;
	private int hungerLvl;
	private String name;

	//default constructor
	public Fish() {
		alive = true;
		staminaLvl = 15;
		hungerLvl = 20;
		name = "Sushi";
	}

	//constructor
	//@param name of fish
	public Fish(String name) {
		alive = true;
		staminaLvl = 15;
		hungerLvl = 20;
		this.name = name;
	}

	//Fully restores a fish's stamina
	public void rest() {
		if (alive)
			staminaLvl = STAMINAMAX;
		else
			System.out.println(name + " will be resting for all ethernity, considering it is dead.");
	}

	//Restores 2 of a fish's hunger
	public void eat() {
		if (alive && (hungerLvl <= (HUNGERMAX - 2))) {
			hungerLvl += 2;
		} else if (hungerLvl > (HUNGERMAX - 2)) {
			hungerLvl = HUNGERMAX;
		} else if (!(alive)) {
			System.out.println(name + " is dead so it cannot eat.");
		}
	}


	//A fish swims using 3 stamina and 2 hunger
	//if a fish's staminaLvl and hungerLvl is 0 when it tries to swim it dies
	public void swim() {
		if (!(alive))
			System.out.println("A dead fish cannot swim. In case you did not know " + name + " is dead.");
		else if ((staminaLvl == 0) && (hungerLvl == 0)) { // if the fish is tired and hungry and tries to swim it dies.
			alive = false;
			System.out.println(name + " has died.");
		} else {
			if (staminaLvl <= 3)
				staminaLvl = 0;
			else
				staminaLvl -= 3;
			if (hungerLvl <= 2)
				hungerLvl = 0;
			else
				hungerLvl -= 2;
		}
	}

	//Kills a fish (sets alive to false if already true)
	//Displays text showing the fish has died
	public void kill() {
		if (alive == true) {
			alive = true;
			staminaLvl = 0;
			hungerLvl = 0;
			System.out.println(name + " has died.");
		} else
			System.out.println(name + " is already dead.")
	}

	//Brings a fish back to life (sets alive to true if already alive is false)
	//Displays text showing the fish is alive along with its current staminaLvl and hungerLvl
	public void revive() {
		if (alive == false) {
			alive = true;
			staminaLvl = 5;
			hungerLvl = 5;
			System.out.println(name + " was miraculously revived.\n" + this.toString());
		} else
			System.out.println(name + " is already alive.\n" + this.toString())
	}
	
	//Checks whether a fish is alive
	//@return alive variable
	public boolean isAlive() {
		return alive;
	}

	//Gets staminaLvl
	//@return staminaLvl
	public int getStamina() {
		return staminaLvl;
	}

	//Gets hungerLvl
	//@return hungerLvl
	public int getHunger() {
		return hungerLvl;
	}

	//Gets name
	//@return name
	public String getName() {
		return name;
	}

	//Display a fish's name, staminal level, and hunger level (if the fish is alive)
	public String toString() {
		if (alive)
			return name + ": Stamina lvl.: " + staminaLvl + " Hunger lvl.: " + hungerLvl;
		else
			return name + " is dead.";
	}

	//Checks if two fish objects are equal
	public boolean equals(Fish fish) {
		if ((this.name == fish.name) && (this.staminaLvl == fish.staminaLvl) && (this.hungerLvl == fish.hungerLvl)
				&& (this.alive == fish.alive))
			return true;
		else
			return false;
	}

}
