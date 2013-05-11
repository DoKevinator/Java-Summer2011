//apple class inherits food and implents the inteface fruit
//kevin do
//userID 1711886
//FINAL NUMBER 5


public class Apple extends Food implements Fruit		//public class
{
	private String seed;		//variable used by interface
	
	public Apple()			//constructor for apple
	{
		super( "trees" );		//calls superclass to pass a parameter
	}
	
	public void setSeed( String seed )		//sets the seed if available or not
	{
		this.seed = seed;
	}
	
	public String getSeed()
	{
		return seed;
	}
	
	public void MadeFrom()		//madefrom a superclass method that is inherited
	{
		super.MadeFrom();
	}
	public void isSeedPresent()		//determines if the seed is there or not
	{
		System.out.print( "Seed is " + seed + " there." );
	}
	
	public void eat()			// method from abstract class that is implemented and overriden.
	{	
		System.out.println( "This apple is very good." );
	}
}