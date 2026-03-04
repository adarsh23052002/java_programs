import java.util.Scanner;
class ReverseOfSecondHalfNo 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		int cnt=0;
		for (int i=num ; i!=0 ; i/=10 )
		{
			cnt++;
		}
		if (cnt%2==0)
		{
			int pow=1;
			for (int i=0 ; i<cnt/2 ; i++ )
			{
				pow *=10;
			}
			
			int secondHalf = num%pow;
			num /= pow;
		
		while (secondHalf!=0)
		{
			num = num*10+secondHalf%10;
			secondHalf /=10;
		}
		System.out.println(num);
		}
	}
}
