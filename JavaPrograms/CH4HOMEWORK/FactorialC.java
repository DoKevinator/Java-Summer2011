//userID 1711886
//kevin do
//exercise 4.37c


import java.util.Scanner;
import java.lang.Math;					//import java classes

public class FactorialC				//create class FactorialC
{
	public static void main(String[] args)
	{
		int number;
		int count = 0;					//declare instance variables
		int factorial = 1;
		int x;
		double e = 0;
		
		Scanner input = new Scanner( System.in );			//new scanner input
		
		System.out.print( "Enter the number of terms of e^x to evaluate: ");
		number = input.nextInt();				//prompt user to enter integer
		
		System.out.print( "Enter the value of x: " );
		x = input.nextInt();				//prompt user to enter integer
		
		if ( number < 0 )
			System.out.print( "Cannot enter a negative number./n" );
		else					//if num = negative then exit
		{
			
				while ( count < number )				//do else if true
				{
					factorial = calculateFactorial( count );			//constructor for parameters
					
					e += Math.pow( x, count )/(factorial);		//value of e
					count++;
				}
				
		
				System.out.printf( "Value of e^x is: %f\n", e );			//display value of e
		
				

		}	
	}
		
		
		public static int calculateFactorial( int number )
				{
					int count;
	   				int factorial = 1;
	    												//method to calculate factorial
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