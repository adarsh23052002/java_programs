import java.util.Scanner;
class PalindromicFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int n1=0,n2=1,ans;
		
		while (true)
		{
			ans=n1+n2;
			if (n1==num)
			{
				int rev=0;
				for (int i=num; i!=0 ; i/=10 )
				{
				   rev=rev*10+(i%10);
				}
				if (rev==num)
				{
					System.out.println("Its a palindromic fibonacci");
					
				}
				else{
					System.out.println("It's a fibonacci but not palindrome");
				}
				break;
		   }
		else if (n1>num)
		{
			System.out.println("It's not a fibonacci");
			break;
		}	
		else{
		   n1=n2;
		   n2=ans;
		}
	}
 }
}
