import java.util.Scanner;

public class BinarySearchTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );

		int searchInt;
		int position;
		
		BinaryArray searchArray = new BinaryArray( 15 );
		System.out.print( searchArray );
		
		System.out.print( "Please enter an integer value ( -1 to quit ): " );
		searchInt = input.nextInt();
		System.out.println();
		
		while ( searchInt != -1 )
		{
			position = searchArray.recursiveBinarySearch( searchInt, 0, 14 );
			
			if ( position == -1 )
				System.out.println( "The integer " + searchInt + " was not found.\n" );
				
			else
				System.out.println( "The integer " + searchInt + " was found in position " + position + ".\n" );
				
			System.out.print( "Please enter an integer value (-1 to quit): " );
			searchInt = input.nextInt();
			System.out.println();
		}
	}
}