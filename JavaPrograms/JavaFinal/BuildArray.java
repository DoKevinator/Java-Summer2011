//kevin do
//userID 1711886
//FINAL QUESTION number 2

public class BuildArray		//public class
{
	private static int[][] Matrix = new int[3][4];		//delcare new 2d array 3x4
	
	public static void main(String[] args)		//main method
	{
		int[][]Matrix = fill();			//fill method to fill array with values
		show( Matrix );				//show method to print 2d array
		System.out.printf( "The sum of the two dimensional array is: %.1f \n", sumMatrix( Matrix ) );		//print the sum of the array with calling the sumMatrix method
	
	}
	
	
	public static int[][] fill()		//fill method
	{
		int[][] filledMatrix = { { 3, 5, 6, 10}, 			//filledMatrix with values to fill into Matrix
				 		  		 { 4, 8, 9, 20}, 
				  		  		 {30,40,40, 80} };
		return filledMatrix;			//return filledMatrix to be inputted into Matrix
		
	}
	 
	
	
	
	public static void show( int[][] Matrix )		//show method with passes parameter
	{
		for ( int row = 0; row < Matrix.length; row++ )		//loop rows
		{	
			for ( int column = 0; column < Matrix[row].length; column++ )	//loop columns
			{
				System.out.printf( "%d ", Matrix[row][column] );		//print each element of array
			}
			
			System.out.println();		//new line to organize array elements
		}
	
	}
	
	public static double sumMatrix( int[][] m )		//sumMatrix method with passed parameter
	{
		int sum = 0;		//declare sum
		
		for ( int row = 0; row < m.length; row++ )		//loop rows
		{
		
			for ( int column = 0; column < m[row].length; column++ )		//loops columns
			{
				sum += m[row][column];		//add elements to sum
				
			}
			
		}
		return sum;		//return sum value
		
	}
	
}
	