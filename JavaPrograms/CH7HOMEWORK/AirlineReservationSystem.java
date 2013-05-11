import java.util.Scanner;

public class AirlineReservationSystem
{
	
	public static void main(String[] args) 
	{
		int enteredClass;
		int changeClass = 0;
		boolean exit = false;
		int A;
		
		boolean[] seats = new boolean[ 10 ];
		
		Scanner input = new Scanner( System.in );
		
		while ( exit != true )
		{
		
		System.out.println( "Welcome to Airline Reservation System!");
		System.out.print( "Enter 1 for First Class or 2 for Economy: ");
		enteredClass = input.nextInt();
		
		if ( enteredClass == 1 )
		{
		
			if ( seats[4] == true )
				{
					if ( seats[9] == true )
					{
						System.out.print( "Sorry, all seats are reserved. The next flight departs in three hours.");
					}
					
				}
			
			for ( int i = 0; i < 5; i++ )
			{
				
				if ( seats[4] == true)
				{

						System.out.println( "First Class is full. Would you like to be placed in Economy?" );
						System.out.print( "Enter 1 for yes and enter 2 for no." );
						changeClass = input.nextInt();
					
							if ( changeClass == 1 )
							{
								enteredClass = 2;
								break;
							}
							else if ( changeClass == 2 )
							{
								System.out.print( "The next flight departs in three hours." );
								break;
							}
				}
				
				if ( seats[i] == false )
				{
					// Oh I found it
					seats[i] = true;
				
					int seatnumber = i + 1;
					System.out.printf( "Your flight class is First Class. Your seat number is: %d\n", seatnumber); 
					break;
				 	// I can exit
				}
				
				// I have not found it yet
			}
			
			
		}
		
		
		if ( enteredClass == 2 )
		{
		
			if ( seats[4] == true )
				{
					if ( seats[9] == true )
					{
						System.out.print( "Sorry, all seats are reserved. The next flight departs in three hours.");
					}
					
				}
		
			for ( int j = 5; j < 10; j++ )
			{
				
				if ( seats [9] == true)
				{
		
						System.out.println( "Economy Class is full. Would you like to be placed in First Class?" );
						System.out.print( "Enter 1 for yes and enter 2 for no." );
						changeClass = input.nextInt();
				
							if ( changeClass == 1 )
							{
								enteredClass = 1;
								break;
							}
							else if ( changeClass == 2 )
							{
								System.out.print( "The next flight departs in three hours." );
								break;
							}

				}
			
				if ( seats[j] == false )
				{
					seats[j] = true;
				
					int seatnumber = j + 1;
					System.out.printf( "Your flight class is Economy. Your seat number is %d\n", seatnumber );
					break;
				}
			}
			
			
		}
		
		System.out.print( " Would you like to add another seat? Enter 1 for yes and enter 2 for no: " );
		A = input.nextInt();
		
		if ( A == 2 )
		{
			System.out.println(" Thankyou and have a good day! Exiting Program.");
			exit = true;
		}
		
		}
		
	}
	

}