
public abstract class Mammal extends Animal{
	private boolean alive;
	private int staminaLvl;
	private int hungerLvl;
	private String name;

	public abstract void rest();

	public abstract void eat();
	
	public abstract void run();
	
	public abstract String toString();
	
}
