import java.util.Scanner;
class ForLoop2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Which number's table you want : ");
		int num = sc.nextInt();
		
		for (int times = 1;times<=10 ;++times )
		{
			System.out.println(num+" * "+times+" = "+(num*times));
		}
	}
}
