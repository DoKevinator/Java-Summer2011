//kevin do
// userID 1711886
//homework 8.17


public enum Cell
{

    X("X"),
	O("O"),				//enum variables used
	EMPTY(" ");
	
	private String value;		//declare value variable
	
	Cell()					//constructor
	{
		value = " "; 
	}

	Cell(String newValue)
	{								//constructor
		value = newValue;
	}	
	
	
	public String getValue()
	{							//get method value
		return value;
	}
	
	public void setValue(String newValue )
	{											//set method value
		value = newValue;
	}
	
}