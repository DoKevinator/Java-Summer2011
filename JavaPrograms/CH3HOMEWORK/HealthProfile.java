//UserID 1711886
//kevin do
//chapter3.17



public class HealthProfile
{
	private String firstname;
	private String lastname;
	private int day;
	private int month;
	private int year;
	private int age;						//delcare variables
	private int height;
	private double weight;
	private String gender;
	private double maxheartrate;
	private double targetheartrateH;
	private double targetheartrateL;
	private double bmi;
	
	public HealthProfile(String FirstName, String LastName, int Day, int Month, int Year, int Age, int Height, double Weight)
	{
		firstname = FirstName;
		lastname = LastName;
		day = Day;						// parameters to be passed by constructor.
		month = Month;
		year = Year;
		age = Age;
		height = Height;
		weight = Weight;

	}
	
	public String getFirstname()
	{
		return firstname;								//methods of all paramenters listed below 
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setFirstname(String newFirstname)
	{
		firstname = newFirstname;
	}
	
	public void setLastname( String newLastname)
	{
		lastname = newLastname;
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
	
	public int getAge()
	{
		return 2011 - year;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight( int newHeight )
	{
		height = newHeight;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight( double newWeight)
	{
		weight = newWeight;
	}
	
	public int getMaxheartrate()
	{
		return 220 - age;
	}
	
	public void setMaxheartrate( int newMaxheartrate)
	{
		maxheartrate = newMaxheartrate;
	}
	
	public double getTargetheartrateL()
	{
		return (220 - age) * 0.5;
	}
	
	public double getTargetheartrateH()
	{
		return (220 - age) * 0.85;
	}
	
	public void setTargetheartrateL( double newTargetheartrateL )
	{
		targetheartrateL = newTargetheartrateL;
	}
	
	public void setTargetheartrateH( double newTargetheartrateH )
	{
		targetheartrateH = newTargetheartrateH;
	}
	
	public double getBmi()
	{
		return (weight * 703)/(height * height);
	}
	
	public void getBmi(double newBmi)
	{
		bmi = newBmi;
	}
		
		
		
		
		
		
		
	

}