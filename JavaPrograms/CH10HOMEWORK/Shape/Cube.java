public class Cube extends ThreeDimensionalShape
{
	private double side;
	
	public Cube( double newSide )
	{
		side = newSide;
	}
	
	public double getVolume()
	{
		return side * side * side;
	}
}