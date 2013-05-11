public class BirthDate
{
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public BirthDate( int theMonth, int theDay, int theYear )
	{
		month = checkMonth( theMonth );
		day = checkDay( theDay );
		year = theYear;
		
		System.out.printf( "Date object constructor for date%s\n", this );
	}
	
	private int checkMonth( int testMonth )
	{
		if ( testMonth > 0 && testMonth <= 12 )
			return testMonth; 
		else 
			throw new IllegalArgumentException( "month must be 1-12" );
	}
	
	private int checkDay( int testDay )
	{
		if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
			return testDay;
			
		if ( month == 2 && testDay == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ) )
			return testDay;
			
		throw new IllegalArgumentException( "date out-of-range for the specified month and year" );
	}
	
	public String toString()
	{
		return String.format( "%d/%d/%d", month, day, year );
	}
	
	public void setMonth( int newMonth )
	{
		month = checkMonth( newMonth );
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setDay( int newDay )
	{
		day = checkDay( newDay );
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setYear( int newYear )
	{
		year = newYear;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
}