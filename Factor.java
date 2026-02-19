import java.util.Scanner;
class Factor 
{
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int den = 1;
		
		while (den<=num/2)
		{
			if (num%den==0)
			{
				System.out.print(den);
			}
			den++;
		}
			System.out.print(num);
	}
}
