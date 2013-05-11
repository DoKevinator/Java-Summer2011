public class Tetrahedron extends ThreeDimensionalShape
{
	private double base;
	private double height;
	private double height2;
	
	public Tetrahedron( double newBase, double newHeight, double newHeight2 )
	{
		base = newBase;
		height = newHeight;
		height2 = newHeight2;
	}
	
	public double getVolume()
	{
		return ( 1/3 ) * base * height * height2;
	}
}