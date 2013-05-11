//kevin do
//userID 1711886
//Midterm #2


import java.util.Scanner;		//import scanner class for user input

public class AddTwo		//public class
{
	private static int number;		//variable for input by user
	private static int sum;			//variable for sum
	private static int[] addArray = new int[2];		//array to hold integers
	
	public static void main(String[] args )		//method main
	{
		Scanner input = new Scanner( System.in );		//new scanner object for input
		
		for ( int i = 0; i < 2; i++ )			//for loop to enter integers to array
		{
			System.out.print( "Enter an integer: " );
			number = input.nextInt();					//prompt user to enter integer
				
			addArray[i] = number;			//inputs number into array
		}
		
		AddNumbers();		//call method to add integers
	}
	
	
	public static void AddNumbers()		//add method
	{
		sum = addArray[0] + addArray[1];		//adds and stores into sum
		
		System.out.printf( "Sum of the two integers is: %d\n", sum ); 		// print out the sum
	}
}