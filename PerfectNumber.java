import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int den = 1;
		int sum = 0;
		
		while (den<=num/2)
		{
			if (num%den==0)
			{
				sum += den;
			}
			den++;
		}
	   if (sum==num)
	   {
		   System.out.println("It is a perfect number");
	   }
	   else{
		System.out.println("It's not a perfect number");
	   }
	}
}
