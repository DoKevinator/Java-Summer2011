public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee( String first, String last, String ssn, double sales, double rate, int month, int day, int year )
	{
		super( first, last, ssn, month, day, year );
		setGrossSales( sales );
		setCommissionRate( rate );
	}
	
	public void setCommissionRate( double rate )
	{
		if ( rate > 0.0 && rate < 1.0 )
			commissionRate = rate;
		else
			throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0" );
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	public void setGrossSales( double sales )
	{
		if ( sales >= 0.0 )
			grossSales = sales;
		else
			throw new IllegalArgumentException( "Gross sales must be >= 0.0" );
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}
	
	public String toString()
	{
		return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", "gross sales", getGrossSales(), "commission rate", getCommissionRate() );
	}
}