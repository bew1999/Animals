
public class Bird extends Animal{

	private static final int STAMINAMAX = 20;
	private static final int HUNGERMAX = 15;

	private boolean alive;
	private int staminaLvl;
	private int hungerLvl;
	private String name;

	public Bird() {
		alive = true;
		staminaLvl = 10;
		hungerLvl = 5;
		name = "Tweety";
	}// works

	public Bird(String name) {
		alive = true;
		staminaLvl = 10;
		hungerLvl = 5;
		this.name = name;
	}// works

	// Restores the bird's stamina
	public void rest() {
		if (alive)
			staminaLvl = STAMINAMAX;
		else
			System.out.println(name + " will be resting for all ethernity, considering it is dead.");
	}//works

	// Restores some of the bird's hunger
	public void eat() {
		if (alive && (hungerLvl <= (HUNGERMAX - 2))) {
			hungerLvl += 2;
		} else if (hungerLvl > (HUNGERMAX - 2)) {
			hungerLvl = HUNGERMAX;
		} else if (!(alive)) {
			System.out.println(name + " is dead so it cannot eat.");
		}//works
	}
	
	// A bird flies using some stamina and hunger (if the bird has no stamina or hunger it dies)
	public void fly() {
		if (!(alive))
			System.out.println("A dead bird cannot fly. In case you did not know " + name + " is dead.");
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

	public boolean equals(Bird bird) {
		if ((this.name == bird.name) && (this.staminaLvl == bird.staminaLvl) && (this.hungerLvl == bird.hungerLvl)
				&& (this.alive == bird.alive))
			return true;
		else
			return false;
	}// sort of works

}
