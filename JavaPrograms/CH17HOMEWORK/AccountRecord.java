//kevin do
//userID 1711886
//homework 17.5B


public class AccountRecord		//public class
{
	private int account;
	private String firstName;		//declare variables
	private String lastName;
	private double balance;
	
	public AccountRecord()
	{
		this( 0, "", "", 0.0 );		//4 arguement constructor
	}
	
	public AccountRecord( int acct, String first, String last, double bal )		//constructor with parameters
	{
		setAccount( acct );
		setFirstName( first );		//call methods
		setLastName( last );
		setBalance( bal );
	}
	
	public void setAccount( int acct )		//set account method
	{
		account = acct;
	}
	
	public int getAccount()
	{									//get account method
		return account;
	}
	
	public void setFirstName( String first )
	{											//set first name method
		firstName = first;
	}
	
	public String getFirstName()			//get first name method
	{
		return firstName;
	}
	
	public void setLastName( String last )			//set last name method
	{
		lastName = last;
	}
	
	public String getLastName()			//get last name method
	{
		return lastName;
	}
	
	public void setBalance( double bal )			//set balance method
	{
		balance = bal;
	}
	
	public double getBalance()						//get balance method
	{
		return balance;
	}
	
	public void combine( TransactionRecord txnRecord )		//combine method to add transactionrecord object and account record object
	{
		balance += txnRecord.getTransaction();
	}
}