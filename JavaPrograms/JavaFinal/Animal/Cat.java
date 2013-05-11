public class Cat extends Animal implements Pet {
  private String name;

  public Cat(String name) 
  {
    super(4);
    this.name = name;
  }
  
  public Cat() 
  {
    this("");
  }

  public void setName(String name) 
  {
    this.name = name;
  }
  
  public String getName() 
  {
    return name;
  }
  
  public void play() 
  {
    System.out.println(name + " likes to play with string.");
  }

  public void eat() 
  {
    System.out.println("Cats like to eat spiders and mice.");
  }
  
  public void kill()
  {
  	System.out.print( name + " killed the spider... MUHAHAHAHHAHAHAA!!!" );
  }
}
