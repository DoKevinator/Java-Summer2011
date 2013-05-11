//kevin do
//userID 1711886
//homework 6.25C



public class PrimeNumberC
{
	public static void main(String[] args)
	{
		int number;
		int count;
		
		
		
		for ( count = 2 ; count < 10000 ; count += 1 )
		{
			int variable = PrimeEvaluatorB( count );
			
			if ( variable != 0 )
			{
				System.out.printf( "%d\n", count );
			}
		}
		
	}
	
	
	
	
	
	
	
	public static int PrimeEvaluatorB( int count )
	{
		int counter;
		
		
		for ( counter = 2 ; counter <= Math.sqrt(count - 1) ; counter += 1 )
		{
			if ( count % counter == 0 )
				{
					return 0;
				}

		}
		
		return count; 
	}
}