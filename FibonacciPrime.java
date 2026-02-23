import java.util.Scanner;
class FibonacciPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		
		int n1=0,n2=1,ans;
		while (true)
		{
			ans=n1+n2;
			if (n1==num)
			{
		        int den = 2;
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
			 System.out.println("It's a fibo prime");
		      }
		   else{
			 System.out.println("It's a fibo but not a prime");
		     }
			 break;
			} 
		else if (n1>num)
		{
			System.out.println("not a fibo");break;
		}	 
		else{
			n1=n2;
			n2=ans;
		   }  
		
		} 
	}
}
