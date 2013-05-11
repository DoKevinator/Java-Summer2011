//userID 1711886
//kevin do
//Exercise 4.37a




import java.util.Scanner;			//import scanner class

public class FactorialA			//create class FactorialA
{
	public static void main(String[] args)
	{
		int number;			//declare instance variable for input and constructor
		
		
		
		Scanner input = new Scanner( System.in );			//new scanner input
		
		System.out.printf( "Enter a nonnegative integer: " );
		number = input.nextInt();					//prompt user to enter in integer
		if ( number < 0 )
				System.out.println( "Cannot factorial a negative number." );			//if the number is negative, does not go on.
		else
		{
			int factorial = calculateFactorial( number );				//if number is positive, pass parameters and display factorial
			System.out.printf( "Factorial is: %d\n", factorial );
		}
		
		
		
		
				
	}
	public static int calculateFactorial( int number )			//method to calculate factorial
	{
		int count;					//declare instance variables
	    int factorial = 1;
	    
		if ( number == 0 )
				return factorial;
		
		else
		{
		
			count = number;
			
				while ( 1 <= count )
				{
			
					factorial *= count;
			
					count -= 1;
				}
		
				return factorial;
			

		}		
	}
}
		
		
		
		