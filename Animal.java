
public abstract class Animal {

	private boolean alive;
	private int staminaLvl;//max stamina depends on the type of animal
	private int hungerLvl;//max hunger depends on the type of animal
	//the higher the number the less hungry the animal is
	private String name;

	public abstract void rest();

	public abstract void eat();
	
	public String toString() {
		if (alive)
			return name + ": Stamina lvl.: " + staminaLvl + " Hunger lvl.: " + hungerLvl;
		else
			return name + " is dead.";
	}
	
	public boolean equals(Animal animal) {
		if ((this.name == animal.name) && (this.staminaLvl == animal.staminaLvl) && (this.hungerLvl == animal.hungerLvl)
				&& (this.alive == animal.alive))
			return true;
		else
			return false;
	}
}