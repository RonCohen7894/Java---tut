public class Mammal extends Animal
{
	protected int milkprotation;
	protected int milkNeeded;
	
	public Mammal(Animal a, int mp, int mn) 
	{
		super(a.height, a.weight, a.name);
		
		this.milkprotation = mp;
		this.milkNeeded = mn;
	}

	public String toString() {
		return "Mammal [height=" + height + ", weight=" + weight + ", name=" + name+ " milkprotation=" + milkprotation + ", milkNeeded=" + milkNeeded + "]";
	}

	public int getMilkprotation() {
		return milkprotation;
	}

	public void setMilkprotation(int milkprotation) {
		this.milkprotation = milkprotation;
	}

	public int getMilkNeeded() {
		return milkNeeded;
	}

	public void setMilkNeeded(int milkNeeded) {
		this.milkNeeded = milkNeeded;
	}
}
