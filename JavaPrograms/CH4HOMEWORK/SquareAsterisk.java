//userID 1711886
//kevin do
//exercise 4.29

import java.util.Scanner;				//import new scanner

public class SquareAsterisk				//new class SquareAsterisk
{
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner( System.in );
		
		
		int asterisks;					//declare instance variables
		int x = 0;
		int blah;
		

		
		System.out.printf( "Enter the size of one side of the square (1-20): ");
			asterisks = input.nextInt() ;			//prompt user to enter in value
			

			
			x = asterisks;
			
			
					if( asterisks < 0 );
				System.out.print( "Input a positive value.\n");
		
		while ( 0 < x )
		{							//loop first line
			x -= 1;
			System.out.printf("*") ;
				

		}
		
		System.out.println();
		
		x = asterisks;
		
		
		
			while ( 2 < x )
			{
				x -= 1;
				System.out.printf( "*" );
													//loop inner lines
					blah = asterisks - 1;
				
					while ( 0 < blah - 1)
					{
						blah -= 1;
						System.out.printf( " " );
		
					}	
					
			System.out.printf ( "*" );
				
			System.out.println();
				
			}
			
		x = asterisks;
		
		while ( 0 < x ) 
		{							//loop last line
			x -= 1;
			System.out.printf( "*" );
			
		}
		
			
			
			
		
		
		System.out.println();
		
	
			
		

		
		
		
		
	}
}
			
			
			
			
