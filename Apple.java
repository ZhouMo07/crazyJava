package AppleConstructor;

public class Apple {

	public String name;
	public String color;
	public double weight;
	//constructor with no parameter
	public Apple()
	{
		
	}
	//constructor with two parameter
	public Apple(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	//constructor with three parameter
	public Apple(String name, String color, double weight)
	{
		this(name, color);
		this.weight = weight;
	}
}
