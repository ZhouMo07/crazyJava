package AppleConstructor;

public class Pear extends Fruit{

	public Pear( )
	{
		System.out.println("this is Pear ");
	}
	public void info()
	{
		System.out.println("i am a pear, my weight is: "
				+ weight + "g.");
		super.info();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p call a Field and method of Fruit
		
		Pear p = new Pear();
		p.weight = 23;
		p.info();
		
	}

}
