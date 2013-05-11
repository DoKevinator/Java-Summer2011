//kevin do
//userID 1711886
//homework 11.18


import java.io.*;

class ExceptionA extends Exception
{

}

class ExceptionB extends ExceptionA
{

}

public class ExceptionExample
{
	public static void main(String[] args)
	{
		try
		{
			throw new ExceptionA();
		}
	
		catch( Exception e )
		{	
			System.out.print( "Caught ExceptionA\n" );
		}
		
		try
		{
			throw new ExceptionB();
		}
	
		catch( Exception e )
		{
			System.out.print( "Caught ExceptionB\n" );
		}
		
		try
		{
			throw new NullPointerException();
		}
		
		catch( Exception e )
		{
			System.out.print( "Caught NullPointerException\n" );
		}
		
		try
		{
			throw new IOException();
		}
		
		catch( Exception e )
		{
			System.out.print( "Caught IOException\n" );
		}
	}
}
		
		