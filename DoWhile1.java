import java.util.Scanner;
class DoWhile1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start point : ");
		int start = sc.nextInt();
		
		System.out.print("Enter the end point : ");
		int end = sc.nextInt();
		
		do
		{ 
			System.out.println(start);
			++start;
		}
		while (start<=end);
	}
}
