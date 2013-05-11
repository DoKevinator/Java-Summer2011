//kevin do
//userID 1711886
//homework 16.10


import java.util.Scanner;			//import scanner

public class UpperLowerCase
{
	private static String sentence;			//global variable sentence
	
	public static void main(String[] args )
	{
		Scanner input = new Scanner( System.in );		//input by user
		
		System.out.print( "Enter in a sentence: " );		//prompt user to input
		sentence = input.nextLine();		//store input
		
		System.out.printf( "%s\n", sentence.toUpperCase() );		//print uppercase
		
		System.out.printf( "%s\n", sentence.toLowerCase() );			//print lower case
	}
}