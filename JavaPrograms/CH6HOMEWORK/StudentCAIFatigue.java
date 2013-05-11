//kevin do
//userID 1711886
//homework 6.36


import java.util.Scanner;

import java.util.Random;

public class StudentCAIFatigue
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
					int wrong = generator.nextInt( 4 ) + 1;
		
				switch ( wrong )
					{
						case 1:
							System.out.print( "No, please try again.\n" );
							break;
						
						case 2: 
							System.out.print( "Wrong, try once more!\n" );
							break;
						
						case 3:
							System.out.print( "Don't give up!\n" );
							break;
						
						case 4:
							System.out.print( "No, keep trying!\n" );
							break;
					}
					
					
					
					System.out.printf( "What is %d times %d?\n", A, B );
					guess = input.nextInt();
					check = false;
				}
				if ( guess == C )
				{
					int right = generator.nextInt( 4 ) + 1;
			
						switch ( right )
							{
								case 1:
									System.out.print( "Very good!\n" );
									break;
					
								case 2: 
									System.out.print( "Excellent!\n" );
									break;
						
								case 3: 
									System.out.print( "Nice work!\n" );
									break;
						
								case 4:
									System.out.print( "Keep up the good work!\n" );
									break;
						
							}
					check = true;
				}				
			}
			
		

		}
	}
}		
		
		