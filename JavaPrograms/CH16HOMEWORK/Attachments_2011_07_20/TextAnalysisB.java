//kevin do
//userID 1711886
//homework 16.18b

import java.util.Scanner;

public class TextAnalysisB
{
	private static String sentence;
	private static int[] word = new int[21];

	public static void main(String [] args)
	{
		Scanner input = new Scanner( System.in );  	
	
		System.out.print("Enter sentence: ");
		sentence = input.nextLine();
		
		String[] tokens = sentence.split(" "); 
		
		 
		for (String token : tokens )
		{
			int number = token.length();
			word[ number ]++;
		}
		
		
		System.out.printf("%-15s %-15s\n", "Word Length", "Occurences");
		for (int i = 1; i < word.length; i++)
		{
			System.out.printf("%-15d %-15d\n", i, word[i] );
		}
		
		System.out.printf("%s\n", sentence);
	} 
} 
