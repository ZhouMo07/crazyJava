package wolfpac;
//������ø��๹����
class Creature
{
	public Creature()
	{
		System.out.println("Creature�޲����Ĺ�����");
	}
}
class Animal extends Creature
{
	public Animal()
	{
		System.out.println("Animal�޲����Ĺ�����");
	}
	public Animal(String name)
	{
		System.out.println("Animal��һ�������Ĺ�������" + "�ö��������Ϊ" + name);
	}
	public Animal(String name, int age)
	{
		this(name);
		System.out.println("Animal�����������Ĺ�������" + "��������Ϊ" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{

		super("��̫��",3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args)
	{
		new Wolf();
		//new Animal();
	}
}