package wolfpac;
//子类调用父类构造器
class Creature
{
	public Creature()
	{
		System.out.println("Creature无参数的构造器");
	}
}
class Animal extends Creature
{
	public Animal()
	{
		System.out.println("Animal无参数的构造器");
	}
	public Animal(String name)
	{
		System.out.println("Animal带一个参数的构造器，" + "该动物的名字为" + name);
	}
	public Animal(String name, int age)
	{
		this(name);
		System.out.println("Animal带两个参数的构造器，" + "它的年龄为" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{

		super("灰太狼",3);
		System.out.println("Wolf无参数的构造器");
	}
	public static void main(String[] args)
	{
		new Wolf();
		//new Animal();
	}
}