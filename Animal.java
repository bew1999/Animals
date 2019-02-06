
public abstract class Animal {

	private boolean alive;
	private int staminaLvl;//max stamina depends on the type of animal
	private int hungerLvl;//max hunger depends on the type of animal
	//the higher the number the less hungry the animal is
	private String name;

	//will restore an animal's stamina
	public abstract void rest();

	//will restore some of an animal's hunger
	public abstract void eat();
	
	//displays an animal's name stamina and hunger if they are alive
	public String toString() {
		if (alive)
			return name + ": Stamina lvl.: " + staminaLvl + " Hunger lvl.: " + hungerLvl;
		else
			return name + " is dead.";
	}
	
	//checks whether two animal objects are equal
	public boolean equals(Animal animal) {
		if ((this.name == animal.name) && (this.staminaLvl == animal.staminaLvl) && (this.hungerLvl == animal.hungerLvl)
				&& (this.alive == animal.alive))
			return true;
		else
			return false;
	}
}
