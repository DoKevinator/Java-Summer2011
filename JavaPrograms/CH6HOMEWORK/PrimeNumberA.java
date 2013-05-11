//kevin do
//userID 1711886
//homework 6.25A



import java.util.Scanner;


public class PrimeNumberA
{
	public static void main(String[] args)
	{
	
		int number;
	
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter an integer: ");
		number = input.nextInt();
		
		int variable = PrimeEvaluator( number );
		
		if ( variable == 0 )
		{
			System.out.printf( "%d is not prime. \n", number);
		}
		else
		{
			System.out.printf( "%d is prime.\n", number );
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static int PrimeEvaluator( int number )
	{
		int counter;
		int result;
		
		for ( counter = 2 ; counter <= number - 1 ; counter += 1 )
		{
			
				if ( number % counter == 0 )
					{
						return 0;
					}
				
		}
		

		return number;
	}
}
		