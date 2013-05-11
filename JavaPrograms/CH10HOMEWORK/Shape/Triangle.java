public class Triangle extends TwoDimensionalShape
{
	private double base;
	private double height;
	
	public Triangle( double newBase, double newHeight )
	{
		base = newBase;
		height = newHeight;
	}
	
	public double getArea()
	{
		return ( base * height ) / 2;
	}
}