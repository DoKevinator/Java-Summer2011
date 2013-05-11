//kevin do
//userID 1711886
//homework 18.18


import java.util.Random;			//import random for random value array

public class MinValue
{	
	private static int[] integerArray = new int[10];
	private static int smallest;					//declare variables
	
	public static void main(String[] args )		//main method
	{	
		Random generator = new Random();		//random generator
		
		for ( int i = 0; i < 10; i++ )			//for loop to input random values into array
		{			
			integerArray[i] = generator.nextInt(1000) + 1;
		}
		
		for ( int j = 0; j < 10; j++ )			//for loop to dislay the random valued array
		{
			System.out.printf( "%d ", integerArray[j] );
		}
		System.out.println();		//line break
		
		int answer = getSmallest( integerArray );		//calls method and stores return into answer
		
		System.out.printf( "%d is the smallest value.", answer );		//displays asnwer
		
		
	}
	
	
	public static int getSmallest( int[] myArray )		//get smallest method
	{
		 int smallest = myArray[0];			//holds the value of first index
		 	
		 for ( int i = 1; i < myArray.length; i++ )			//for loop to calculate smallest
		 {
		 	if ( myArray[i] < smallest )
		 	{	
		 		smallest = myArray[i];
		 	}
		 }
		 
		 return smallest;		//return smallest integer
	}
}