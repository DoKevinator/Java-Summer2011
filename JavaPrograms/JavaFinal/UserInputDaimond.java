import java.util.Scanner;

public class UserInputDaimond
{
	private static int number;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter the width of the diamond: " );
		number = input.nextInt();
		
		for ( int x = number - 2; x > 0; x-- )
		{
			System.out.println();
		
			for ( int counter = x - 2; counter >= 0; counter-- )
			{
				System.out.print( "-" );
			}
			
			for ( int i = 1; i <= x  + 4; i++ )
			{
				System.out.print( "*" );
			}
			
			
		}
	}
}
			