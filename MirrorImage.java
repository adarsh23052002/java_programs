import java.util.Scanner;
class MirrorImage 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int cnt=0;
		for (int i=num ; i!=0 ; i/=10 )
		{
			cnt++;
		}
		if (cnt%2==0)
		{
		  int rev=0;
		  for (int k=0; k<cnt/2 ;k++ )
		  {
			  int last = num%10;
			  rev= rev*10+last;
		      num/=10;
		  }
		   if (rev==num)
		   {
			  System.out.println("It's a mirror image"); 
		   }
		   else{
			System.out.println("Not a mirror image");
		   }
		}
		else{
			System.out.println("Invalid input");
		}
	}
}
