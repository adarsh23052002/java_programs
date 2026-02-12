import java.util.Scanner;
class ExtractDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		while (num>0)
		{
			int lastNum = num%10;
			System.out.println(lastNum);
			num /= 10;
		}
	}
}
