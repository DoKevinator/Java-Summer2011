import java.util.Scanner;

public class SmallestValue
{
	public static void main(String[] args)
	{
		int values;
		int counter = 1;
		int number = 0;
		int temp;
		
		

		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter number of values to input: ");
		values = input.nextInt();
		
		if ( values == 0 )
			System.out.print( "Cannot enter zero as a value. Terminating program. \n" );
		else
		{
				while ( counter <= values )
					{
						
						System.out.print( "Enter an integer: ");
						temp = input.nextInt();
						
						
							
							if ( counter == 1 )
								{
									number = temp;
									
								}
							counter += 1;	
								
							if ( temp < number )
							{
								number = temp;
							}
						
						
						
						
					}
				
			System.out.printf( "Smallest integer is: %s\n", number );
					
		}
	}
}
		