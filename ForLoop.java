import java.util.Scanner;
class ForLoop 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
		System.out.print("Enter the statring point : ");
		int start = sc.nextInt();
		
		System.out.print("Enter the end point : ");
		int end = sc.nextInt();
		
		for (;start<=end ;start++ )
		{
			System.out.println(start);
		}
	}
}
