//userID 1711886
//kevin do
//exercise 4.21



import java.util.Scanner;			//import scanner

public class LargestNumber				//new class LargestNumber
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in );			//new scanner input

		int number;
		int largest = 0;
		int count = 1;					//declare instance variables
		
		while ( count <= 10 )
			{								//loop integers and calculate highest value
				count += 1;
			
				System.out.print( "Enter an integer: ");
					number = input.nextInt() ;
	
						if (number >= largest)
							{
							largest = number;

							}		
			}
			
		System.out.printf( "Largest integer is: %s\n", largest );			//display largest value
		
		
	}
}
		
		
	