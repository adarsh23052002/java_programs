import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		 if (num%10==7 || num%7==0)
		 {
			 System.out.println("It's a Buzz number ");
		 }
		 else{
			System.out.println("It's not a buzz number");
		 }
	}
}
