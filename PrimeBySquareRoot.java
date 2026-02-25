import java.util.Scanner;
class PrimeBySquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		
		if (num==2)
		{
			System.out.println("It's a prime");
		}
		else if (num==1 || num%2==0)
		{
			System.out.println("It's not a prime");
		}
		else{
			int i =3;
			for (; i*i<=num ; i+=2 )
			{
				if (num%i==0)
				{
					break;
				}
			}
			if (i*i>num)
			{
				System.out.println("It's a prime");
			}
			else{
				System.out.println("It's not a prime");
			}
		}
	}
}
