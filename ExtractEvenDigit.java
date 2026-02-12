import java.util.Scanner;
class ExtractEvenDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		while (num>0)
		{
			int lastNum=num%10;
			if (lastNum%2==0)
			{
				System.out.println(lastNum);
			}
			num /=10;
		}
	}
}
