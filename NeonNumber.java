import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		
		int sq=num*num;
		int sum=0;
		for (int i=sq ; i!=0 ; i/=10 )
		{
			sum += (i%10);
		}
		if (num==sum)
		{
			System.out.println("It is a neon number");
		}
		else{
			System.out.println("It is not a neon number");
		}
	}
}
