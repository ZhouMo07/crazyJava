package wolfpac;
//子类调用父类构造器
class Creature
{
	public Creature()
	{
		System.out.println("Creature no parameter");
	}
}
class Animal extends Creature
{
	public Animal()
	{
		System.out.println("Animal no parameter");
	}
	public Animal(String name)
	{
		System.out.println("Animal with a parameter，" + "the animal's name is: " + name);
	}
	public Animal(String name, int age)
	{
		this(name);
		System.out.println("Animal with two parameter，" + "its age is: " + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{

		super("wolf",3);
		System.out.println("Wolf with no parameter");
	}
	public static void main(String[] args)
	{
		new Wolf();
		//new Animal();
	}
}