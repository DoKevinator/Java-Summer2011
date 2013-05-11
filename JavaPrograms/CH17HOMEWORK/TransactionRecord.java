//kevin do
//userID 1711886
//homework 17.5A


public class TransactionRecord
{
	private static int accountNumber;			//declare global variables
	private static double transactionAmount;
	
	public void setAccNum ( int newAccNum )		//set account number method
	{
		accountNumber = newAccNum;
	}
	
	public int getAccNum ()				//get account number method
	{
		return accountNumber;
	}
	
	public void setTransaction( double newTransaction )			//set transaction
	{
		transactionAmount = newTransaction;
	}
	
	public double getTransaction()				//get transaction
	{
		return transactionAmount;
	}
}
		