import java.util.Scanner;
class BillingSystem
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Your total Bill amount is : ");
		double bill = sc.nextDouble();
		
		double finalAmount = bill;
		
		System.out.println();
			
		if (bill>499.0)
		{
			System.out.println("You got 10% discount on your total bill");
			finalAmount = bill-(bill*10/100);
		}
		
		
		System.out.println("your final bill amount is : "+finalAmount); 
		
	}
}