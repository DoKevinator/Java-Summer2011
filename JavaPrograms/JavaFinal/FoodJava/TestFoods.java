//this is the test class to display all the inheritance of the class objects.
//there are numerous objects that are referenced to different classes and are all used 
//abstract class food is used and interface fruit is used
//watermelon and apple both use fruit interface but spaghetti does not
//kevin do
//userID 1711886
//FINAL NUMBER 5


public class TestFoods			//new class TestFoods
{
	public static void main(String[] args )		//main method
	{
		Spaghetti spag = new Spaghetti();		//spaghetti object uses all methods
		Apple app = new Apple();				//apple object uses all methods
		Watermelon water = new Watermelon();	//watermelon object uses all methods
		
		Food a = new Apple();			//food objects which use the food methods
		Food w = new Watermelon();		//cannot use any other methods besides the ones that reside in the Food class
		Food s = new Spaghetti();		//cannot access fruit methods or the respective methods in the original classes
		
		Fruit apple = new Apple();
		Fruit watermelon = new Watermelon();	//fruit referenced objects that use fruit methods 
		
		app.eat();			//apple, watermelon, and spaghetti are all using their respective classes here. 
		water.eat();			//here, they can access all methods because this class inherits from all the other classes
		spag.eat();
		System.out.println();		//new line to separate the methods form each other
		
		a.MadeFrom();
		w.MadeFrom();			// here, all the foods are referenced to only the food class
		s.MadeFrom();			//this results in ONLY using the food class methods because it has no other methods to access
		System.out.println();
		
		watermelon.getSeed();		//apple and watermelon use the interface methods that are implemented 
		apple.getSeed();
	}
}