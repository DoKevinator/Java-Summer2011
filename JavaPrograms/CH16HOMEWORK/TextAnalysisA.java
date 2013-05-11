import java.util.Scanner;

public class TextAnalysisA
{
	private static String sentence;
	private static String newSentence;
	private static char[] Letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private static int[] frequency = new int[26];
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter in a sentence: " );
		sentence = input.nextLine();
		
		newSentence = sentence.toUpperCase();
		
		for ( int x = 0; x < Letters.length; x++ )
			{
				char letter = Letters[x];
				
				Counting( newSentence, x, letter );
				
				System.out.printf( "%s occurs %d time(s).\n", Letters[x], frequency[x] );
			}
		
		
	}
	
	
	
	
	public static void Counting( String newSentence, int x, char letter )
	{
		for ( int i = 0; i < newSentence.length(); i++ )
		{
		
			
			if ( newSentence.charAt(i) == letter )
			{
				frequency[i] = frequency[i] + 1;
			}

		}
	}
	
	
}