import java.util.Scanner;
class FindDigit  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long data = 899951697623l;
		
		System.out.println("Which digit you want to find? : ");
		int find = sc.nextInt();
		
		while (data>0)
		{
			int last = data%10;
			if (last==find)
			{ 
				System.out.println(find+" is present in the number ");
				return;
			}
			data /=10;
		}
		System.out.println(find+" is not there in the number ");
		
	}
}
