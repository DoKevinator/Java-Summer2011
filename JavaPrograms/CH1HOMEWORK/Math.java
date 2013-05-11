//This program shows the sum, product, average, greatest, and least integers of three numbers. 
// Homework 2.17
// userID: 1711886
//Kevin Do	

import java.util.Scanner;

public class Math
{
	public static void main( String[] args )
	{
		System.out.println("Hello, this program will show the sum, average, product, greatest, and least, of three integers. " ) ;
		Scanner input = new Scanner( System.in );		//introduces user to what this program does
		
		int number1;				//declares variables used in this calculator
		int number2;
		int number3;
		int sum; 
		int average; 
		int product; 
		int greater;
		int least;
		
		greater = 0;		//initializes greatest and least integers for use later
		least = 0;
		
		System.out.print( "Enter first integer: " );
		number1 = input.nextInt();					//prompts user to enter first number
		
		System.out.print( "Enter second integer: " );
		number2 = input.nextInt();					//prompts user to enter second number
		
		System.out.print( "Enter third integer: " );
		number3 = input.nextInt();					//prompts user to enter third number
		
		sum = number1 + number2 + number3; 			//performs calculations for sum
		average = sum / 3; 							//performs calculation for average
		product = number1 * number2 * number3 ; 	//performs calculations for product
		
		if (number1 >= number2) 
		greater = number1 ;
		
		if (greater <= number3)
		greater = number3;
		
		if (number1 <= number2)			//rules and regulations for greatest and least integer calculations
		least = number1;
		
		if (least >= number3)
		least = number3;
		
		
		System.out.printf( "Sum is %d\n", sum );
		System.out.printf( "Average is %d\n", average );			//prints out all the outcomes of calculations
		System.out.printf( "Product is %d\n", product ); 
		System.out.printf( "Greatest is %d\n", greater ); 
		System.out.printf( "Least is %d\n", least );
	}
}
	
		