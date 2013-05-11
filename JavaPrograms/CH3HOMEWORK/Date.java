//userID 1711886
//kevin do
//chapter3.15




public class Date			//no main
{
	private int day;
	private int month;						//declare variables
	private int year;
	private String displayDate;
	
	public Date( int x, int y, int z)
	{ 
		day = x;
		month = y;					//parameters used in method
		year = z;
	}
											//set and get methods listed below.
	public void displayDate()
	{
		System.out.printf( "The date is: %d/%d/%d\n", month, day, year);
		
	}
	
	
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	

	
	public void setDay(int newDay)
	{
		day = newDay;
	}
	
	public void setMonth(int newMonth)
	{
		month = newMonth;
	}
	
	public void setYear(int newYear)
	{
		year = newYear;
	}
}