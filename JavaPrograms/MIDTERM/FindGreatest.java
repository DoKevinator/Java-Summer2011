//kevin do
//userID 1711886
//Midterm #1

import java.util.Scanner;		//import scanner class for input

public class FindGreatest		//public class
{
	private static int number;			//variable for user input
	private static int greatest;		//variable to determine greatest
	private static int[] myArray = new int[3];		//array to store input
	
	public static void main(String[] args)		//method main
	{
		Scanner input = new Scanner( System.in );		//new scanner object for input
		
		for ( int i = 0; i < 3; i++ )			//for loop to store input into array
		{
			System.out.print( "Enter an integer: " );
			number = input.nextInt();		//prompt user to enter in number
			
			myArray[i] = number;		//stores input into array
		}
		
		WhichIsGreatest();			//calls method to determind greatest
	}
	
	public static void WhichIsGreatest()		//greatest method
	{
		if ( myArray[0] >= myArray[1] )		//first comparison for greatest
		greatest = myArray[0];
		
		if ( greatest <= myArray[2] )
		greatest = myArray[2];			//second comparison for greatest
		
		System.out.printf( "Greatest integer is: %d\n", greatest );		//display the greatest integer
	}
}