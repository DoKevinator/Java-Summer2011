//withdraws money from a bank account.
//kevin do
//userID 1711886



public class AccountWithdraw			//method without main
{
	private double balance;				//delcare variable

	
	public AccountWithdraw ( double initialBalance ) 
	{
		if ( initialBalance > 0.0 )					
			balance = initialBalance;
			
		
			
	}
	
	public void credit ( double amount )				//if then statement if debit exceeds balance
	{
		if ( balance < amount )
			System.out.printf( "Debit amount exceeded account balance of $%.2f\n", balance );
			
			
		
		else balance = balance - amount; 
		

	}
	
	
	public double getBalance()		//method
		
		
	{
		return balance;
	}
	
	
	
}
