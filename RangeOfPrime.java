import java.util.Scanner;
class RangeOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		
		while (start<=end)
		{
			int den=2;
			while (den<start)
			{
				if (start%den==0)
				{
					break;
				}
				den++;
			}
			if (den==start)
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
}
