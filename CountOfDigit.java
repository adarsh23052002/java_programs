import java.util.Scanner;
class CountOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int count=0;
		
		while (num>0)
		{
		  int lastNum = num%10;
		  count++;
		  num /=10;
			
		}
		System.out.println(count);
	}
}
