import java.util.Scanner;
class TwinPrime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number 1 :");
		int num1= sc.nextInt();
		System.out.print("Enter the number 2 :");
		int num2 = sc.nextInt();
		
		if (num1-num2 ==2 || num2-num1 ==2)
		{
			int den=2;
			while (den<num1)
			{
				if (num1%den==0)
				{
					break;
				}
				den++;
			}
			if (den==num1)
			{
				int den1 =2;
				while (den1<num2)
				{
					if (num2%den1==0)
					{
						break;
					}
					den1++;
				}
				if (den1==num2)
				{
					System.out.println("Twin Prime");
				}
				else{
					System.out.println("Not a twin prime");
				}
			}else {
				System.out.println("this is not a twin prime");
			}
		}else {
			System.out.println("Difference is not 2");
		}
	}
}	
		