import java.util.Scanner;
class NthPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth term : ");
		int n = sc.nextInt();
		
		int start=2;
		int cnt =0;
		while (true)
		{ 
			int den =2;
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
				cnt++;
			}
			if (cnt==n)
			{
				System.out.println(start);
				break;
			}
			start++;
		}
	}
}
