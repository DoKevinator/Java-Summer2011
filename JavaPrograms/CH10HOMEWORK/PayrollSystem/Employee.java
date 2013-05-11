public abstract class Employee
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private BirthDate birthday;
	
	public Employee( String first, String last, String ssn, int month, int day, int year )
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		birthday.setMonth( month );
		birthday.setDay ( day );
		birthday.setYear( year );
	}
	
	public BirthDate getBirthday()
	{
		return birthday;
	}
	
	public void setFirstName( String first )
	{
		firstName = first;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName( String last )
	{
		lastName = last;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setSocialSecurityNumber( String ssn )
	{
		socialSecurityNumber = ssn;
	}
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	public String toString()
	{
		return String.format( "%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber() );
	}
}