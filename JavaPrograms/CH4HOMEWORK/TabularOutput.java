public class TabularOutput
{
	public static void main(String[] args)
	{
		int N = 1;
		
		System.out.printf( "%-10s%-10s%-10s%-10s\n", "N", "10*N", "100*N", "1000*N");
		
		while ( N <= 5 )
			{
				System.out.printf( "%-10d%-10d%-10d%-10d\n", N, 10*N, 100*N, 1000*N);
				N += 1;
				
				
			}
		
	}
} 