public class Factorials
{
	public static void main(String[] args)
	{
		double counter = 0;
		int number;
		
		System.out.printf( "%-10s%-20s\n", "Number", "Factorial of Number" );
		
		
		
		while ( counter < 20 )
		{
			counter += 1;
			
			double factorial = calculateFactorial( counter );
			
			
			System.out.printf( "%-10s%-20s\n", counter, factorial );
			
		}
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
	public static double calculateFactorial( double counter )			//method to calculate factorial
	{
		double count;					//declare instance variables
	    double factorial = 1;
	    
		if ( counter == 0 )
				return factorial;
		
		else
		{
		
			count = counter;
			
				while ( 1 <= count )
				{
			
					factorial *= count;
			
					count -= 1;
				}
		
				return factorial;
			

		}		
	}
}