public class Lion extends Mammal
{
	private boolean male;
	private String  color;
	
	public Lion(Animal a, Mammal m, boolean male, String color) 
	{
		super(a ,m.milkprotation, m.milkNeeded);
		
		this.male  = male;
		this.color = color;
	}

	public String toString() {
		return "Lion [height=" + height + ", weight=" + weight + ", name=" + name+ "milkprotation=" + milkprotation + ", milkNeeded=" + milkNeeded + "male=" + male + ", color=" + color + "]";
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
