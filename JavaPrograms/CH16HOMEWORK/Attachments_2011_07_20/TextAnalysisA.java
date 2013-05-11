//kevin do
//userID 1711886
//homework 16.18a

import java.util.Scanner;

public class TextAnalysisA
{
	private static String sentence;
	
	public static void main(String [] args)
	{

		char[] Letter = { 'A', 'B', 'C', 'D', 'E','F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		int[] lettersCount = new int [26];
		
		Scanner input = new Scanner( System.in ); 
		
		
		System.out.printf("Enter sentence: "); 
		sentence = input.nextLine();
		
		String newSentence = sentence.toUpperCase(); 
		
		for (int i = 0; i < 26; i++)
		{	
			char x = Letter [i];
			newSentence = sentence.toUpperCase();
			
			
			while ( newSentence.indexOf(x) >= 0 )
			{
				lettersCount[i]++;
				newSentence = newSentence.substring(newSentence.indexOf(x) + 1 );
			}
		}
		
		for (int j = 0; j < 26; j++)
		{	
			char x = Letter [j];
			System.out.printf("%s = %s\n", x, lettersCount[j]);
		}
		
	} 
} 
