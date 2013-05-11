//kevin do
//userID 1711886
//homework 9.3
//modify program

public class BasePlusCommissionEmployee
{
	private double baseSalary;
	
	private CommissionEmployee();
	
	public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary )
	{
		commissionEmployee = new CommissionEmployee( first, last, ssn, sales, rate );
		setBaseSalary( salary );
	}
	
	public void setBaseSalary( double salary )
	{
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException( "Base salary must be >= 0.0 " );
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	public double earnings()
	{
		return getBaseSalary() + commissionEmployee.earnings();
	}
	
	public String toString()
	{
		return String.format( "%s %s\n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary", getBaseSalary() );
	}
}