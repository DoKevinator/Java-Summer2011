public class Square extends TwoDimensionalShape
{
	private double side;
	
	public Square( double newSide )
	{
		side = newSide;
	}
	
	public double getArea()
	{
		return side * side;
	}
}