//kevin do
//userID 1711886
//homework 6.28


import java.util.Scanner;

public class StudentAverage
{
	public static void main(String[] args)
	{	
		int grade;
		int average;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter student average: ");
		average = input.nextInt();
		
		grade = qualityPoints( average );
		
		System.out.printf( "Quality point of student is: %d \n", grade );
		
		
	}
	
	
	
	
	
	public static int qualityPoints( int average )
	{
	    int ret = 0;
		switch ( average / 10 )
			{	
				case 9:
					ret = 4;
					break;
				
				case 8:
					ret = 3;
					break;
				
				case 7:
					ret = 2; 
					break;
				
				case 6:
					ret = 1;
					break;
				
				default:
					ret = 0;
					break;
				
			}
			
		return ret;
	}
			
		
		

		
	
	
	
	
	
	
}