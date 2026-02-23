import java.util.Scanner;
class Prime1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		
		if (num<=1)
		{
			System.out.println("its not prime ");
		}
		else 
		{
			int den = 2;
			while (den<=num/2)
			{
				if (num%den==0)
				{
					break;
				}
				den++;
			}
			if (den>num/2)
			{
				System.out.println("its a prime");
			}
			else{
				System.out.println("not prime");
			}
		}	
	}
}
