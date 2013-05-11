//userID 1711886
//kevin do
//chapter 3.15




import java.util.Scanner;	//import scanner class

public class DateTest
{
	public static void main(String[] args)				//main method
		{
			Date date1 = new Date(1,2,2003) ;			//constructor with parameters
			
			Scanner input = new Scanner( System.in );
			
			int day;					//declare variables
			int month;
			int year;
			
			System.out.println("Hello, this program displays the date entered in by the user." );		//prompts user of what this program does
			
			System.out.printf ( "Enter day: ");
				date1.setDay( input.nextInt() );			// prompts user of what to enter
			System.out.printf( "Enter month: ");
				date1.setMonth( input.nextInt() );
			System.out.printf( "Enter year: ");
				date1.setYear( input.nextInt() );
				
			
				
			date1.displayDate() ;			//outputs all information inputted by user
		}
}