//calculates the tip 
//prompts user to enter tip rate and bill

import java.util.Scanner;

public class Tipster
{
	public static void main(String[] args)
		{
			Scanner input = new Scanner ( System.in );
			
			float bill;
			float tip;
			float gratuity;
			float total;
			
			
			System.out.print("Enter amount of bill: ");
			bill = input.nextInt();
			
			System.out.print("Enter percent of tip: ") ;
			tip = input.nextInt();
			
			gratuity = (bill * (tip/100));
			
			total = (bill + gratuity);
			
			System.out.printf("Total amount: %f]n", total );
			
		}
	}
			