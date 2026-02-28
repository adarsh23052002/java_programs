import java.util.Scanner;
class RangeOfNeon 
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		
		while (start<=end)
		{
			int sq = start*start;
			int sum=0;
			
			while (sq!=0)
			{
				sum += sq%10;
				sq /=10;
			}
			if (start==sum)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
