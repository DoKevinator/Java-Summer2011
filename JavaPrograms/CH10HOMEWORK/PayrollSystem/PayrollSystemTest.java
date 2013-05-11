import java.util.Calendar;

public class PayrollSystemTest
{
	private static BirthDate birthday;
	
	java.util.Calendar calendar = java.util.Calendar.getInstance();

	public static void main(String[] args)
	{
		SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00, 2, 3, 1981 );
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40, 8, 25, 1976 );
		
		CommissionEmployee commissionEmployee = new CommissionEmployee( "Sue", "Jones", "333-33-3333", 10000, 0.6, 4, 14, 1986 );
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", 5000, .04, 300, 5, 9, 1988 );
		
		System.out.println( "Employees processed individually:\n" );
		
		if ( java.util.Calendar.MONTH == birthday.getMonth() )
		{
			System.out.printf( "%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings() + 100 );
			System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings() + 100 );
			System.out.printf( "%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings() + 100 );
			System.out.printf( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings() + 100 );
		}
		else
		{
			System.out.printf( "%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings() );
			System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings() );
			System.out.printf( "%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings() );
			System.out.printf( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings() );
		}
		
		Employee[] employees = new Employee[ 4 ];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.println( "Employees processed polymorphically: \n" );
		
		for ( Employee currentEmployee : employees )
		{
			System.out.println( currentEmployee );
			
			if ( currentEmployee instanceof BasePlusCommissionEmployee )
			{
				BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentEmployee;
				
				employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
				
				System.out.printf( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
				
				System.out.printf( "earned $%,.f\n\n", ((BasePlusCommissionEmployee)currentEmployee).earnings() );				
				
			}
		
		
		}
		
		for ( int j = 0; j < employees.length; j++ )
			System.out.printf( "Employee %d is a %s\n", j, employees[j].getClass().getName() );
		
	}
}