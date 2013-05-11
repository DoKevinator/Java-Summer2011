//userID 1711886
//kevin do
//exercise 4.32

public class Checkerboard		//create class Checkerboard
{

	public static void main(String[] args)
	{
	
		int x = 0;			//delcare instance variables
		int count = 0;
	
		

		while ( count < 4 )
		{							//loop 4 times because the inner loops displays two lines so in order to get 8, must loop 4
			count += 1;
				
				x = 0;
				while ( x < 8 )
				{								//loop first line without the space in front
					x += 1;
					System.out.print( "* " );
					
					
				}
		
				System.out.println();
		
				System.out.print( " " );
				
				x = 0;
				
				while ( x < 8 )
				{										//loop second line with space in front
					
				
					x += 1;
					System.out.print( "* " );
					
				}
				System.out.println();					//new line to distinguish line 1 from line 2
				
				
		}
		
		

		
		
		
		
	}
}