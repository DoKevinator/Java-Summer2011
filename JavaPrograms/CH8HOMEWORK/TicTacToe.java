//kevin do
//userID 1711886
//homework 8.17


import java.util.Scanner;			//import scanner class to input

public class TicTacToe
{
	private static Cell[][] PlayingBoard = { { Cell.EMPTY, Cell.EMPTY, Cell.EMPTY },			//initialize tic tac toe game board to all empty cells
											{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY },
											{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY } };
	private static boolean win = false;		//sentinel value for signalling the end of the game

	
	public static void main(String[] args)		//method main
	{
		String Player1;				//initialize player 1 and player 2
		String Player2;
	
		Scanner input = new Scanner( System.in );		//new scanner method
				
		System.out.print( "Welcome to Tic-Tac-Toe! Requires two players to proceed.\n" );		//introduces users to play the game
		
		while ( win != true )				//loop for the game, when this loop breaks, game is over
		{		
			boolean turn = false; 		//loop variable for each player's turn
			
			while ( turn != true )		//loop for each player's turn
			{
				System.out.print( "Player 1 enter in coordinates of desired input ( ie, 1,2 ): ");
				Player1 = input.next();						//prompt user to enter in coordinates
			
				String[] values = Player1.split( "," );		//split the string value that the user inputted into two terms
			
				int Row = Integer.parseInt( values[0] );			//convert inputted terms into integers
				int Column = Integer.parseInt( values[1] );				//convert inputted terms into integers
				if (PlayingBoard[Row - 1][Column - 1] == Cell.EMPTY)	//decides whether to input or not for the player on the board
				{
					PlayingBoard[Row - 1][Column - 1] = Cell.X;
					turn = true;
				}
				else if ( PlayingBoard[Row - 1][Column - 1] != Cell.EMPTY)			//if the cell is taken already, choose another
				{
					System.out.print( "Cell is already taken up, please choose another one. \n" );
				}
			}
			
			
			DisplayBoard();					//call method to display the game board
			
			if ( isWinnerFound(Cell.X) )
			{										//call method to check if either player has won yet
				System.out.print( "Player 1 is the winner.\n" );
				break;
			}
			
			turn = false;			//sentinel for player 2's turn
			
			while ( turn != true )
			{
				System.out.print( "Player 2 enter in coordinates of desired input: ");
				Player2 = input.next();					//prompt user to input coordinates
			
				String[] values = Player2.split( "," );			//split coordinates
			
				int Row = Integer.parseInt( values[0] );		//convert coordinates to integers
				int Column = Integer.parseInt( values[1] );
				if (PlayingBoard[Row - 1][Column - 1] == Cell.EMPTY)			//inputs the marker into board
				{
					PlayingBoard[Row - 1][Column - 1] = Cell.O;
					turn = true;
				}
				else if ( PlayingBoard[Row - 1][Column - 1] != Cell.EMPTY)			//if cell is taken, input another
				{
					System.out.print( "Cell is already taken up, please choose another one. \n" );
				}
			}
			
			DisplayBoard();			// displays the game board method
			
			if ( isWinnerFound(Cell.O) )			//checks to see if one has won yet method
			{
				System.out.print( "Player 2 is the winner. \n" );
				win = true;
				break;
			}
			
			
			
		}
		
	}
	
	public static void DisplayBoard()				//method to display the game board
	{
		for ( int x = 0; x < PlayingBoard.length; x++ )		//rows
			{
				for ( int y = 0; y < PlayingBoard[x].length; y++ )  		//columns
				{
					System.out.printf( "%s", PlayingBoard[x][y].getValue() );
					System.out.print(" | " );		//display array contents
				}
				
				System.out.println();	
				System.out.print( "------------" );
				System.out.println();
			}
	}
	
	public static boolean isWinnerFound ( Cell cell)		//method to check for winner
	{
		boolean found = false;			//sentinel value to determine winner
		
		for ( int row = 0; row < 3; row++ )
		{											//check rows to determine winner
			int col = 0;
			for (; col < 3; col++ )
			{
				if ( PlayingBoard[row][col] != cell )
				{
					break;
				}
			}
			if (col == 3)
			{
				found = true;
				break;
			}
		}
		
		if (!found)
		{
			for (int col = 0; col < 3; col++ )
			{												//check column to determine winner
				int row = 0;
				for (; row < 3; row++ )
				{
					if ( PlayingBoard[row][col] != cell)
					{
						break;
					}
				}
				if ( row == 3 )
				{
					found = true;
					break;
				}
			}
		}
		
		if ( !found )
		{
			int i = 0;
			for ( ; i < 3; i++ )
			{
				if ( PlayingBoard[i][i] != cell )		//check negative slope diagonal to determine winner
				{
					break;
				}
			}
			if ( i == 3 )
			{
				found = true;
			}
		}
		
		if ( !found )
		{
			int j = 0;							//check positive slop diagonal to determine winner
			for ( ; j < 3; j++ )
			{
				if ( PlayingBoard[j][2-j] != cell )
				{
					break;
				}
			}
			if ( j == 3 )
			{
				found = true;
			}
		}
		
		return found;				//return if the player has won or not yet

		
		
	}
}

