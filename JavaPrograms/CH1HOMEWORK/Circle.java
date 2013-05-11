// This program will use user input to show the diameter, circumference, and are of a circle. User will input a radius.
// Homework 2.28
//UserID: 1711886
//Kevin Do

import java.util.Scanner;		//import Scanner class characteristics.

public class Circle
{
	public static void main(String[] args)
	{
		System.out.println("Hello, you will enter a value for the radius of a circle and the diameter, circumference, and area will result." );
		Scanner input = new Scanner( System.in );					//introduces user to what this program is
		
		
		int r;  //declare variable r
		
		
		System.out.print( "Enter value of radius: " );
		r = input.nextInt();						// prompts user to enter in a value for raduis
		
		
		System.out.printf( "Diameter is %d\n", 2 * r );			//diameter
		System.out.printf( "Circumference is %f\n", 2 * Math.PI * r );		//circumference
		System.out.printf( "Area is %f\n", Math.PI * r * r );			// area
		}
		
}
		
		