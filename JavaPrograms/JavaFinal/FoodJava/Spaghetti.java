//spaghetti extends foods abstract class but not interface
//kevin do
//userID 1711886
//FINAL NUMBER 5


public class Spaghetti extends Food
{
	public Spaghetti()		//constructor to pass to the superclass
	{
		super( "humans" );
	}
	
	public void eat()			// eat abstract class is overridenand implemented from superclass
	{
		System.out.println( "This spaghetti is very good with the marinara sauce." );
	}
}