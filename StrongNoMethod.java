import java.util.Scanner;
class StrongNoMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		if (isString(num))
		{ 
			System.out.println("Its a strong number");
		}else{
		   System.out.println("Not a Stromg number");
		}
	}
	
	public static boolean isString(int num)
	{
		int sum=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			int last=i%10;
			sum=sum+factorial(last);
		}
		return num==sum;
	}
	
	public static int factorial(int num)
	{
		int fact=1;
		while (num>0)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
}
