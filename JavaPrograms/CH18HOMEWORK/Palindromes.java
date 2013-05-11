//kevin do
//userID 1711886
//homework 18.14



import java.util.Scanner;		//import scanner for input by user

public class Palindromes		//public class
{
	private static String sentence;				//declare variables
	private static String newSentence;
	
	public static boolean isPalindrome( String newSentence )
	{
		if(  newSentence.length() == 0 || newSentence.length() == 1 )		//if the word is 0 or 1 characters, then it is definitely true
			return true;
			
		if( newSentence.charAt(0) == newSentence.charAt( newSentence.length()-1 ) )			//if the first and last characters are the same, loop again by recursion
			return isPalindrome( newSentence.substring ( 1, newSentence.length()-1 ) );
			
		return false;		//if it is not palindrome
	}

	public static void main(String[]args)		//method main
	{
		Scanner input = new Scanner(System.in);		//scaner object for input
		
		System.out.println("Enter a sentence or word to check if it is a palindrome or not: ");
		String sentence = input.nextLine();					//prompt user for sentence or word
		
		newSentence = sentence.replaceAll( "\\W", "" );			//gets rid of all punctuation
			
		if( isPalindrome( newSentence ) )					//determines if it is palindrome or not
			System.out.println( newSentence + " is a palindrome" );
		else
			System.out.println( newSentence + " is not a palindrome" );		//determines if it is palindrome or not
	}
}