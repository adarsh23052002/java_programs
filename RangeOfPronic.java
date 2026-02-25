import java.util.Scanner;
class RangeOfPronic
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the start :");
		int start = sc.nextInt();
		System.out.print("Enter the end :");
		int end=sc.nextInt();
		
		for (int i=0 ; i*(i+1)<=end ; i++ )
		{
			if (i*(i+1)>=start)
			{
				System.out.println(i*(i+1));
			}
		}
	}
}
