//kevin do
// userID 1711886
//exercise 4.37b


import java.util.Scanner;			//import scanner 

public class FactorialB			//create class FactorialB
{
	public static void main(String[] args)
	{
		int number;						//declare instance variables	
		int count = 0;
		int factorial = 1;
		double e = 0;
	
		
		Scanner input = new Scanner( System.in );		//new scanner input
		
		System.out.print( "Enter the number of terms of e to evaluate: ");
		number = input.nextInt();						//prompt user to input number of terms
		
		if ( number < 0 )
			System.out.print("Cannot enter a negative number.\n" );				// if interger is negative, do not go on
		else
		{							//if integer is positive do else
		
				while ( count < number )			//loop e using count up to number inputted
				{
		
					 factorial = calculateFactorial( count );			//constructor to pass parameter
				
					e +=  1.0/(factorial);
					count++;
				}
				
				
			
			
				System.out.printf( "Value of e is: %f\n", e );			//display value of e
		
		}
		
		
		
		
	}
		
		
	public static int calculateFactorial( int number )
	{
		int count;
	    int factorial = 1;						//method to calculate factorial
	    										//(used in first FactorialA exercise)
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