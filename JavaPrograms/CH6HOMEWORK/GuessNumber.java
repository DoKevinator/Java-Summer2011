//kevin do
//userID 1711886
//homework 6.30


import java.util.Scanner;

import java.util.Random;

public class GuessNumber
{
	public static void main(String[] args)
	{
		int number;
		boolean correct = false;
		
		Scanner input = new Scanner( System.in );
		
		Random generator = new Random();
		
		int r = generator.nextInt( 1000 ) + 1;
		
		
		while ( correct != true )
		{
			System.out.print( "Guess what the number is! Enter an integer: " );
			number = input.nextInt();
			
				if ( number > r )
				{
					System.out.print( "Too high. Try again.\n" );
				}
				
				if ( number < r )
				{
					System.out.print( "Too low. Try again.\n" );
				}
				
				if ( number == r )
				{
					System.out.print( "Congratulations! You found the number! \n" );
					correct = true;
				}
		}
	}
}
		
		