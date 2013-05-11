//abstract class which has methods eat and MadeFrom
//determines where it is made from and a description of how good it tastes
//apple, watermelon, and spaghetti all inherit from this
//kevin do
//userID 1711886
//FINAL NUMBER 5

public abstract class Food
{
	protected String whereMade;		//protected variable to be used throughout all classes and files
	
	protected Food( String whereMade )		//constructor to implement the methods
	{
		this.whereMade = whereMade;
	}
	
	public abstract void eat();		//abstract method eat to be implemented
	
	public void MadeFrom()
	{
		System.out.println( "This food is made from " + whereMade );	//method MadeFrom is used through all classes
	}
}