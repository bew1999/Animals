
public class Fish extends Animal {

	private static final int STAMINAMAX = 20;
	private static final int HUNGERMAX = 25;

	private boolean alive;
	private int staminaLvl;
	private int hungerLvl;
	private String name;

	public Fish() {
		alive = true;
		staminaLvl = 15;
		hungerLvl = 20;
		name = "Sushi";
	}// works

	public Fish(String name) {
		alive = true;
		staminaLvl = 15;
		hungerLvl = 20;
		this.name = name;
	}// works

	// Restores a fish's stamina
	public void rest() {
		if (alive)
			staminaLvl = STAMINAMAX;
		else
			System.out.println(name + " will be resting for all ethernity, considering it is dead.");
	}//works

	// Restores some of the fish's hunger
	public void eat() {
		if (alive && (hungerLvl <= (HUNGERMAX - 2))) {
			hungerLvl += 2;
		} else if (hungerLvl > (HUNGERMAX - 2)) {
			hungerLvl = HUNGERMAX;
		} else if (!(alive)) {
			System.out.println(name + " is dead so it cannot eat.");
		}//works
	}

/*
 * This method has been axed for the time being.
 * 
	// A fish attempt to eat another fish
	// @param fish a fish object
	public void eat(Fish fish) {
		if (fish != null) {
//		if (this.equals(fish) != true) {
			if (alive && (fish.isAlive()) && (this.stamina >= fish.getStamina())) {//the fish trying to eat the other has to be alive and have more stamina than the other fish
				hunger = HUNGERMAX;
				fish.kill();
				fish = null;
			} else if (alive && !(fish.isAlive())) {
				hunger = HUNGERMAX;
				fish = null;
			} else if (alive == false) {
				System.out.println(name + " is dead so it cannot eat.");
			} else if (stamina < fish.getStamina()) {
				System.out.println(name + " is too tired to eat " + fish.getName());
			}
		} else if (fish == null)
			System.out.println("There is no fish to eat. It was probably already eaten.");
	}
*/
	
	// A fish swims using some stamina and hunger (if the fish has no stamina or
	// hunger it dies)
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

	public void kill() {
		alive = false;
		staminaLvl = 0;
		hungerLvl = 0;
		System.out.println(name + " has died.");
	}//works

	public void revive() {
		alive = true;
		staminaLvl = 5;
		hungerLvl = 5;
		System.out.println(name + " was miraculously revived.\n" + this.toString());
	}
	
	public boolean isAlive() {
		return alive;
	}

	public int getStamina() {
		return staminaLvl;
	}// works

	public int getHunger() {
		return hungerLvl;
	}// works

	public String getName() {
		return name;
	}// works

	public String toString() {
		if (alive)
			return name + ": Stamina lvl.: " + staminaLvl + " Hunger lvl.: " + hungerLvl;
		else
			return name + " is dead.";
	}// works

	public boolean equals(Fish fish) {
		if ((this.name == fish.name) && (this.staminaLvl == fish.staminaLvl) && (this.hungerLvl == fish.hungerLvl)
				&& (this.alive == fish.alive))
			return true;
		else
			return false;
	}// sort of works

}
