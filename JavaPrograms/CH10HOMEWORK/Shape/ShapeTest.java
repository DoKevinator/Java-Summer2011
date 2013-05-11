public class ShapeTest
{
	public static void main(String[] args )
	{
		Circle circle = new Circle( 2 );
		
		Square square = new Square( 2 );
		
		Triangle triangle = new Triangle( 2, 2 );
		
		Sphere sphere = new Sphere( 2 );
		
		Cube cube = new Cube( 2 );
		
		Tetrahedron terahedron = new Tetrahedron( 2, 2, 3 );
		
		Shape[] shapes = new Shape[ 6 ];
		
		shapes[0] = circle;
		shapes[1] = square;
		shapes[2] = triangle;
		shapes[3] = sphere;
		shapes[4] = cube;
		shapes[5] = tetrahedron;
		
		System.out.printf( "Two dimensional shape circle area: %d\n", circle.getArea() );
		System.out.printf( "Two dimensional shape square area: %d\n", square.getArea() );
		System.out.printf( "Two dimensional shape triangle area: %d\n", triangle.getArea() );
		
		System.out.printf( "Three dimensional shape sphere volume: %d\n", sphere.getVolume() );
		System.out.printf( "Three dimensional shape cube volume: %d\n", cube.getVolume() );
		System.out.printf( "Three dimensional shape tetrahedron: %d\n", tetrahedron.getVolume() );
	}
}