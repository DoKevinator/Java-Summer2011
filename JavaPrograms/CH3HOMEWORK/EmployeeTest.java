//kevin do
//userID 1711886
//chapter 3.12



import java.util.Scanner;				//import scanner class

public class EmployeeTest		
{
	public static void main(String[] args)			//main method	
		{
			Employee employee1 = new Employee() ;		//create new objects
			Employee employee2 = new Employee() ;
			
			Scanner input = new Scanner( System.in );			//new scanner object
			
			String firstname;
			String lastname;
			double monthlysalary;		//declare variables
			String info;
			

			
			System.out.printf( "Hello, welcome to Employee Information.\n" );  				//prompts user of what this program does	
			
			System.out.printf( "Enter first name of employee1: ");
				employee1.setFirstname( input.next() );
			System.out.printf( "Enter last name of employee1: ");				//prompts user to enter in information
				employee1.setLastname( input.next() );
			System.out.printf( "Enter monthly salary of employee1: ");
				employee1.setMonthlysalary( input.nextDouble() );
				
				double yearlysalary = employee1.getMonthlysalary() * 12;			//yearly salary equation
			
			System.out.printf( "First name: %s\nLast name: %s\n", employee1.getFirstname(), employee1.getLastname() );
			System.out.printf( "Monthly Salary: %s\nYearly Salary: %s\n", employee1.getMonthlysalary(), yearlysalary );
			employee1.setMonthlysalary( employee1.getMonthlysalary() * 1.1 );
			
				yearlysalary = employee1.getMonthlysalary() * 12;
			System.out.printf( " New Monthly Salary after 10 percent raise: %s\nNew Yearly Salary after 10 percent raise: %s\n", employee1.getMonthlysalary(), yearlysalary );
			
			
			
			

			
			System.out.printf( "Enter first name of employee2: ");
				employee2.setFirstname( input.next() );
			System.out.printf( "Enter last name of employee2: ");
				employee2.setLastname( input.next() );
			System.out.printf( "Enter monthly salary of employee2: ");
				employee2.setMonthlysalary( input.nextDouble() );					//prompts user to enter info for employee2
				
				yearlysalary = employee1.getMonthlysalary() * 12;
			
			System.out.printf( "First name: %s\nLast name: %s\n", employee2.getFirstname(), employee2.getLastname() );
			System.out.printf( "Monthly Salary: %s\nYearly Salary: %s\n", employee2.getMonthlysalary(), yearlysalary );
			employee1.setMonthlysalary( employee1.getMonthlysalary() * 1.1 );
			
				yearlysalary = employee2.getMonthlysalary() * 12;
			System.out.printf( " New Monthly Salary after 10 percent raise: %s\nNew Yearly Salary after 10 percent raise: %s\n", employee2.getMonthlysalary(), yearlysalary );
			
			
		}
		
}
			