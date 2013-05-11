import java.util.Scanner;

public class CalculatingSales
{
	public static void main(String[] args)
	{
		int productnum;
		double quantitysold;
		double price = 0;
		int count = 1;
		
		Scanner input = new Scanner( System.in );
		
		
		while ( count != 0)
		{
			
			
				System.out.print( "Enter the number of the product (enter zero to exit): ");
				productnum = input.nextInt();
				
				count = productnum;
				
				if ( productnum <= 0 )
					System.out.println( "Exiting program.");
					
				else
				{
				
				
				System.out.println( "Enter amount of quantity sold: ");
				quantitysold = input.nextFloat();
		
				 switch ( productnum )
		 			{
		 				case 1:
		 					price = 2.98;
		 					break;
		 				case 2: 
		 					price = 4.50;
		 					break; 
		 				case 3:
		 					price = 9.98;
		 					break;
		 				case 4:
		 					price = 4.49;
		 					break;
		 				case 5:
		 					price = 6.87;
		 					break;
		 			}
		 			
		 			System.out.printf( "Total amount: $%.2f\n", quantitysold * price);
		 		}
		 }
		 		
		 		
		 			
		 		
		 	
	}
}