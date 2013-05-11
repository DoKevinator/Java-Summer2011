// kevin do
//userID 1711886
//homework 6.35


import java.util.Scanner;

import java.util.Random;

public class StudentCAI
{
	public static void main(String[] args)
	{
		int number;
		boolean correct = false;
		int guess;
		boolean check = false;
		
		Scanner input = new Scanner( System.in );
		
		Random generator = new Random();
		
		while ( correct != true )
		{
		
			int A = generator.nextInt( 9 ) + 1;
			int B = generator.nextInt( 9 ) + 1;
			
			System.out.printf( "How much is %d times %d?\n", A, B);
			guess = input.nextInt();
			check = false;
			
			int C = A * B;
			
			while ( check != true )
			{
				if ( guess == 0 )
				{
					System.out.print( "Exiting Program.\n" );
					check = true;
					correct = true;
				}				
			
				else if ( guess != C )
				{
					System.out.print( "No, please try again.\n" );
					System.out.printf( "What is %d times %d?\n", A, B );
					guess = input.nextInt();
					check = false;
				}
				if ( guess == C )
				{
					System.out.print( "Very good!\n" );
					check = true;
				}				
			}
			
		

		}
	}
}		
		
		
		
		
		
			