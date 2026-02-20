import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number :");
		int num =sc.nextInt();
		
		int den=2, rev=0, temp=num;
		
		while (den<num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		
		while (temp!=0)
		{
			int last = temp%10;
			rev= rev*10+last;
			temp /=10;
		}
		
		if (den==num && rev==num)
		{
			System.out.println("Number is a palindromic prime");
		}
		else{
		System.out.println("It's not a Palindromic prime number");
		}
	}
}
