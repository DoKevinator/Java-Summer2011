//kevin do
//userID 1711886
//homework 16.9

import java.util.Scanner;		//import scanner 

public class ReversedWords
{
	private static String sentence;		//global variable 
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );		//input by user
		
		
		System.out.print( "Enter a sentence to convert backwards: " );		//prompt user to enter in sentence
		StringBuilder sentence = new StringBuilder( input.nextLine() );		//input sentence and store into object
		
		sentence.reverse();		//reverse the sentence
		System.out.printf( "Reversed sentence is: %s\n", sentence.toString() );		//print reversed
	}
}
		