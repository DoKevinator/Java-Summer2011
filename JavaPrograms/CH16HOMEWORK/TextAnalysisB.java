import java.util.Scanner;

public class TextAnalysisB
{
	private static String sentence;
	private static int[] Counter = new int[200];
	private static int[] newTokens = new int[200];
	
	public static void main(String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter a sentence and press Enter: " );
		sentence = input.nextLine();
		
		String[] tokens = sentence.split( " " );
		
		for ( int x = 0; x < tokens.length; x++ )
		{
			newTokens[x] = tokens[x].length();
		}
		
		for  ( int i = 0; i < tokens.length; i++ )
		{
			if ( newTokens[i] == i )
			{
				Counter[i]++;
			}
		}
		
		System.out.printf( "%-15s%-15s\n", "Word length", "Occurrences" );
		
		for ( int j = 0; j < tokens.length; j++ )
		{
			System.out.printf( "%-15d%-15d\n", newTokens[j], Counter[j] );
		}
	}
}
		
		