public class TestAnimals {
  public static void main(String[] args) {
    Fish f = new Fish();
    Animal c = new Cat("Fluffy");
  	//Animal a = new Fish();
   	//Animal e = new Spider();
    Spider e2 = new Spider();
    Pet p = new Cat();
    Kangaroo k = new Kangaroo( "kevin" );

    // Demonstrate different implementations of an interface
    f.play();
    //c.play();
    c.eat();
    System.out.println();

    // Demonstract virtual method invocation
    e2.eat();
    e2.walk();
    System.out.println();

    // Demonstrate calling super methods
    f.walk();
    f.eat();
    System.out.println();
    
    //c.kill();
    System.out.println();
    e2.die();
    System.out.println();
    
    k.eat();
    k.play();
    c.walk();
  }
}
