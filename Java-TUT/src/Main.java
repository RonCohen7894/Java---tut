
public class Main
{
	public static void main(String args[])
	{
		Animal a = new Animal(60, 90, "John");
		Mammal m = new Mammal(a, 0, 5);
		Lion l = new Lion(a, m, true, "Gold-Yellow");
		
		System.out.println(a.toString());
		System.out.println(m.toString());
		System.out.println(l.toString());
	}	
}