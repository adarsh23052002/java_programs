import java.util.Scanner;
class Absolute1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		
		int op =
			(num<0)?
			(num*-1):
			(num);
		System.out.println(op);
	}
}
