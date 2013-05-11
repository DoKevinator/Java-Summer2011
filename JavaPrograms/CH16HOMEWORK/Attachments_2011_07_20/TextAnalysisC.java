// kevin do
//userID 1711886
//homework 16.18c

import java.util.Scanner;

public class TextAnalysisC
{
	private static int[] word = new int[21];
	private static String[] store = new String[21];
	private static String sentence;
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner( System.in ); 

		System.out.print("Enter sentence: ");
		sentence = input.nextLine();
		
		String [] tokens = sentence.split(" ");
		
		boolean same; 
		int wordnum = 0; 
		
		for (String token : tokens )
		{
			same = false;
		
			
			for (int i = 0; i < word; i++)
			{
				if (store[i].equals(token))
				{
					word[i]++;
					same= true;
					break;
				}
			}
			
			
			if ( same == false)
			{
				store[wordnum] = token;
				word[wordnum]++;
				wordnum++;
			}
		}
		
		
		System.out.print("\nDisplay: \n");
		for (int j = 0; j < wordnum; j++)
		{
			System.out.printf("%-10s %-10d\n", store[j], word[j] );
		}
		System.out.printf("\nSentence: %s\n", sentence); 
	} 
}
