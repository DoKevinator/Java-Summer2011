import java.util.Scanner;

import java.lang.Integer;

public class TurtleGraphics
{
	private static int [][] Grid = new int [20][20];
	private static int InitialX = 0;
	private static int InitialY = 0;
	private static int NewX = 0;
	private static int NewY = 0;
	private static int LeftRight = 0;
	private static int Move = 0;
	private static boolean PenUp = false;
	private static int Direction;
	private static int Left = 1;
	private static int Right = 2;
	private static int Up = 3;
	private static int Down = 4;
	private static int D;
	private static int CurrentDirection = Right;
	

	public static void main(String[] args)
	{
		String function;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Hello! Welcome to Turtle Graphics!\n" );
		
		do
		{
		
		System.out.print( "Enter 1 to Pen up.\n" );
		System.out.print( "Enter 2 to Pen down.\n" );
		System.out.print( "Enter 3 to Turn Right.\n" );
		System.out.print( "Enter 4 to Turn Left. \n" );
		System.out.print( "Enter 5 to move the turtle. (ie. 5,10 to move 10 spaces)\n");
		System.out.print( "Enter 6 to Display Grid.\n" );
		System.out.print( "Enter 9 to exit program.\n" );
		function = input.next();
		
		String[] values = function.split( "," );
		
		int firstNumber = Integer.parseInt(values[0]);
		
		switch ( firstNumber )
		{
			case 1:
				System.out.print( "Pen is in the 'up' position.\n" );
				PenUp = true ;
				break;
			
			case 2:
				System.out.print( "Pen is in the 'down' position.\n" );
				PenUp = false;
				break;
				
			case 3: 
				System.out.print( "Turtle has turned Right.\n" );
				D = Right;
				CurrentDirection = Direction( D );
				break;
				
			case 4:
				System.out.print( "Turtle has turned Left.\n" );
				D = Left;
				CurrentDirection = Direction( D );
				break;
				
			case 5:
				Move = Integer.parseInt(values[1]);
				System.out.printf( "Turtle has moved %d spaces.\n", Move );
				
				if ( CurrentDirection == Left || CurrentDirection == Right )
				{
					NewX = MovementX( PenUp, Move );
				}
				
				if ( CurrentDirection == Up || CurrentDirection == Down )
				{
					NewY = MovementY( PenUp, Move );
				}
				break;
				
			case 6:
				System.out.print( "Displaying Grid.\n" );
				DisplayGrid();
				break;
			
			case 9:
				System.out.print( "Exiting Program. Goodbye.\n" );
				function = "10";
				break;
		}
					
		}
		while ( function != "10" );
	}
	
	public static void DisplayGrid()
	{
		for ( int row = 0; row < Grid.length; row++ )
		{
			for ( int column = 0; column < Grid[row].length; column++ )
			{
				if ( Grid[row][column] == 0 )
				{
					System.out.print( "  " );
				}
				
				if ( Grid[row][column] == 1 )
				{
					System.out.print( "* " );
				}
				
			}
			
			System.out.println();
		}
	}
	
	public static int Direction( int D )
	{
		if ( CurrentDirection == Right )
		{
			if ( D == Right )
			{
				CurrentDirection = Down;
			}
			
			if ( D == Left )
			{
				CurrentDirection = Up;
			}
		}
		
		if ( CurrentDirection == Down )
		{
			if ( D == Right )
			{
				CurrentDirection = Left;
			}
			
			if ( D == Left )
			{
				CurrentDirection = Right;
			}
		}
		
		if ( CurrentDirection == Up )
		{
			if ( D == Right )
			{
				CurrentDirection = Right;
			}
			
			if ( D == Left )
			{
				CurrentDirection = Left;
			}
		}
		
		if ( CurrentDirection == Left )
		{
			if ( D == Left )
			{
				CurrentDirection = Down;
			}
			
			if ( D == Right )
			{
				CurrentDirection = Up;
			}
		}
		
		return CurrentDirection;
	
	}
	
	
	public static int MovementX( boolean PenUp, int Move )
	{
		if ( CurrentDirection == Up)
		{	
			for ( int counter = 0; counter < Move; counter++ )
			{
				if ( PenUp == false )
				{
					
					Grid[NewX][NewY] = 1;
					
					
				}
					NewX--;
			}
		}
		
		if ( CurrentDirection == Down )
		{
			for ( int counter = 0; counter < Move; counter++ )
			{
				if ( PenUp == false )
				{
					Grid[NewX][NewY] = 1;
				}
					NewX++;
			}
		}
		
		
		return NewX;
		
	}
	
	public static int MovementY( boolean PenUp, int Move )
	{
		if ( CurrentDirection == Left )
		{
			for ( int counter = 0; counter < Move; counter++ )
			{
				if ( PenUp == false )
				{
					Grid[NewX][NewY] = 1;
				}
					NewY--;
			}
		}
		
		if ( CurrentDirection == Right )
		{
			for ( int counter = 0; counter < Move; counter++ )
			{
				if ( PenUp == false )
				{
					Grid[NewX][NewY] = 1;
				}
					NewY++;
			}
		}
		
		return NewY;
	}
		
	
}