public class Kangaroo extends Animal
{
	private String name;
	
	public Kangaroo( String name )
	{	
		super( 2 );
		this.name = name;
	}
	
	public Kangaroo()
	{	
		this( "" );
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void play()
	{
		System.out.println( name + " likes to jump around to play." );
	}
	
	public void eat()
	{
		System.out.println( "Kangaroos eat veggies." );
	}
	
}