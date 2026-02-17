import java.util.Scanner;
class CheckSumProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		System.out.println();
		
		int num = number;
		int sum = 0;
		int pro = 1;
		
		while (num>0)
		{ 
			int last = num%10;
			sum = sum+last;
			num /=10;
		}
	
		
		for (int data=number ; data>0 ; data /= 10 )
		{
			int last = data%10;
			pro = last*pro;
		}
		
		
		if (sum==pro)
		{ 
			System.out.println("Sum & Product of "+number+" is same as : "+sum);
		}
		else{
			System.out.println("Sum & Product of "+number+" is different. ");
		}
	}
}
