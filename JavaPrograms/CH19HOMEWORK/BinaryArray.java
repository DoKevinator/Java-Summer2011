//kevin do
//userID 1711886
//homework 19.9



import java.util.Random;
import java.util.Arrays;

public class BinaryArray
{
	private static int[] data;
	private static final Random generator = new Random();
	
	public BinaryArray( int size)
	{
		data = new int [size];
		
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
			
		Arrays.sort(data);
	}
	
	public static int recursiveBinarySearch(int searchKey, int low, int high )			//modified binary search to recursion with 3 parameters
	{
		if ( low < high )							//if statement to get it working
		{
			int mid = low + ( high - low ) / 2;		//find the midpoint of array
			
			if ( searchKey < data[mid] )			//test to see where searchKey is
			{
				return recursiveBinarySearch( searchKey, low, mid );		//loop again with array cut in half
			}
			else if ( searchKey > data[mid] )			//loop again with array cut in half
			{
				return recursiveBinarySearch( searchKey, mid + 1, high );		
			}
			else
			{
				return mid;			//found the answer :) -happyface-
			}
			
		}
		
		return -1;				//did not find the answer :( -sadface-
		
	}
	
	public String remainingElements( int low, int high )
	{
		StringBuilder temporary = new StringBuilder();
		
		for ( int i = 0; i < low; i++ )
			temporary.append( "   " );
			
		for ( int i = low; i <= high; i++ )
			temporary.append( data[i] + " " );
			
		temporary.append( "\n" );
		return temporary.toString();
	}
	
	public String toString()
	{
		return remainingElements( 0, data.length - 1 );
	}
}
