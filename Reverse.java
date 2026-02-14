import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		
		int temp = num;
		int rev = 0;
		
		while(temp!=0)
		{
			int last= temp%10;
			rev = rev*10+last;
			temp /= 10;
		}
		if (num==rev)
		{
			System.out.println("It's a palindrom");
		}
		else {
			System.out.println("It's not a palindrom");
		}
		System.out.println(rev);
	}
}
