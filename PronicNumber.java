import java.util.Scanner;
  class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int n1=0, n2=1, ans;
		
		while (num>0)
		{
			ans=n1*n2;
			if (ans==num)
			{
			   System.out.println("It's a pronic number");
			   break;
			}
		
			else if (ans>num)
			{
				System.out.println("not a pronic number");
				break;
			}
			else{
				n1=n2;
				n2++;
			}
		}	  
	}
}
