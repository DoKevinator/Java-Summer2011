//userID 1711886
//kevin do
// chapter 3.17


import java.util.Scanner;				//import scanner class

public class HealthProfileTest			//class healthprofiletest
{
	public static void main(String[] args)
		{
			HealthProfile patient = new HealthProfile("kevin", "do", 5, 6, 2001, 17, 60, 150);				//constructor with parameters
			
			Scanner input = new Scanner( System.in );		//new scanner object
			
			 String firstname;
			 String lastname;
			 String day;
			 String month;					//declare variables
			 int year;
			 int age;
			 int height;
			 double weight;
			 double maxheartrate;
			 double targetheartrate;
			 double bmi;


			
			System.out.println("Hello, welcome to HealthProfile. Here, you can add and view a person's health profiles." );
			
			System.out.printf( "Enter first name of patient: ");
				patient.setFirstname( input.next() );					//prompts user to enter in information
			System.out.printf( "Enter last name of patient: ") ;
				patient.setLastname( input.next() );
			System.out.printf( "Enter month of birth: ");
				patient.setMonth( input.nextInt() );
			System.out.printf( "Enter day of birth: ");
				patient.setDay( input.nextInt() );
			System.out.printf( "Enter year of birth: ");
				patient.setYear( input.nextInt() );
			System.out.printf( "Enter height of patient in inches: ");
				patient.setHeight( input.nextInt() );
			System.out.printf( "Enter weight of patient in pounds: ");
				patient.setWeight( input.nextDouble() );
																							//displays output of age, maxheartrate, target heart rate, and bmi
			System.out.printf("Age of patient: %d\n", patient.getAge() );
			System.out.printf("Maximum heart rate of patient: %d\n", patient.getMaxheartrate() );
			System.out.printf("Target heart rate of patient: %f to %f\n", patient.getTargetheartrateL(), patient.getTargetheartrateH() );
			System.out.printf( "BMI of patient: %f\n", patient.getBmi() );
			
			System.out.println("BMI VALUE CHART");
			System.out.println("------------------------------------");
			System.out.printf(%-17s%-17s, "UNDERWEIGHT: ", "less than 18.5");
			System.out.printf(%-17s%-17s, "NORMAL: ", "between 18.5 and 24.9" );
			System.out.printf(%-17s%-17s, "OVERWEIGHT: ", "between 25 and 29.9");
			System.out.printf(%-17s%-17s, "OBESE: ", "30 or greater" );
		}
}
			
			
			
			
			