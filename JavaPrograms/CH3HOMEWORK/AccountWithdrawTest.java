//kevin do
//userID 1711886
//chapter 3.14



import java.util.Scanner;	//import scanner class

public class AccountWithdrawTest
{
	public static void main(String[] args)			//main method	
	{
		AccountWithdraw account1 = new AccountWithdraw( 50.00 );
		AccountWithdraw account2 = new AccountWithdraw( 00.00 );
		
		System.out.printf("account1 balance: %.2f\n", account1.getBalance() );					//prompt user	
		
		System.out.printf("account2 balance: %.2f\n\n", account2.getBalance() );
		
		
		Scanner input = new Scanner( System.in );   		//new scanner object
		
		
		
		
		double withdrawAmount;				//delcare variable
		

		
		System.out.print( "Enter withdraw amount for account1: " );
		withdrawAmount = input.nextDouble();
		System.out.printf( "\nsubtracting %.2f to account1 balance\n\n", withdrawAmount );
		account1.credit( withdrawAmount );
	
	
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );			//displays info entered in by user
		System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
		
		System.out.print(" Enter withdraw amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf( "\nsubtracting %.2f to account2 balance\n\n", withdrawAmount );
		account2.credit( withdrawAmount );
		

		System.out.printf( "account1 has balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 has balance: $%.2f\n", account2.getBalance() );
		
		
		
	}
}