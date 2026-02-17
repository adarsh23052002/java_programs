import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		
		System.out.println("Enter the power : ");
		int power = sc.nextInt();
		
		int result = 1;
		
		
     /* int raise = power ;
		while (raise>0)
		{
			result = result*base;
			raise--;
		}
		
		// OR
	*/
	
		for (int i=0;power>i ;i++ )
		{
			result = result*base;
		}
		
		System.out.println(base+"^"+power+" = "+result);
	}
}
