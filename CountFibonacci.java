import java.util.Scanner;
class CountFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		
		int n1=0 , n2=1 , ans , count=0 ;
		
		if(start<end)
		{
			while (n1<=end)
			{
				ans = n1+n2;
				if (n1>=start)
				{
					count++;
				}
				n1=n2;
				n2=ans;
			}
			System.out.println("There are "+count+" fibonacci number between the range");
		}
		else {
			System.out.println("Invalid range");
		}
		
	}
}
