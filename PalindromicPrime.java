import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number :");
		int num =sc.nextInt();
		
		int den=2;
		
		while (den<=num/2)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if (den>num/2)
		{
			int rev =0;
			for (int i=num; i!=0 ; i/=10 )
			{
				rev=rev*10+(i%10);
			}
			if (rev==num)
			{
				System.out.println("It's a palindromic prime");
			}
			else{
				System.out.println("It's a prime but not palindrome");
			  }
		}
		else{
			System.out.println("It's not a prime");
		}
	}
}	
		
		/* while (temp!=0)
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
} */
