public class Daimond
{
	public static void main(String[] args)
	{
		int counter = 4;
		int x = 4;
		int stars;
		
		for ( x = 4 ; x >= 0 ; x -= 1 )
		{
			System.out.println();
			
			
		
			for ( counter = x ; counter > 0 ; counter -= 1 )
				{
					
					System.out.print(" " );
			
				}
			for ( stars = 1 ; stars <= 9 - 2 * x ; stars++ )
			{
				System.out.print( "*" );
			}
			
		} 
		
		for ( x = 1 ; x <= 4 ; x += 1 )
		{
			System.out.println();
			
			
			for ( counter = x ; counter > 0 ; counter -= 1 )
			{
				System.out.print( " " );
			}
			
			for ( stars = 17 ; stars >= 9 + 2 * x ; stars-- )
			{
				System.out.print( "*" );
			}
		}
		
		System.out.println();
	}
	
	
}
			