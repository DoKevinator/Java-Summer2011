public class Sphere extends ThreeDimensionalShape
{
	private double radius;
	
	public Sphere( double newRadius )
	{
		radius = newRadius;
	}
	
	public double getVolume()
	{
		return ( 4/3 ) * 3.14 * radius * radius * radius;
	}
}