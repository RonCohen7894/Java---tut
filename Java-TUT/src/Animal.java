public class Animal
{
	protected int height;
	protected int weight;
	protected String name;
	
	public Animal(int height, int weight, String name)
	{
		this.height = height;
		this.weight = weight;
		this.name = name + "";
	}

	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
