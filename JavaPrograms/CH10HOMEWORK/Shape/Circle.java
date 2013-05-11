public class Circle extends TwoDimensionalShape
{
	private double radius;
	
	public Circle( double newRadius )
	{
		radius = newRadius;
	}
	
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
}