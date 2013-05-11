//kevin do
//userID 1711886
//homework 17.5C



import java.util.Scanner;			//import scanner for input
import java.util.Formatter;			//import scanner to save to file
import java.io.FileNotFoundException;		//filenotfoundexception for saving files

public class EnterAccountInfo
{
	private static int enteredInput;
	private static boolean Exit;
	private static int AccountNumber;				//delcare all variables
	private static String Name;
	private static double balance;
	private static double transaction;
	private static Formatter outputOldMast;
	private static Formatter outputTransaction;
	
	public void openFile()			//opens the file
	{
		try
		{
			outputOldMast = new Formatter( "oldmast.txt" );		//opens oldmast.txt
			outputTransaction = new Formatter( "trans.txt" );		//opens trans.txt
		}
		catch( FileNotFoundException fileNotFoundExcepton )			//filenotfoundexception incase the file does not exist
		{
			System.err.println( "Error opening or creating the file." );
			System.exit( 1 );								//exits
		}
	}
	
	public void addRecords()			//adds the records inputted into file
	{
		Scanner input = new Scanner( System.in );			//scanner object for input
		AccountRecord record = new AccountRecord();			//record object to copy files
		TransactionRecord transrecord = new TransactionRecord();		//transrecord object to copy files to trans.txt
		
		while( Exit = false )				//loops
		{
			System.out.print( "Enter 1 to input account information.\nEnter 0 to exit: ");
			enteredInput = input.nextInt();				//prompts user for input
			
			if ( enteredInput == 1 )	//if 1, enter acc info	
			{
				Exit = false;
				
				System.out.print( "Enter your account number: " );
				record.setAccount( input.nextInt() );			//enter acc number
				
				System.out.print( "Enter your first name: ");		//enter first name
				record.setFirstName( input.next() );
				
				System.out.print( "Enter your last name: " );			//enter last name
				record.setLastName( input.next() );
				
				System.out.print( "Enter your account balance: " );			//enter balance	
				record.setBalance( input.nextDouble() );
				
				System.out.print( "Enter your transaction amount: ");		//enter transaction amount
				transrecord.setTransaction( input.nextDouble() );
			}
			else if( enteredInput == 0 )			//if 0, exit program
			{
				System.out.print( "Exiting. Thank you and have a good day." );
				Exit = true;
			}
				
			outputOldMast.format( "%d %s %s %.2f\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance() );			//pass the object all the info to copy into file to save
			outputTransaction.format( "%d %.2f\n", record.getAccount(), transrecord.getTransaction() );													//pass the object all the info to copy into tile to save
		}

	}
	
	public void closeFile()			//close the file
	{
		if ( outputOldMast != null )
			outputOldMast.close();			//close oldmast.txt
			
		if ( outputTransaction != null )
			outputTransaction.close();			//close trans.txt
	}
}
			