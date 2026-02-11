import java.util.Scanner;
class DoWhile3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Which number's Table you want? : ");
		int num =sc.nextInt();
		
		int times = 1;
		do
		{
			System.out.println(num+" * "+times+" = "+(num*times));
			times++;
		}
		while (times<=10);
	}
}
