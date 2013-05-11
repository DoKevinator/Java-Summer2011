//inherits from food and implements from interface fruit
//kevin do
//userID 1711886
//FINAL NUMBER 5

public class Watermelon extends Food implements Fruit		//public class
{
	private String seed;		//seed used in interface
	
	public Watermelon()		//constructor to pass parameter to superclass
	{
		super( "plants" );
	}
	
	public void setSeed( String seed )			// setseed from interface
	{
		this.seed = seed;
	}
	
	public String getSeed()
	{
		return seed;
	}
	
	public void MadeFrom()			//madefrom the superclass method is used 
	{
		super.MadeFrom();
	}
	
	public void isSeedPresent()		//determind if seed is there with interface
	{
		System.out.print( "Seed is " + seed + " there," );
	}
	
	public void eat()			//abstract method from superclass is implemented and overriden
	{
		System.out.println( "This watermelon is very delicious and juicy." );
	}
}