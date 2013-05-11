//calculates average accelertaion form initial and final velocity and time.
//average accel = (V1-V2)/t

import java.util.Scanner;

public class AverageAcceleration
{
	public static void main(String[] args)
	{
		System.out.println("Hello, this program will calculate average acceleration with the input of initial velocity, final velocity, an time. ");
		
		float velocity1;
		float velocity2;
		float time; 
		float avgacceleration;
		
		Scanner input = new Scanner( System.in ); 
		
		System.out.printf("Enter initial velocity in m/s: ");
		velocity1 = input.nextFloat();
		
		System.out.printf("Enter final velocity in m/s: ");
		velocity2 = input.nextFloat();
		
		System.out.printf("Enter time in seconds: ") ;
		time = input.nextFloat();
		
		avgacceleration = (velocity2 - velocity1) / time;
		
		System.out.printf( "Average acceleration is %f\n ", avgacceleration );
	}
}